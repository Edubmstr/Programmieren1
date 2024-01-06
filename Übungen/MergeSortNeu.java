package Übungen;

import java.util.Random;

import static Sortieralgorithmen.Merge.mergeSort;

public class MergeSortNeu {
    public static void main(String[] args){
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Unsorted");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        mergeSort(numbers);

        System.out.println("Sorted");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    //public static void mergeSort(){
    //
    //}

}
