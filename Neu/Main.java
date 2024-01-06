package Neu;

public class Main {
    public static void main (String[] args){
        String[] students = new String[5];
        Student student1 = new Student("Eduard", "Baumeister", "12345", 1,19);
        students[0] = String.valueOf(student1);
        Student student2 = new Student("Sebastian", "Müller", "1122334455", 1, 20);
        Student student3 = new Student("Julius", "Konz", "98765", 60, 50);
        Student student4 = new Student("Antoni", "Präsident", "ABC123", 2, 99);
        Student student5 = new Student("Leon", "Weihing", "s52424", 1, 20);
        Location dhbwloc = new Location("Mannheim", 65651, "Coblitzallee", 3);
        University dhbw = new University("DHBW", dhbwloc, 1976);
        Instructor instructor1 = new Instructor("Fabian", "Klumpp");
        Instructor instructor2 = new Instructor("Guzi", "Huang");
        Instructor instructor3 = new Instructor("Frank", "Koslowski");
        Lecture programming = new Lecture("Programmieren", instructor1);
        Lecture abwl = new Lecture("ABWL", instructor3);
        Instructor instructor4 = new Instructor("Reiner", "Agelek");
        Lecture datenbank = new Lecture("Datenbanken", instructor4);
        Lecture it = new Lecture("IT", new Instructor("Dehoff", " "));

        System.out.println(student1.getFullName());
        student1.printInfo();
        Student student6 = student1.clone();
        System.out.println(Student.count);
        System.out.println(student1.getAverageAge());
        System.out.println(student2);
        System.out.println(students[0]);
        System.out.println(student1.equals(student1));
        System.out.println(Student.prevStudent);
        System.out.println(student4.PREV_STUDENT);

        dhbw.addStudent(student1);
        dhbw.addStudent(student2);
        dhbw.addStudent(student3);
        dhbw.addStudent(student4);
        dhbw.addStudent(student5);
        dhbw.addStudent(student6);
        dhbw.removeStudent(student6);
        System.out.println(dhbw.students);
        System.out.println(student1.getUniversityName());
        System.out.println(dhbwloc);
        System.out.println(Student.prevStudent);
        System.out.println(student4.PREV_STUDENT);
        System.out.println(programming);
        student1.setLecture(programming);
        student1.setLecture(abwl);
        student2.setLecture(programming);
        System.out.println(programming.studentsAttending());
        System.out.println(student1.getLectures());
        System.out.println(Instructor.instructorsWorking());
        System.out.println(programming.getInstructor());
        System.out.println(Lecture.lectures);
        System.out.println(dhbw.students);
        System.out.println(student1.getUniversity());
        student6.setLecture(datenbank);

    }
}


