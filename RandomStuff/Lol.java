package RandomStuff;

public class Lol {


        static final float PI = 3.14f;

        public static void main (String[]args){

            float rec = rectangle(5,7);
            System.out.println("RandomStuff.Area of Rectangle: " + rec+ "cm2");

            float circ = circle(8.2F);
            System.out.println("RandomStuff.Area of Circle: " + circ +"cm2");


            System.out.println(percentage(circ,rec)+ "%");
        }


        public static float rectangle(float width, float lenght){
            float arearec = width * lenght;
            return arearec;
        }

        public static float circle(float radius){
            float areacirc = PI * radius * radius;
            return areacirc;
        }

        public static float percentage (float circle, float rectangle){
            float percentage = ((circle / rectangle) - 1) * 100;
            return(percentage);
        }

    }


