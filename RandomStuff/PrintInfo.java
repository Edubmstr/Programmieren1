package RandomStuff;

public class PrintInfo {
    public static void main(String[] args){
        int zahl = 9;
        double zahl1 = 7.9d;
        String wort = "Ey was geht";
        int[] numbers = {1, 4, 6, 7, 8, 9};

        printInfo(zahl);
        printInfo(zahl1);
        printInfo(wort);
        printInfo(numbers);

    }

    public static void printInfo(int zahl){
        System.out.println(zahl);
    }
    public static void printInfo(double zahl){
        System.out.println(zahl);
    }

    public static void printInfo(String wort){
        System.out.println(wort);
    }

    public static void printInfo(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
