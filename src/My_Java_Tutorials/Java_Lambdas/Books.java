package My_Java_Tutorials.Java_Lambdas;

import java.util.ArrayList;
import java.util.List;

public class Books {
    public static List<Book> all() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Clean Code", "Robert C. Martin", 2008));
        books.add(new Book("Effective Java", "Joshua Bloch", 2008));
        books.add(new Book("JavaFX Essentials", "Mohamed Taman", 2015));

        return books;
    }
}
