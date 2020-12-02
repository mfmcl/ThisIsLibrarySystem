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


    Date() {
    }

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;   
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
