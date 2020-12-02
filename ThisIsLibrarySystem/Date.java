package ThisIsLibrarySystem;

public class Date {
    private int day; // TODO: constrain 1 - 30
    private int month; // TODO: constrain 1 - 12
    private int year; // TODO: constrain 1900 - 2030

    private int minDay = 1;
    private int maxDay = 30;
    private int minMonth = 1;
    private int maxMonth = 12;
    private int minYear = 1900;
    private int maxYear = 2030;

    //Constructor of the default Date object being 1.1.1900
    Date() {
        this.day = minDay;
        this.month = minMonth;
        this.year = minYear;
    }

    //Constructor of the Date object
    //Assigns the day, month, and year of the date
    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;   
    }

    //Getter method for the day of the date
    public int getDay() {
        return day;
    }

    //Getter method for the month of the date
    public int getMonth() {
        return month;
    }

    //Getter method for the year of the date
    public int getYear() {
        return year;
    }

    //Setter method for the day of the date
    public void setDay(int day) {
        this.day = day;
    }

    //Setter method for the month of the date
    public void setMonth(int month) {
        this.month = month;
    }

    //Setter method for the year of the date
    public void setYear(int year) {
        this.year = year;
    }
    
    //toString method -> returns a string representation of the object
    @Override
    public String toString() {
        return "Day " + day + ", Month " + month + ", Year " + year;
    }
}

