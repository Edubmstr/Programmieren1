package Neu;

import java.util.ArrayList;


public class Lecture {

    public String name;
    public Instructor instructor;
    public ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<String> lectures = new ArrayList<>();

    public Lecture(String name, Instructor instructor){
        this.name = name;
        this.instructor = instructor;
        lectures.add(this.name);
    }
    public Instructor getInstructor(){
        return instructor;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public ArrayList<Student> studentsAttending(){
        return students;
    }

    public String toString(){
        return this.name + " " + this.instructor;
    }
}


