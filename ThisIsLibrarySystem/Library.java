package ThisIsLibrarySystem;

public class Library {
    private String name;
    private static Book book1 = new Book(1, "50 Shades of Grey");
    private static Book book2 = new Book(2, "Mein Kampf");
    private static Reader reader1 = new Reader("Joe", "joemamma@hotmail.com", 1);
    private static Reader reader2 = new Reader("Jane", "janeee@gmail.com", 2);
    public static Date dateToday;
    private int fine;

    public void setDateToday(Date dateToday) {
        Library.dateToday = dateToday;
    }

    public static Date getDateToday() {
        return dateToday;
    }

    public int checkFines(){
        Book.dateExpected.getDay();
        Book.dateExpected.getMonth();
        Book.dateExpected.getYear();

        Book.dateReturned.getDay();
        Book.dateReturned.getMonth();
        Book.dateReturned.getYear();
        if (Book.dateReturned.getDay()<=Book.dateExpected.getDay() && Book.dateReturned.getMonth()<=Book.dateExpected.getMonth()) {
            fine=0;
        }if (Book.dateReturned.getDay()==Book.dateExpected.getDay() && Book.dateReturned.getMonth()==Book.dateExpected.getMonth()) {
            
        }
        return fine;
    }


    public static void main(String[] args) {
        Library library = new Library();
        library.setDateToday(5, 5, 2020);
        
        book1.get(reader1);

        System.out.println(reader1.toString());
        System.out.println(book1.toString());
        System.out.println("Today's date is " + dateToday.getDay() + " " + dateToday.getMonth() + " " + dateToday.getYear());

    }
}

    // TODO: arrays?
    // TODO: reading from csv?
    // TODO: GUI?
