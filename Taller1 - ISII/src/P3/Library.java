package P3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(Book book) {
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("You have borrowed " + book.getTitle());
        } else {
            System.out.println("Book not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("You have returned " + book.getTitle());
        } else {
            System.out.println("Book cannot be returned.");
        }
    }
}
