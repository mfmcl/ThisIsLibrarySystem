package ThisIsLibrarySystem;

import jdk.internal.vm.compiler.libgraal.LibGraalIsolate;

public class Library {
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

        //Returning the book before the expected date
        if (Book.dateReturned.getDay()<=Book.dateExpected.getDay() &&
        Book.dateReturned.getMonth()<=Book.dateExpected.getMonth() &&
        Book.dateReturned.getYear()==Book.dateExpected.getYear() ||
        Book.dateReturned.getDay()>=Book.dateExpected.getDay() &&
        Book.dateReturned.getMonth()<=Book.dateExpected.getMonth() &&
        Book.dateReturned.getYear()==Book.dateExpected.getYear()) {
            fine=0;
        }
        //Returning the book after the expected return date, but within the same calendar month of the expected date
        if (Book.dateReturned.getDay()>Book.dateExpected.getDay() &&
        Book.dateReturned.getMonth()==Book.dateExpected.getMonth() &&
        Book.dateReturned.getYear()==Book.dateExpected.getYear()) {
            fine=15*(Book.dateReturned.getDay()-Book.dateExpected.getDay());
        }
        //Returning the book after the expected return date and the calendar month, but within the same year of the expected date
        if (Book.dateReturned.getMonth()>Book.dateExpected.getMonth() &&
        Book.dateReturned.getYear()==Book.dateExpected.getYear()) {
            fine=500*(Book.dateReturned.getMonth()-Book.dateExpected.getMonth());
        }
        //Returning the book after the expected return date and the year of the return date
        else {
            fine=10000;
        }
        return fine;
}

    public static void main(String[] args) {
        Library library = new Library();
        library.setDateToday(5, 5, 2020);
        
        book1.get(reader1);
        book2.get(reader2);

        System.out.println("Today's date is " + dateToday.toString());
        System.out.println("\nReader 1: " + reader1.toString());
        System.out.println("\n" + book1.toString());
        System.out.println("\n" + book2.toString());

    }
}

    // TODO: arrays?
    // TODO: reading from csv?
    // TODO: GUI?
