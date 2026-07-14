//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static void printSeparator() {
        System.out.println("========================================");
    }
    public static void main(String[] args) {
        Book b= new Book("book","tawba","20000-rr");
        b.borrow();
        try {
            b.borrow();
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println(b);
        System.out.println(b.isAvailable());


        printSeparator();
        System.out.println("E-book test");
        EBook ebook = new EBook("cooking", "Manal Ahmad", "978-01884", "HTTPS:URL");
        System.out.println(ebook);
        ebook.borrow();
        System.out.println("After borrow, available: " + ebook.isAvailable());
        printSeparator();
        System.out.println("Library test");
        Library library = new Library();
        library.addBook(new Book("Effective Java", "Bloch", "978-1"));
        library.addBook(new ReferenceBook("Oxford Dictionary", "Oxford", "978-2"));
        library.addBook(new EBook("Clean Code", "Martin", "978-3", "https://url"));

        library.listBooks();
        printSeparator();
        System.out.println("Attempting to borrow all");
        library.borrowAll();//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text// to see how IntelliJ IDEA suggests fixing it.

    }
}