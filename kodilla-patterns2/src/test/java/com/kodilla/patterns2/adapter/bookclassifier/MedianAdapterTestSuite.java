package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;


import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        // Given
        Book book1 = new Book("Tolkien", "Hobbit", 2000, "Signature");
        Book book2 = new Book("Tolkien", "Lord of the rings", 2004, "Signature");
        Set<Book> libraryA = new HashSet<>();
        libraryA.add(book1);
        libraryA.add(book2);


        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int publicationYearMedian = medianAdapter.publicationYearMedian(libraryA);

        // Then
        assertEquals(2002, publicationYearMedian);
    }
}

