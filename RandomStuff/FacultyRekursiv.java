package RandomStuff;

import java.util.Scanner;

public class FacultyRekursiv {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(faculty(input));
    }

    public static int faculty(int x){
       if (x == 0){
           return 1;
       }else if(x == 1){
           return x;
       }
       int sum = x * faculty(x-1);
       return sum;
    }
}
