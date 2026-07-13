public  class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        if (!available) {
            throw new IllegalStateException("Book Not available");

        }
        available = false;
    }

    public void returnBook() {
        if (available) {
            throw new IllegalStateException("Book is available so its not borrowed");

        }
        available = true;
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + author + " (ISBN: " + isbn + " ) ";
    }


}
