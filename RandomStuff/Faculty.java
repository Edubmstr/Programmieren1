package RandomStuff;

import java.util.Scanner;

public class Faculty {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int eingabe = scanner.nextInt();
        System.out.println(faculty(eingabe));

    }

    public static int faculty(int x){
        if(x<=0){
            return x;
        }
        for(int i = 1; i <= x-1; i++){
            x = x * i;
        }
        return x;
    }
}
