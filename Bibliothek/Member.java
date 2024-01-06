package Bibliothek;
import java.util.ArrayList;

public class Member implements LibraryUser {
    private String name;
    private ArrayList<LibraryItem> itemHistory;
    private ArrayList<Library> libraries;

    public Member(String name) {
        itemHistory = new ArrayList<>();
        libraries = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void register(Library library) {
        if(libraries.contains(library)){
            System.out.println("User schon registriert");
        }else{
            libraries.add(library);
            library.setMember(this);
        }
    }

    @Override
    public void unregister(Library library) {
        if(!(libraries.contains(library))){
            System.out.println("User nicht registriert");
        }else{
            libraries.remove(library);
            library.removeMember(this);
        }
    }


    @Override
    public void borrowItem(LibraryItem item) {
        if(item.anzahl > 0){
            item.checkOut();
            item.setTimestamp();
            itemHistory.add(item);
        }
    }

    @Override
    public void returnItem(LibraryItem item) {
        item.checkIn();
        item.setTimestamp();
        itemHistory.add(item);
    }

    public void getHistory(){
        for(LibraryItem items : itemHistory){
                System.out.println(items.title + " " + items.timestamp + " " + this.name);
        }
    }
}
