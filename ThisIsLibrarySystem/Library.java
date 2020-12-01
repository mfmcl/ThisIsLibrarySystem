package ThisIsLibrarySystem;

public class Library {
    private String name;
    private Book book1 = new Book(1, "50 Shades of Grey", "123456789X");
    private Book book2;
    private Reader reader1;
    private Reader reader2;
    public Date dateToday;

    public void setDateToday(Date dateToday) {
        this.dateToday = dateToday;
    }

    public Date getDateToday() {
        return dateToday;
    }

    public static void main(String[] args) {
        Library library = new Library();
        book1.
    }
}

    // TODO: arrays?
    // TODO: reading from csv?
    // TODO: GUI?
