public class EBook extends Book {
    private String downloadUrl;

    public EBook(String title, String author, String isbn, String downloadUrl) {
        super(title, author, isbn);
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    @Override
    public void borrow() {

    }

    @Override
    public void returnBook() {

    }

    @Override
    public String toString() {
        return super.toString() + " [ EBook: " + downloadUrl + "]";
    }
}
