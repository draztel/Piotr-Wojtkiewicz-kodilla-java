package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        Library library = new Library("Library");
        for(int i=0; i<10; i++) {
            library.getBooks().add(new Book("title" + i, "author" + i, LocalDate.now().minusYears(i)));
        }

        //creating shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //creating deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        clonedLibrary.getBooks().remove(clonedLibrary.getBooks().iterator().next());

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(9, library.getBooks().size());
        Assert.assertEquals(9, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}
