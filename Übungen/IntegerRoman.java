package Übungen;

import java.util.HashMap;
import java.util.Map;

public class IntegerRoman {
    public static void main(String[] args){
        System.out.println(romanToInteger("DCLXXIII"));

    }

    public static int romanToInteger(String string){
        Map<Character,Integer> letters = new HashMap<>();

        letters.put('I', 1);
        letters.put('V', 5);
        letters.put('X', 10);
        letters.put('L', 50);
        letters.put('C', 100);
        letters.put('D', 500);
        letters.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < string.length(); i++) {
            if(i < string.length() - 1 && letters.get(string.charAt(i)) < letters.get(string.charAt(i + 1))){
                sum -= letters.get(string.charAt(i));
            }else{
                sum += letters.get(string.charAt(i));
            }
        }
        return sum;
    }
/*
    public static String integerToRoman(int number){
        return
    }
    */

}
