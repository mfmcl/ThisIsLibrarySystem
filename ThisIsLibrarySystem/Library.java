package ThisIsLibrarySystem;

public class Library {
    private String name;
    private static Book book1 = new Book(1, "50 Shades of Grey", "123456789X");
    private static Book book2 = new Book(2, "Mein Kampf", "123456789X");
    private static Reader reader1 = new Reader("Joe", "joemamma@hotmail.com", 1);
    private static Reader reader2 = new Reader("Jane", "janeee@gmail.com", 2);
    public static Date dateToday = new Date(5, 5, 2020);

    public void setDateToday(Date dateToday) {
        this.dateToday = dateToday;
    }

    public Date getDateToday() {
        return dateToday;
    }

    public static void main(String[] args) {
        Library library = new Library();
        
        book1.get();

        System.out.println(reader1.toString());
        System.out.println(reader2.toString());
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println("Today's date is " + dateToday.getDay() + " " + dateToday.getMonth() + " " + dateToday.getYear());

    }
}

    // TODO: arrays?
    // TODO: reading from csv?
    // TODO: GUI?
