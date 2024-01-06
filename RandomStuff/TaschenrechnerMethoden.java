package RandomStuff;

import java.util.Scanner;

public class TaschenrechnerMethoden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eingabe = 0;
        double temp = 0;
        double sum = 0;
        String anweisung;
        System.out.println("Erste Zahl: ");
        double eingabe1 = scanner.nextDouble();

        System.out.println("Zweite Zahl: ");
        double eingabe2 = scanner.nextDouble();

        System.out.println("Welche Rechenoperation?");
        String operator = scanner.next();

        switch (operator) {
            case "+":
                sum = plus(eingabe1, eingabe2);
                break;

            case "-":
                sum = minus(eingabe1, eingabe2);
                break;

            case "*":
                sum = mal(eingabe1, eingabe2);
                break;

            case "/":
                sum = geteilt(eingabe1, eingabe2);
                break;
            case "!":
                temp = faculty(eingabe1);
                break;
        }
        boolean next = false;
        while(!next){

            System.out.println("RandomStuff.Eingabe:");
            eingabe = scanner.nextDouble();
            System.out.println("Operator");
            operator = scanner.next();
            System.out.println("C Löschen, P Ausrechnen, W Weiter");
            anweisung = scanner.next();

            if(anweisung.equals("C")){
                sum = 0;
                continue;
            }else if(anweisung.equals("P")){
                next = true;
            }else if (anweisung.equals("W")){
                next = false;
            }

            switch(operator){
                case "+":
                    sum = plus(sum, eingabe);
                    break;
                case "-":
                    sum = minus(sum, eingabe);
                    break;
                case "*":
                    sum = mal(sum, eingabe);
                    break;
                case "/":
                    sum = geteilt(sum, eingabe);
                    break;
                case "!":
                    temp = faculty(sum);
                    sum = temp;
                    break;
            }
        }
        System.out.println("Das Ergebnis ist: " + sum);
    }

    public static double calculate(double zahl1, double zahl2, String operator){
        int sum = 0;
        switch(operator){
            case "+":
                plus(zahl1, zahl2);
                break;
            case "-":
                minus(zahl1, zahl2);
                break;
            case "*":
                mal(zahl1, zahl2);
                break;
            case "/":
                geteilt(zahl1, zahl2);
                break;
            case "!":
                faculty(zahl1);
                break;
        }
        return sum;
    }

    public static double plus(double zahl1, double zahl2){
        double sum = zahl1 + zahl2;
        return sum;
    }

    public static double minus(double zahl1, double zahl2){
        double sum = zahl1 - zahl2;
        return sum;
    }

    public static double mal(double zahl1, double zahl2){
        double sum = zahl1 * zahl2;
        return sum;
    }

    public static double geteilt(double zahl1, double zahl2) {
        double sum = 0;
        if (zahl2 == 0) {
            System.out.println("Man darf nicht durch null teilen!");
        } else {
            sum = zahl1 / zahl2;
            return sum;
        }
        return sum;
    }
    public static double faculty(double zahl1){
        double sum = 0;
        int temp = (int) zahl1;
        if(zahl1 <= 0){
            return zahl1;
        }
        for (int i = (int) zahl1 - 1; i > 0 ; i--) {
            temp = temp * i;
            sum = temp;
        }
        return sum;
    }
}