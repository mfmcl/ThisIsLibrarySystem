package ThisIsLibrarySystem;

import java.util.Scanner;

public class Library {
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

    public int fineCheck(Book book) {
        if (book.getDateExpected().getDay() <= book.getDateReturned().getDay()) {
            fine = 0;
        } else fine = 1;
        return fine;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRESS ENTER TO START PROGRAM");
        sc.nextLine();
        sc.close();
        Library library = new Library();

        // task 1
        System.out.println("Task 1");

        library.setDateToday(5, 5, 2020);

        Reader reader1 = new Reader("Joe", "joemamma@hotmail.com", 1);
        Reader reader2 = new Reader("Jane", "janeee@gmail.com", 2);
        Book book1 = new Book(1, "50 Shades of Grey");
        Book book2 = new Book(2, "Mein Kampf");

        System.out.println("Today's date is " + dateToday.toString());
        System.out.println("\nReader 1: " + reader1.toString());
        System.out.println("Reader 2: " + reader2.toString());
        System.out.println("\n" + book1.toString());
        System.out.println("\n" + book2.toString());

        // task 2
        System.out.println("\nTask 2");

        book1.get(reader1);
        book2.get(reader2);

        // System.out.println("Fines:" + library.checkFines());
        System.out.println(book1.checkFines(book1.getDateReturned(), book1.getDateExpected()));

        library.setDateToday(5, 6, 2020);

        System.out.println("Today's date is " + dateToday.toString());
        System.out.println("\n" + book1.toString());
        System.out.println("\n" + book2.toString());

        // task 3
        System.out.println("\nTask 3");

        book1.returned();

        // System.out.println("Fines:" + library.checkFines());

        library.setDateToday(6, 7, 2020);

        System.out.println("Today's date is " + dateToday.toString());
        System.out.println("\n" + book1.toString());
        System.out.println("\n" + book2.toString());

        // task 4
        System.out.println("\nTask 4");

        book2.returned();

        System.out.println("\n" + book2.toString() + " Returned: " + book2.getDateReturned());

        System.out.println(book2.checkFines(book2.getDateReturned(), book2.getDateExpected()));

        // System.out.println("Fines:" + library.checkFines());


    }
}

    // TODO: arrays?
    // TODO: reading from csv?
    // TODO: GUI?
