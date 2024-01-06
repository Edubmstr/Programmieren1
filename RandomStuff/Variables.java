package RandomStuff;

public class Variables {
    public static void main (String [] args){
        final String NAME = "Eduard";
        final String SUBNAME = "Baumeister";
        int age = 19;
        final char GENDER;
        GENDER = 'M';
        final double HEIGHT = 1.76d;
        String favclr = "Blau";
        final String PETNAME = "Jagger";
        String company = "SAP";


        System.out.println(NAME + " " + SUBNAME );
        System.out.println("Alter: " + age);
        System.out.println("Geschlecht: " + GENDER);
        System.out.println("Größe: " + HEIGHT + "m");
        System.out.println("Lieblingsfarbe: " + favclr);
        System.out.println("Haustiername: " + PETNAME);
        System.out.println("Firma: " + company);
    }
}
