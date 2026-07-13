import java.util.List;         // the interface
import java.util.ArrayList;
public class Library {
    private List<Book> books;
    public Library(){
        books = new ArrayList<>();

    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }
    public void borrowAll() {
        for (Book b : books) {
            try {
                b.borrow();
                System.out.println("Borrowed: " + b);
            } catch (RuntimeException e) {
                System.out.println("Failed: " + e.getMessage());
            }
        }
    }

}
