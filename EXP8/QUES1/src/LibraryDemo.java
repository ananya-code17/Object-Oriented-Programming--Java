// Outer class Library
class Library {

    // Static nested class Book
    static class Book {
        private String title;
        private String author;
        private String ISBN;

        // Constructor to initialize book details
        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        // Method to display book details
        public void displayDetails() {
            System.out.println("Book Details:");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }
    }
}

// Main class to test the functionality
public class LibraryDemo {
    public static void main(String[] args) {
        // Creating an instance of the nested Book class
        Library.Book myBook = new Library.Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");

        // Calling displayDetails() to show book information
        myBook.displayDetails();
    }
}
