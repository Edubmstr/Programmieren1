package Übungen;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println(fibonacci(50));
    }

    public static long fibonacci(int number){
        if(number <= 1){
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
