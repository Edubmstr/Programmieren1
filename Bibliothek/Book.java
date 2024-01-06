package Bibliothek;

public class Book extends LibraryItem implements PhysicalItem {

    protected String author;
    protected String position;
    public Book(String title, String author, int anzahl, String position) {
        super(title, anzahl);
        this.author = author;
        this.position = position;
    }

    @Override
    public boolean isDigital() {
        return false;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public String position() {
        return position;
    }
}
