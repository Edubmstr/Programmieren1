package Bibliothek;

public interface LibraryUser {
    void register(Library library);
    void unregister(Library library);
    void borrowItem(LibraryItem item);
    void returnItem(LibraryItem item);
}
