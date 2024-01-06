package RandomStuff;

public class PowerCalculate {
    public static void main (String [] args){
        int input = 4;
        int power = 2;

        System.out.println(calculatePower(input, power));
    }
    public static int calculatePower(int x, int n){
        if(n == 0){
            return 1;
        }
        int sum = 0;
        sum = x * calculatePower(x, n-1);
        return sum;
    }

}
