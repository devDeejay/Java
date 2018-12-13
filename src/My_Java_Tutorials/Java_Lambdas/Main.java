package My_Java_Tutorials.Java_Lambdas;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    // Prior to Java 8, this is how we did things.
    // A lot of event driven programming uses SAMs
    // After Java 8 -> Unknown/Unnamed functions are called Lambdas.
    // They can be used anywhere in place of SAM and are now called as Functional Interfaces.

    public static void usingAnonymousInLineClass() {
        List<Book> books = Books.all();
        Collections.sort(books, new Comparator<Book>() {        // This is an interface
            @Override
            public int compare(Book o1, Book o2) {              // This is a Simple Abstract Method (SAM)
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        for (Book book : books) {
            System.out.println(book.getTitle() + " " + book.getPublicationDate());
        }
    }

    public static void usingLambdasInLineClass() {
        List<Book> books = Books.all();

        // Replacing SAM with Lambda Expression :
        Collections.sort(books, (Book b1, Book b2) -> {
            return b1.getTitle().compareTo(b2.getTitle());
        });

        // Further simplifying Lambda Expression : This 1 liner is called Expression Type Body
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));

        // Can also be further simplified to :
        Collections.sort(books, Comparator.comparing(Book::getTitle));

        for (Book book : books) {
            System.out.println(book.getTitle() + " " + book.getPublicationDate());
        }

        // We have a way to iterate over Collections : Using Consumer
        books.forEach((book -> System.out.println(book)));
    }

    public static void usingMethodReferences() {
        // You can do this by method references
        List<Book> books =  Books.all();
        Collections.sort(books, Comparator.comparing(book -> book.getTitle()));

        // Or

        Collections.sort(books, Comparator.comparing(Book::getTitle));
        books.forEach(book -> System.out.println(book));
    }

    public static void main(String[] args) {
        usingAnonymousInLineClass();
        usingLambdasInLineClass();
    }
}
