package RandomStuff;

public class TuermeHanoi {
    public static void main(String[] args){
        int n = 3;
        char rod1 = 'A';
        char rod2 = 'C';
        char rod3 = 'B';
        move(n,rod1,rod2,rod3);
    }

    public static void move(int n, char fromRod, char toRod, char auxRod){
        if(n == 0){
            return;
        }
        move(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move Disc " + n + " from rod " + fromRod + " to rod " + toRod);
        move(n - 1, auxRod, toRod, fromRod);
    }
}
