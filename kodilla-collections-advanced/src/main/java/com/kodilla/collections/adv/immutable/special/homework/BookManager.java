package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookManager {
    static Set<Book> books = new HashSet<>();

    public static Book createBook(String title, String author) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {

                return book;
            }
        }
        Book book = new Book(title, author);
        books.add(book);
        return book;
    }
}