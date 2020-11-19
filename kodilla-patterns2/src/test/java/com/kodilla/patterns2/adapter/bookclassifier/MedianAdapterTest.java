package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTest {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("author1", "title1", 1995, "signature1"));
        bookSet.add(new Book("author2", "title2", 1998, "signature2"));
        bookSet.add(new Book("author3", "title3", 1900, "signature3"));
        bookSet.add(new Book("author4", "title4", 1950, "signature4"));
        bookSet.add(new Book("author5", "title5", 1800, "signature5"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(publicationYearMedian);
        assertEquals(1950, publicationYearMedian);
    }
}
