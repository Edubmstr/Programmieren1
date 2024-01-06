package Übungen;

import java.util.Random;


public class MergeSortNeuNeu {
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

    public static void mergeSort(int[] numbers){
        int[] left = new int[numbers.length / 2];
        int[] right = new int[numbers.length - numbers.length / 2];

        if(numbers.length < 2){
            return;
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            left[i] = numbers[i];
        }

        for (int i = numbers.length / 2; i < numbers.length; i++) {
            right[i - numbers.length / 2] = numbers[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(numbers, left, right);
    }

    public static void merge(int[] numbers, int[] left, int[] right){
        int a = 0,b = 0,c = 0;

        while(a < left.length && b < right.length){
            if(left[a] < right[b]){
                numbers[c] = left[a];
                a++;
            }else {
                numbers[c] = right[b];
                b++;
            }
            c++;
        }

        while(a < left.length){
            numbers[c] = left[a];
            a++;
            c++;
        }

        while(b < right.length){
            numbers[c] = right[b];
            b++;
            c++;
        }

    }
}
