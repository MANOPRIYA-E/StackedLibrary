public class Main {
    public static void main(String[] args) {
        // Create Library
        Library library = new Library();

        // Add Books
        library.addBook(new Book("Java Basics", "James Gosling"));
        library.addBook(new Book("DSA in Java", "Robert Lafore"));
        library.addBook(new Book("Effective Java", "Joshua Bloch"));

        // Create Users
        User student = new Student("Alice");
        User teacher = new Teacher("Mr. Bob");

        // Show Books
        library.showBooks();

        // Borrow Books
        student.borrow(library.findBook("Java Basics"));
        teacher.borrow(library.findBook("Java Basics")); // already borrowed
        teacher.borrow(library.findBook("Effective Java"));

        // Return Book
        Book javaBook = library.findBook("Java Basics");
        javaBook.returnBook();

        // Show Books after transactions
        library.showBooks();
    }
}
