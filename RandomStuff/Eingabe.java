package RandomStuff;

import java.util.Scanner;


public class Eingabe {

    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dein Text: ");
        String text = scanner.next();

        System.out.println("Deine Zahl: ");
        int zahl = scanner.nextInt();

        System.out.println("Deine Gleitkommazahl: ");
        double komma = scanner.nextDouble();

        System.out.println(text+ " " + zahl + " " + komma);

    }
}
