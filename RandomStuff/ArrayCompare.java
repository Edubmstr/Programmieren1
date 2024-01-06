package RandomStuff;

import Sortieralgorithmen.PrintArray;

public class ArrayCompare extends PrintArray {
    public static void main(String[]args){
        int[] numbers1 = {1, 5 , 8, 10, 16};
        int[] numbers2 = {5, 8, 1, 16, 10};
        int length1 = numbers1.length;
        int length2 = numbers2.length;
        arraycomp(length1, length2);
        boolean found = true;

        for (int i = 0; i < length1; i++) {
            found = false;
            for (int j = 0; j < length2; j++) {
                if(numbers1[i] == numbers2[j]){
                    found = true;
                }
            }
            if(!found){
                System.out.println("Zahlen stimmen nicht überein");
                return;
            }
                }
            System.out.println("Zahlen stimmen überein");

            }
    public static void arraycomp(int length1 , int length2){
        if(length1 != length2){
            System.out.println("Arrays müssen gleich lang sein!");
            return;
        }
        else{
            System.out.println("Arrays sind gleich lang");
        }
    }
}
