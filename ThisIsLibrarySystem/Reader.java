package ThisIsLibrarySystem;

public class Reader {
    private String name;
    private String email;
    private int ID; // TODO: must be > 0
    

    //Constructor of the Reader object
    //Assigns the name, email and ID of the reader
    Reader(String name, String email, int ID) {
        this.name = name;
        this.email = email;
        this.ID = ID;
    }

    //Getter method for the name of the reader
    public String getName() {
        return name;
    }

    //toString method -> returns a string representation of the object
    @Override
    public String toString() {
        return "Name: " + name + "; ID: " + ID + "; Email: " + email;
    }
}
