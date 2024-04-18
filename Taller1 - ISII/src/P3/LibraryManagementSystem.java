package P3;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Available Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    scanner.nextLine(); // Consume newline
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;
                case 2:
                    library.displayAvailableBooks();
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    scanner.nextLine(); // Consume newline
                    String searchTitle = scanner.nextLine();
                    Book searchedBook = library.searchBook(searchTitle);
                    if (searchedBook != null) {
                        System.out.println("Book found: " + searchedBook.getTitle() + " by " + searchedBook.getAuthor());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter book title to borrow: ");
                    scanner.nextLine(); // Consume newline
                    String borrowTitle = scanner.nextLine();
                    Book borrowBook = library.searchBook(borrowTitle);
                    library.borrowBook(borrowBook);
                    break;
                case 5:
                    System.out.print("Enter book title to return: ");
                    scanner.nextLine(); // Consume newline
                    String returnTitle = scanner.nextLine();
                    Book returnBook = library.searchBook(returnTitle);
                    library.returnBook(returnBook);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
