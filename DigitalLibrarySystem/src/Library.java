import java.util.*;

// Using DSA (ArrayList as dynamic array, HashMap for lookup)
public class Library {
    private List<Book> books = new ArrayList<>();
    private Map<String, Book> bookMap = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
        bookMap.put(book.getTitle(), book);
    }

    public void showBooks() {
        System.out.println("\nAvailable Books in Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBook(String title) {
        return bookMap.get(title);
    }
}
