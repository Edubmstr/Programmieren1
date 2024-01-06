package RandomStuff;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld{
    public static void main(String[] args){
        List<Integer> primeNumbers = new ArrayList<>();

        for(int number = 2;  number <= 100; number++) {

            boolean isPrime = true;
            for (int factor = 2; factor <= number / 2; factor++) {
                if (number % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(number);
            }
        }
            System.out.println("Prime Numbers ");
            for(int number : primeNumbers){
                System.out.println(number);

        }

        }
    }