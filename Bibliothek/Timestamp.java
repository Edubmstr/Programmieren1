package Bibliothek;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Timestamp {


    LocalDateTime time;

    public Timestamp(){
        this.time = LocalDateTime.now();
    }

    public String toString(){
        return time.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    }

}
