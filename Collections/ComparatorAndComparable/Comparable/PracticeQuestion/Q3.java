package Collections.ComparatorAndComparable.Comparable.PracticeQuestion;

import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        super();
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public int compareTo(Book o) {
        //return this.title.compareTo(o.title);
        return o.title.compareTo(this.title);
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}

public class Q3 {
    public static void main(String[] args) {
        /**
         * Sort books by number of pages
         * Fields: String title, String author, int pages
         * Sort books by increasing number of pages
         */

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Alchemist", "Paulo Coelho", 198));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 180));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 281));
        books.add(new Book("1984", "George Orwell", 328));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 279));
        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
