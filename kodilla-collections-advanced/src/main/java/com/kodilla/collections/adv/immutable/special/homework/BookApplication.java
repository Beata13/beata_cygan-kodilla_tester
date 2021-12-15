package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {

     Book book1 =   BookManager.createBook("Harry Potter", "J.K Rowling");
      Book book2 =   BookManager.createBook("W pustyni i w puszczy", "H. Sienkiewicz");
       Book book3 =  BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
      Book book4 =   BookManager.createBook("Harry Potter", "J.K Rowling");

        System.out.println(book1 == book4);
        System.out.println(book1.equals(book4) );

    }
}
