package RandomStuff;

import java.util.ArrayList;
import java.util.Scanner;

public class Durchschnitt {
    public static void main(String[] args){
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String eingabe;
        double zahl = 0;
        double durchschnitt = 0;


        System.out.println("Für welche Zahlen soll der Durschschnitt berechnet werden?");

        while(true){
            eingabe = scanner.nextLine();
            if(eingabe.equals("")){
                break;
            }
                zahl = Double.parseDouble(eingabe);
                numbers.add(zahl);

        }

        for (int i = 0; i < numbers.size(); i++) {
            durchschnitt += numbers.get(i);
        }

        durchschnitt = durchschnitt / numbers.size();
        System.out.println(durchschnitt);
    }
}
