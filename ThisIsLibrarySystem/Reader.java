package ThisIsLibrarySystem;

public class Reader {
    private String name;
    private String email;
    private int ID; // TODO: must be > 0
    

    Reader() {
        
    }

    Reader(String name, String email, int ID) {
        this.name = name;
        this.email = email;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Reader "
    }
}
