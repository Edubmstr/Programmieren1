package RandomStuff;
import java.util.ArrayList;

public class CollartzRekursiv {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(collartz(7, numbers));
    }
    public static ArrayList<Integer> collartz (int input, ArrayList<Integer> numbers){
            if(input == 1){
                numbers.add(input);
            }else if(input % 2 == 0){
                numbers.add(input);
                collartz(input / 2, numbers);
            }else if(input % 2 == 1){
                numbers.add(input);
                collartz(input * 3 + 1, numbers);
            }
        return numbers;
    }
}