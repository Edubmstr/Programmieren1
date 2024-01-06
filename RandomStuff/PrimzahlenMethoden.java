package RandomStuff;

import java.util.Scanner;

public class PrimzahlenMethoden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();
        if (isPrime(numberToCheck)) {
            System.out.println("Deine Zahl ist eine Primzahl");
        } else {
            System.out.println("Deine Zahl ist keine Primzahl");
        }
    }

    public static boolean isPrime(int x) {
        int number = x;
        for (int factor = 2; factor <= number / 2; factor++) {
            if (number % factor == 0) {
                return (false);
            }
        } return(true);
    }
}
