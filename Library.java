import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> allBooks;
    private ArrayList<Reader> allReaders;
    private Date dateToday;

    public void setDateToday(Date dateToday) {
        this.dateToday = dateToday;
    }

    public Date getDateToday() {
        return dateToday;
    }
    
}

    // TODO: arrays?
    // TODO: reading from csv?
    // TODO: GUI?
