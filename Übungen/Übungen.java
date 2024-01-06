package Übungen;

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.replaceAll;

public class Übungen {
    public static void main(String[] args){
        System.out.println(celsiusToFahrenheit(30));
        System.out.println(fahrenheitToCelsius(86));
        correctBrackets("[HelloWorld({123})]");
        programmablauf();

        int[] numbers = new int[11];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Vor dem Reversen");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        invertArray(numbers);
        System.out.println("Nach dem Reversen");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    public static double celsiusToFahrenheit(int degrees){
        return degrees * 1.8 + 32;
    }

    public static double fahrenheitToCelsius(int degrees){
        return (degrees - 32) / 1.8;
    }

    public static float[] bubbleSort(float[] numbers){
        boolean swapped = true;

        while(swapped){
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] > numbers[i + 1]){
                    float temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        return numbers;
    }

    public static ArrayList<Float> secondNumber(float[] numbers){
        bubbleSort(numbers);
        ArrayList<Float> secondNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length;i += 2) {
                secondNumbers.add(numbers[i]);
        }
        return secondNumbers;
    }

    public static ArrayList<Double> positiveNumbers(double[] numbers){
        ArrayList<Double> positiveNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0){
                positiveNumbers.add(numbers[i]);
            }
        }
        return positiveNumbers;
    }

    public static void invertArray(int[] numbers){
        int counter = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if(counter > numbers.length / 2){
                break;
            }
            int temp = numbers[i];
            numbers[i] = numbers[counter];
            numbers[counter] = temp;
            counter++;

            //mit foreach
            //out[l-1] = i;
            //l--;
        }
    }


    public static int maxNumber(int[] numbers){
        int maxNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }

    public static void correctBrackets(String input){
        //String[] splitted = input.split("");
        /*String word = splitted.toString();
        word.replace("([a-z])", "");
        word.replace()*/
        /*for (int i = 0; i < splitted.length; i++) {
           if(splitted[i].equals("[")){

           }
        }
*/
        String str = input.replaceAll("([a-z])", "");
        String str1 = str.replaceAll("([A-Z])", "");
        String str2 = str1.replaceAll("([1-9])", "");
        if(str2.equals("[({})]")){
            System.out.println("Passt");
        }else{
            System.out.println("Passt nicht");
        }
    }

    public static void programmablauf(){
        int sum = 0;
        int number = 0;

        if(number < 0){
            sum = number;
            System.out.println(sum);
        }else{
            int i = 0;
            while(i < number){
                sum += 2;
                i++;
            }
               System.out.println(sum);
        }
    }
}

