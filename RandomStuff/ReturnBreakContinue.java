package RandomStuff;

public class ReturnBreakContinue {
    public static void main(String []args){
        for(int i = 0; i <=10; i++){
            if(i==4){
                return;
            }
            System.out.println(i);
        }
        System.out.println("Loop end");
    }
}
