package RandomStuff;

public class AreaKonstruktor {

    final float PI = 3.14f;

    public static void main (String[]args){
        AreaKonstruktor rectangle = new AreaKonstruktor();
        float area_rectangle = rectangle.rectangle(4,6);
        System.out.println("RandomStuff.Area of Rectangle: " + area_rectangle + "cm2");

        AreaKonstruktor circle = new AreaKonstruktor();
        float area_circle = circle.circle(7);
        System.out.println("RandomStuff.Area of Circle: " + area_circle +"cm2");


        AreaKonstruktor percentage = new AreaKonstruktor();
        float area_percentage = percentage.percentage(area_circle, area_rectangle);
        System.out.println(area_percentage);
    }

    public AreaKonstruktor(){

    }

    public float rectangle(float width, float lenght){
        float arearec = width * lenght;
        return arearec;
    }

    public float circle(float radius){
        float areacirc = PI * radius * radius;
        return areacirc;
    }

    public float percentage (float circle, float rectangle){
        float percentage = ((circle / rectangle) - 1) * 100;
        return(percentage);
    }

}
