package Bibliothek;

public class DVD extends LibraryItem implements DigitalItem{
    protected String director;
    public DVD(String title, String director, int anzahl) {
        super(title, anzahl);
        this.director = director;
    }

    @Override
    public boolean isDigital() {
        return true;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public void download() {
        System.out.println(title + " wird heruntergeladen." );
    }

    @Override
    public void play() {
        System.out.println(title + " wird abgespielt.");
    }

    @Override
    public void stream() {
        System.out.println(title + " wird gestreamt.");
    }
}
