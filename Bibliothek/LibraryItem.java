package Bibliothek;

import java.time.LocalDateTime;

public abstract class LibraryItem  {

    protected String title;
    protected int anzahl;

    protected Timestamp timestamp;
    LocalDateTime now;


    public LibraryItem(String title, int anzahl){
        this.title = title;
        this.anzahl = anzahl;
    }

    public void checkOut(){
        if(isAvailable()){
            anzahl--;
            System.out.println(title + " wurde erfolgreich aus dem Inventar ausgecheckt");
        }else{
            System.out.println(title + " leider nicht mehr vorrätig");
        }
    }

    public void checkIn(){
        anzahl++;
        System.out.println(title + " wurde erfolgreich ins Inventar eingecheckt.");
    }

    public boolean isAvailable(){
        if(anzahl > 0){
            return true;
        }
        return false;
    }

    public void setTimestamp(){
        this.timestamp = new Timestamp();
    }

    public abstract boolean isDigital();

    public abstract String toString();
}
