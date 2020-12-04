package ThisIsLibrarySystem;

public class Book {
    private String title;
    private int bookID; // TODO: must be > 1
    private String isbn; // TODO: use method from homework
    private boolean isBorrowed; // true if is borrowed, false means book is in the library
    private Reader borrower;
    public Date dateExpected;
    public Date dateReturned;
    private int fine;

    // Constructor of the Book object
    // Assigns the bookID and title of the book
    Book(int bookID, String title) {
        this.bookID = bookID;
        this.title = title;
        this.isbn = generateISBN();
    }

    // ISBN generator
    // Creates a random string in ISBN10 format
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
        if (sum % 11 == 0)
            isbn += "0";
        else if (sum % 11 == 1)
            isbn += "X";
        else
            isbn += (11 - sum % 11);

        return isbn;
    }

    /*
     * The get method Used when a book gets borrowed Marks the book as borrowed
     * Creates the expected date of the book by adding 1 month to today's date
     * Assigns the book it's borrower
     */
    public void get(Reader borrower) {
        isBorrowed = true;
        dateExpected = new Date(Library.getDateToday().getDay(), Library.getDateToday().getMonth() + 1,
                Library.getDateToday().getYear());
        this.borrower = borrower;
    }

    /*
     * The return method Used when a book gets returned Unmarks the book as borrowed
     * Assigns no value to the expected date
     * Sets the date returned as today's date
     */
    public void returned() {
        isBorrowed = false;
        dateReturned = Library.dateToday;
    }

    // Getter method for the expected date of the book
    public Date expected() {
        return dateExpected;
    }

    public Date getDateExpected() {
        return dateExpected;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public void setDateExpected(Date dateExpected) {
        this.dateExpected = dateExpected;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }

    // TODO: FIX with arguments
    public int checkFines() {

            // Returning the book before the expected date
            if (Library.getDateToday().getDay() <= getDateExpected().getDay()
                    && Library.getDateToday().getMonth() <= getDateExpected().getMonth()
                    && Library.getDateToday().getYear() == getDateExpected().getYear()
                    || Library.getDateToday().getDay() >= getDateExpected().getDay()
                            && Library.getDateToday().getMonth() <= getDateExpected().getMonth()
                            && Library.getDateToday().getYear() == getDateExpected().getYear()) {
                fine = 0;
            }
            // Returning the book after the expected return date, but within the same
            // calendar month of the expected date
            if (Library.getDateToday().getDay() > getDateExpected().getDay()
                    && Library.getDateToday().getMonth() == getDateExpected().getMonth()
                    && Library.getDateToday().getYear() == getDateExpected().getYear()) {
                fine = 15 * (Library.getDateToday().getDay() - getDateExpected().getDay());
            }
            // Returning the book after the expected return date and the calendar month, but
            // within the same year of the expected date
            if (Library.getDateToday().getMonth() > getDateExpected().getMonth()
                    && Library.getDateToday().getYear() == getDateExpected().getYear()) {
                fine = 500 * (Library.getDateToday().getMonth() - getDateExpected().getMonth());
            }
            // Returning the book after the expected return date and the year of the return
            // date
            else {
                fine = 10000;
            }
        return fine;
    }

    // toString method -> returns a string representation of the object
    @Override
    public String toString() {
        if (isBorrowed == true) {
            return "Book ID: " + bookID + "\n" + title + "\nISBN: " + isbn + "\nIs borrowed: " + isBorrowed
                    + "\nBorrowed by: " + borrower.getName() + "\nDate Expected: " + dateExpected.toString();
        } else {
            return "Book ID: " + bookID + "\n" + title + "\nISBN: " + isbn + "\nIs borrowed: " + isBorrowed;
        }
    }

}
