package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import org.junit.Test;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book());

        //When
        MedianAdapter medianAdapter = new MedianAdapter();
     //   int median = medianAdapter.publicationYearMedian(books);
        //Then
      //  assertEquals(0, median);
    }
}
