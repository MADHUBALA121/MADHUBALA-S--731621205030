package mb;

import java.util.ArrayList;
class Book {
    String title;
    String author;
    String isbn;
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();
    void addBook(Book book) {
        books.add(book);
        System.out.println("Books: " + book.title);
    }
    void removeBook(String isbn) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed: " + book.title);
                return;
            }
        }
        System.out.println(isbn + " not found.");
    }
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books");
        } else {
            System.out.println("Books Avaiable:");
            for (Book book : books) {
                book.display();
            }
        }
    }
}

public class Books {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("RAMAYANAM", "KAMBAR", "312527"));
        library.addBook(new Book("TO KILL A MOCKING BIRD", "HARPIE LEE", "54990"));
        library.addBook(new Book("PONNIYIN SELVAN", "KALKI", "98320"));
        System.out.println();
        library.displayBooks();
        System.out.println("After Remove");
        library.removeBook("54990");
        System.out.println();
        library.displayBooks();
    }
}