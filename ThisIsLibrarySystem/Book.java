package ThisIsLibrarySystem;

public class Book {
    private String title;
    private int bookID; // TODO: must be > 1
    private String isbn; // TODO: use method from homework
    private boolean isBorrowed; // true if is borrowed, false means book is in the library
    private Reader borrower;
    public static Date dateExpected;
    public static Date dateReturned;

    Book(int bookID, String title) {
        this.bookID = bookID;
        this.title = title;
        this.isbn = generateISBN();
    }

    public String generateISBN() {
        String isbn = "";
        for (int i = 0; i < 9; i++) {
            isbn += (int) (Math.random() * 10);
        }
        int temp = Integer.parseInt(isbn);
        int sum = 0;
        for (int i = 2; i <= 10; i++) {
            int d = temp % 10;
            sum += i * d;
            temp /= 10;
        }        
        if (sum % 11 == 0) isbn += "0";
        else if ( sum % 11 == 1) isbn += "X";
        else isbn += (11 - sum % 11);
        
        return isbn;
    }

    public void get(Reader borrower){
        isBorrowed = true;
        dateExpected = new Date(Library.getDateToday().getDay(), Library.getDateToday().getMonth() + 1, Library.getDateToday().getYear());
        this.borrower = borrower;
    }

    public void returned(){
        isBorrowed = false;
        dateExpected = null;
        dateReturned = Library.dateToday;
    }

    public Date expected() {
        return dateExpected;
    }

    @Override
    public String toString() {
        return "Borrower: " + borrower + "\nIs borrowed: " + isBorrowed + "\nDate expected: " + dateExpected.toString() + "\nBook ID: " + bookID + "\nTitle: " + title + "\nISBN: " + isbn;
    }
    
}
