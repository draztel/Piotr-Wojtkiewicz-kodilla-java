package com.kodilla.testing.library;

import java.util.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionReturnList() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("secret of alamo", "john smith", 2008);
        Book book2 = new Book("secretaries and directors", "adam mickiewicz", 2000);
        Book book3 = new Book("secret life of programmers", "steve wolkowitz", 2016);
        Book book4 = new Book("secrets of java", "ian tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("secret")).thenReturn(resultListOfBooks);

        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("secret");

        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int i = 1; i <= booksQuantity; i++) {
            Book theBook = new Book("title" + i, "author" + i, 1970 + i);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionShorterThan3() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testNoBorrowedBooks() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOf0Books = new ArrayList<Book>();
        LibraryUser user1 = new LibraryUser("firstname1", "lastname1", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(user1))
                .thenReturn(listOf0Books);

        List<Book> result = bookLibrary.listBooksInHandsOf(user1);

        assertEquals(0, result.size());
    }

    @Test
    public void test1BorrowedBooks() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOf1Books = new ArrayList<Book>();
        for (int i = 0; i < 1; i++) {
            listOf1Books.add(new Book("title" + i, "author" + i, 2000));
        }
        LibraryUser user1 = new LibraryUser("firstname1", "lastname1", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(user1))
                .thenReturn(listOf1Books);

        List<Book> result = bookLibrary.listBooksInHandsOf(user1);

        assertEquals(1, result.size());
    }

    @Test
    public void test5BorrowedBooks() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOf5Books = new ArrayList<Book>();
        for (int i = 0; i < 5; i++) {
            listOf5Books.add(new Book("title" + i, "author" + i, 2000));
        }
        LibraryUser user1 = new LibraryUser("firstname1", "lastname1", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(user1))
                .thenReturn(listOf5Books);

        List<Book> result = bookLibrary.listBooksInHandsOf(user1);

        assertEquals(5, result.size());
    }
}
