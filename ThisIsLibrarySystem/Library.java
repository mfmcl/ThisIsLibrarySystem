package ThisIsLibrarySystem;

public class Library {
    private String name;
    private static Book book1 = new Book(1, "50 Shades of Grey");
    private static Book book2 = new Book(2, "Mein Kampf");
    private static Reader reader1 = new Reader("Joe", "joemamma@hotmail.com", 1);
    private static Reader reader2 = new Reader("Jane", "janeee@gmail.com", 2);
    public static Date dateToday = new Date();
    private int fine;

    public void setDateToday(int day, int month, int year) {
        Library.dateToday.setDay(day);
        Library.dateToday.setMonth(month);
        Library.dateToday.setYear(year);
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
        if (Book.dateReturned.getDay()==Book.dateExpected.getDay() && Book.dateReturned.getMonth()==Book.dateExpected.getMonth()) {
            fine=0;
        } else {
            
        }
        return fine;
    }


    public static void main(String[] args) {
        Library library = new Library();
        library.setDateToday(5, 5, 2020);
        
        book1.get(reader1);

        System.out.println("Today's date is " + dateToday.toString());
        System.out.println("\nReader 1: " + reader1.toString());
        System.out.println("\n" + book1.toString());
        System.out.println("\n" + book2.toString());

    }
}

    // TODO: arrays?
    // TODO: reading from csv?
    // TODO: GUI?
