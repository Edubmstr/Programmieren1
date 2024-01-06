package Sortieralgorithmen;

import java.util.Random;

public class SelectionSortNeu {
    public static void main(String[] args){
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        selectionSort(numbers);

        System.out.println("Nach dem Sortieren");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void selectionSort(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
