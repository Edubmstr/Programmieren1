package RandomStuff;

public class Person {
    static int count;
    static double averageAge;

    public static void main(String[] args) {
        addPerson("Benny", 19);
        addPerson("Julian", 20);
        addPerson("Sebastian", 40);

        System.out.println("Das durchschnittliche Alter beträgt: " + getAverageAge());
        System.out.println("Anzahl der Personen: " + count);

    }

    public static void addPerson(String name, int age){
        count++;
        averageAge += age;
    }

    public static double getAverageAge(){
        averageAge = averageAge / count;
        return averageAge;
    }
}
