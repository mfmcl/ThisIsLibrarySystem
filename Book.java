public class Book {
    private String title;
    private int bookID; // TODO: must be > 1
    private String isbn; // TODO: use method from homework
    private boolean isBorrowed; // true if is borrowed, false means book is in the library
    private Reader borrower;
    private Date dateExpected;


    Book() {
    }
    
    Book(int bookID, String title, String isbn) {

    }
}
