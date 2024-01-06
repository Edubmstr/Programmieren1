package RandomStuff;

import RandomStuff.ArrayCompare;

public class Skalarprodukt extends ArrayCompare {
    public static void main(String[] args){
        int[] vektor1 = {2, 2, 0};
        int[] vektor2 = {-2, 2, 8};
        arraycomp(vektor1.length, vektor2.length);
        int sum = 0;

        for (int i = 0; i < vektor1.length; i++) {
            int temp = 0;
            temp = vektor2[i] * vektor1[i];
            sum = sum + temp;
        }
        System.out.println(sum);
    }
}
