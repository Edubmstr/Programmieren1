package RandomStuff;

import java.util.Scanner;

public class Primzahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        x = scanner.nextInt();
        int numberToCheck = x;
        for (int factor = 2; factor <= numberToCheck /2; factor++) {
            if (numberToCheck % factor == 0) {
                System.out.println("Deine Zahl ist keine Primzahl");
                return; //break geht nicht
            }
        }
        System.out.println("Deine Zahl ist eine Primzahl");
    }
}
