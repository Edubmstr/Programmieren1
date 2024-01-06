package RandomStuff;

import java.util.Arrays;
import java.util.Random;

public class HelloWorldInCool {
    public static void main(String[] args) throws InterruptedException {

        youGotGeBogosorted();
        helloWorld();
        youGotGeBogobogosorted();
    }

    public static void helloWorld() throws InterruptedException {
        char ch;
        int delay = 75;

        for (ch = 'A'; ch <= 'H' ; ch++) {
            System.out.println(ch);
            Thread.sleep(delay);
        }

        for (ch = 'a'; ch <= 'e' ; ch++) {
            System.out.println("H"+ch);
            Thread.sleep(delay);
        }

        for (ch = 'a'; ch <= 'l' ; ch++) {
            System.out.println("He"+ch);
            Thread.sleep(delay);
        }
        for (ch = 'a'; ch <= 'l' ; ch++) {
            System.out.println("Hel"+ch);
            Thread.sleep(delay);
        }
        for (ch = 'a'; ch <= 'o' ; ch++) {
            System.out.println("Hell"+ch);
            Thread.sleep(delay);
        }
        for (ch = 'A'; ch <= 'W' ; ch++) {
            System.out.println("Hello "+ch);
            Thread.sleep(delay);
        }
        for (ch = 'a'; ch <= 'o' ; ch++) {
            System.out.println("Hello W"+ch);
            Thread.sleep(delay);
        }
        for (ch = 'a'; ch <= 'r' ; ch++) {
            System.out.println("Hello Wo"+ch);
            Thread.sleep(delay);
        }
        for (ch = 'a'; ch <= 'l' ; ch++) {
            System.out.println("Hello Wor"+ch);
            Thread.sleep(delay);
        }
        for (ch = 'a'; ch <= 'd' ; ch++) {
            System.out.println("Hello Worl"+ch);
            Thread.sleep(delay);
        }
    }

    public static void youGotGeBogobogosorted(){
        char [] chars = {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
        Random random = new Random();
        boolean sorted = false;
        String arraySorted = "hello World";

        while(!sorted){
            if(arraySorted.equals("Hello World")){
                System.out.println(arraySorted);
                sorted = true;
            }
            arraySorted = String.valueOf(chars[random.nextInt(10)] + chars[random.nextInt(10)] + chars[random.nextInt(10)] +
                    chars[random.nextInt(10)] + chars[random.nextInt(10)] + chars[random.nextInt(10)] + chars[random.nextInt(10)]+
                    chars[random.nextInt(10)] + chars[random.nextInt(10)] + chars[random.nextInt(10)]);
            System.out.println(arraySorted);
        }
    }
    public static void youGotGeBogosorted(){
        String [] chars = {"H", "e", "l", "l", "o", "W", "o", "r", "l", "d"};
        Random random = new Random();
        boolean sorted = false;
        String output = "";
        String [] helloWorld = new String[10];

        while(!sorted){
            if(!(helloWorld[0] == "H")) {
                helloWorld[0] = chars[random.nextInt(10)];
            }
            else if(!(helloWorld[1] == "e")) {
                helloWorld[1] = chars[random.nextInt(10)];
            }
            else if(!(helloWorld[2] == "l")) {
                helloWorld[2] = chars[random.nextInt(10)];
            }
            else if(!(helloWorld[3] == "l")) {
                helloWorld[3] = chars[random.nextInt(10)];
            }
            else if(!(helloWorld[4] == "o")) {
                helloWorld[4] = chars[random.nextInt(10)];
            }
            else if(!(helloWorld[5] == "W")) {
                helloWorld[5] = chars[random.nextInt(10)];
            }
            else if(!(helloWorld[6] == "o")) {
                helloWorld[6] = chars[random.nextInt(10)];
            }
            else if(!(helloWorld[7] == "r")) {
                helloWorld[7] = chars[random.nextInt(10)];
            }
            else if(!(helloWorld[8] == "l")) {
                helloWorld[8] = chars[random.nextInt(10)];
            }
            else if(!(helloWorld[9] == "d")) {
                helloWorld[9] = chars[random.nextInt(10)];
            }
            else {
                for (int i = 0; i < helloWorld.length ; i++) {
                    output = output + helloWorld[i];
                }
                System.out.println(output);
                sorted = true;
            }
        }
    }

}
