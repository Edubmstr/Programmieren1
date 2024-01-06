package RandomStuff;

public class PlusMethode extends MinusKlasse {
    public static void main (String[] args){
        PlusMethode plus = new PlusMethode();
        double summe = plus.plus(8,8);
        System.out.println(summe);

        MinusKlasse minus = new MinusKlasse();
        double summe1 = minus.minus(5,2);
        System.out.println(summe1);
    }
    public double plus(double input1, double input2){
        double sum = input1 + input2;
        return sum;
    }
}
