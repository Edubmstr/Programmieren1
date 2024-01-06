package Übungen;

import java.util.Arrays;

public class UmgekehrteWorte {
    public static void main(String[] args){
        String word = "Good morning John!";

        String[] splittedWord = word.split(" ");
        int counter = 0;

        for (int i = splittedWord.length - 1; i >= 0; i--) {
            if(counter > splittedWord.length / 2){
                break;
            }
          String temp = splittedWord[i];
          splittedWord[i] = splittedWord[counter];
          splittedWord[counter] = temp;
          counter++;
        }

        System.out.println(Arrays.toString(splittedWord));
    }
}
