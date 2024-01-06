package Bibliothek;

public class Magazine extends LibraryItem{
    private String author;
    public Magazine(String title, String author, int anzahl) {
        super(title, anzahl);
        this.author = author;
    }

    @Override
    public boolean isDigital() {
        return false;
    }

    @Override
    public String toString() {
        return title;
    }
}
