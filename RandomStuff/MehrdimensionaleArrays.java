package RandomStuff;

import Sortieralgorithmen.PrintArray;

import java.util.Scanner;

public class MehrdimensionaleArrays extends PrintArray {
    public static void main (String[] args){
        String [] schueler = new String[5];
        schueler[0] = "Felix";
        schueler[1] = "Leon";
        schueler[2] = "Adrian";
        schueler[3] = "Marcello";
        schueler[4] = "Jannick";
        int subject = 0;
        int student = 0;
        double note = 0;


        String [] fach = new String[3];
        fach[0] = "Programmieren";
        fach[1] = "Einführung IT";
        fach[2] = "Vertragsrecht";
        double[][] noten = new double[][]{
                {1.2, 2.4, 3.0},
                {1.8, 1.7, 1.1},
                {3.9, 3.7, 4.0},
                {2.0, 2.5, 2.8},
                {1.3, 1, 4, 1.2}
        };
        double[] durchschnittfach = new double[6];
        durchschnittfach[0] = (noten[0][0] + noten[1][0] + noten[2][0] + noten[3][0] + noten[4][0]) / 5;
        durchschnittfach[1] = (noten[0][1] + noten[1][1] + noten[1][1] + noten[3][1] + noten[4][1]) / 5;
        durchschnittfach[2] = (noten[0][2] + noten[1][2] + noten[2][2] + noten[3][2] + noten[4][2]) / 5;

        double[] durchschnittschueler = new double[5];
        durchschnittschueler[0] = (noten[0][0] + noten[0][1] + noten[0][2])  / schueler.length;
        durchschnittschueler[1] = (noten[1][0] + noten[1][1] + noten[1][2]) / schueler.length;
        durchschnittschueler[2] = (noten[2][0] + noten[2][1] + noten[2][2]) / schueler.length;
        durchschnittschueler[3] = (noten[3][0] + noten[3][1] + noten[3][2]) / schueler.length;
        durchschnittschueler[4] = (noten[4][0] + noten[4][1] + noten[4][2]) / schueler.length;

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Wessen RandomStuff.Durchschnitt soll angezeigt werden?");
        student = scanner.nextInt();
        note = durchschnittschueler[student];
        System.out.println("Note von " + schueler[student] + " " + note);

        System.out.println("Welches Fach?");
        subject = scanner.nextInt();
        note = durchschnittfach[student];
        System.out.println("Note von " + fach[student] + " " + note);*/
        double length = noten.length;
        System.out.println(length);
    }

}
