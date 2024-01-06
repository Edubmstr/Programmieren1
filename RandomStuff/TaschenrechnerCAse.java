package RandomStuff;

import java.util.Scanner;

public class TaschenrechnerCAse {

    public static void main (String[] args){
        double ergebnis;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Deine erste Zahl: ");
        double zahl1 = scanner.nextDouble();

        System.out.println("Deine zweite Zahl: ");
        double zahl2 = scanner.nextDouble();

        System.out.println("Rechenoperation?");
        String operator = scanner.next();

        switch (operator) {
            case "+":
                ergebnis = zahl1 + zahl2;
                System.out.println("Das Ergebnis ist: " + ergebnis);
                break;
            case "-":
                ergebnis = zahl1 - zahl2;
                System.out.println("Das Ergebnis ist: " + ergebnis);
                break;
            case "*":
                ergebnis = zahl1 * zahl2;
                System.out.println("Das Ergebnis ist: " + ergebnis);
                break;
            case "/":
                if (zahl2 == 0) {
                    System.out.println("Du dulli nicht durch Null teilen!");
                } else {
                    ergebnis = zahl1 / zahl2;
                    System.out.println("Das Ergebnis ist: " + ergebnis);
                    break;
                }
            case "%":
                if (zahl2 == 0) {
                    System.out.println("Du dulli nicht durch Null teilen!");
                } else {
                    ergebnis = zahl1 % zahl2;
                    System.out.println("Das Ergebnis ist: " + ergebnis);
                    break;

                }

        }
    }

}
