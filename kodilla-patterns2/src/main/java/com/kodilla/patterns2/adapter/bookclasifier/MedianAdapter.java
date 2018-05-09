package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {


    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {

       Map<BookSignature, Book> books1 = bookSet.stream()
             .collect(Collectors.toMap(v-> new BookSignature(v.getSignature()), v-> new Book(v.getAuthor(), v.getTitle(), v.getPublicationYear())));
     return medianPublicationYear(books1);
    }
}
