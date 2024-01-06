package RandomStuff;

import java.util.Scanner;

public class Taschenrechner {

    public static void main(String [] args) {
        double ergebnis;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Deine erste Zahl: ");
        double zahl1 = scanner.nextDouble();

        System.out.println("Deine zweite Zahl: ");
        double zahl2 = scanner.nextDouble();

        System.out.println("Rechenoperation?");
        String operator = scanner.next();


        if (operator.equals("+")) {
            ergebnis = zahl1 + zahl2;
            System.out.println("Ergebnis: " + ergebnis);
        } else if (operator.equals("-")) {
            ergebnis = zahl1 - zahl2;
            System.out.println("Ergebnis: " + ergebnis);
        } else if (operator.equals("*")) {
            ergebnis = zahl1 * zahl2;
            System.out.println("Ergebnis: " + ergebnis);
        } else if (operator.equals("/")) {
            if (zahl2 == 0) {
                System.out.println("Du Trottel darfst nicht durch Null teilen!");
            } else {
                ergebnis = zahl1 / zahl2;
                System.out.println("Ergebnis: " + ergebnis);
            }

        }
    }
}
