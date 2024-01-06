package RandomStuff;

import com.sun.source.tree.CaseTree;

import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    public static void main(String []args){
        int zufall;
        int raten;
        int versuche = 0;
        boolean richtig = false;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        zufall = random.nextInt(100) +1;

        System.out.println("Rate eine Zahl zwischen 1 und 100!");

    while(!richtig){
        System.out.println("Deine Schätzung:");
        raten = scanner.nextInt();
        versuche++;
       if (raten==zufall){
           richtig = true;

           System.out.println("Glückwunsch du hast die Zahl erraten!");
           System.out.println("Du hast " + versuche + " Versuche gebraucht");

        }else if (raten > zufall){
           System.out.println("Deine Zahl ist zu groß!");
       }else if  (raten < zufall) {
           System.out.println("Deine Zahl ist zu klein!");
       }
       }
    }
}
