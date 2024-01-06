package RandomStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciIterativ {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welche Stelle der Fibonacci-Reihe soll berechnet werden?");
        int n = scanner.nextInt();
        System.out.println("Ihre gesuchte Zahl ist: " + fibonacci(n));
    }

    public static List<Integer> fibonacci(int n){
        int zahl1 = 0;
        int zahl2 = 1;
        int sum = 0;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);

        if(n <= 1){
            return(numbers);
        }else{
            for(int i = 2; i <= n; i++){
                sum = zahl1 + zahl2;
                zahl1 = zahl2;
                zahl2 = sum;
                numbers.add(sum);
            }
        }return(numbers);
    }

}
