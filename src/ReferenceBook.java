public class ReferenceBook extends Book {
    public ReferenceBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public void borrow() {
        throw new UnsupportedOperationException("Reference books cannot be borrowed");
    }

    @Override
    public String toString() {
        return "[REF]" + super.toString();
    }
}
