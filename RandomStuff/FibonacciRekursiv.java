package RandomStuff;

import java.util.ArrayList;
import java.util.List;

public class FibonacciRekursiv {
    public static void main(String[] args){
        int n = 50;
        System.out.println(fibonacci(n));
    }
    private static int fibonacci(int n){
        List<Integer> numbers = new ArrayList<>();
        if(n <=1){
            return(n);
        }
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
