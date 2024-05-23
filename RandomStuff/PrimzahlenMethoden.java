package RandomStuff;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimzahlenMethoden {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();
        if (isPrime(numberToCheck)) {
            System.out.println("Deine Zahl ist eine Primzahl");
        } else {
            System.out.println("Deine Zahl ist keine Primzahl");
        }
*/
        System.out.println(primeNumbers());
    }

    public static boolean isPrime(int x) {
        int number = x;
        for (int factor = 2; factor <= number / 2; factor++) {
            if (number % factor == 0) {
                return (false);
            }
        } return(true);
    }

    private static ArrayList<Integer> primeNumbers(){

        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int factor = 2; factor <= i / 2; factor++) {
                if(i % factor == 0 ){
                    isPrime = false;
                    break;
                }
            }
           if(isPrime){
               primeNumbers.add(i);
           }
        }
        return primeNumbers;
    }
}
