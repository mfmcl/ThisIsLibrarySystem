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
    /*
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
    
    System.out.println("ISBN: " + isbn);
    */
}
