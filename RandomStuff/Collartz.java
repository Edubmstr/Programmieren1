package RandomStuff;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Collartz {
    public static void main(String[]args){
       System.out.print(CollartzReihe(5));
    }

    public static ArrayList<Integer> CollartzReihe(int input){
        ArrayList<Integer> output = new ArrayList<>();
        boolean bool = true;
        output.add(input);
        if(input !=1 && input != 0){
            bool = true;
        }else{
            bool = false;
        }
        while(bool){
            if(input % 2 == 0){
                input = input /2;
                output.add(input);
            }else {
                input = (input * 3) + 1;
                output.add(input);
            }
        }
        return output;
    }

}