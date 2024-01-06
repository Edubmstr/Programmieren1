package Bibliothek;

import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<LibraryItem> items;
    private ArrayList<Member> members;

    public Library(String name){
        items = new ArrayList<>();
        members = new ArrayList<>();
        this.name = name;
    }

    public void addItem(LibraryItem item){
        if(!(items.contains(item))) {
            items.add(item);
            System.out.println(item + " wurde zur Bibliothek hinzugefügt");
        }else{
            System.out.println(item + " ist schon vorhanden");
        }
    }

    public void removeItem(LibraryItem item){
        if(items.remove(item)){
            System.out.println(item + " wurde entfernt");
        }else{
            System.out.println(item + " war nicht vorhanden");
        }
    }

    public void checkoutItem(LibraryItem item){
        if(item.anzahl > 0){
            item.checkOut();
        }
    }

    public void checkInItem(LibraryItem item){
        item.checkIn();
    }

    public void setMember(Member member){
        members.add(member);
    }

    public void removeMember(Member member){
        members.remove(member);
    }

    public String toString(){
        return this.name;
    }

}

