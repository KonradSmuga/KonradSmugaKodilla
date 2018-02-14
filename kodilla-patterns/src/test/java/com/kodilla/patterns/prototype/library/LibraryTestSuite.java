package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given

        Library library = new Library("biblioteka w Krakowie");
        Book book1 = new Book("Wladca pierscieni", "Tolkien", LocalDate.of(1980, 10, 20));
        Book book2 = new Book("Sirmarillion", "Tolkien", LocalDate.of(1977, 9, 15));
        Book book3 = new Book("Droga krolow", "Sanderson", LocalDate.of(2010, 7, 31));
        Book book4 = new Book("Alchemik", "Tolkien", LocalDate.of(1988, 3, 12));

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("biblioteka w Warszawie");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
    }
}