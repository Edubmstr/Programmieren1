package RandomStuff;

public class Area {

    public static void main (String[] args){

        final float PI = 3.14159265358979223f;
        float radius = 5f;

        float areacirc = PI * radius * radius;

        System.out.println("RandomStuff.Area of Circle: " + areacirc + "cm2");

        float a = 6f;
        float b = 7f;

        float arearec = a * b;

        System.out.println("RandomStuff.Area of Ractangle: " + arearec + "cm2");

        float percentage = (areacirc / arearec - 1 ) * 100;
        System.out.println(percentage);
    }
}
