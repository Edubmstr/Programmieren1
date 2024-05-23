package Neu;

import java.util.ArrayList;

public class University {
    public String name;
    ArrayList<Student> students = new ArrayList<>();
    public String location;
    public int foundedYear;


    public University(String name, Location location, int foundedYear){
        this.name = name;
        this.location = location.city;
        this.foundedYear = foundedYear;
    }

    public void addStudent(Student student){
        students.add(student);
        student.setUniversity(this);
    }

    public void removeStudent(Student student){
        students.remove(student);
        student.setUniversity(null);
    }

    public ArrayList<Student> sortedStudents(ArrayList<Student> students){
        ArrayList<Student> sortedStudents = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            sortedStudents.set(i,students.get(i));
        }
        boolean swapped = true;

        while(swapped){
            swapped = false;
            for (int i = 0; i < students.size() - 1; i++) {
                Student temp;
                if(sortedStudents.get(i).getAge() > sortedStudents.get(i + 1).getAge()){
                temp = sortedStudents.get(i);
                sortedStudents.set(i, sortedStudents.get(i + 1));
                sortedStudents.set(i + 1, temp);
                swapped = true;
                }
            }
        }
        return sortedStudents;
    }

    public ArrayList<Student> students(){
        return students;
    }

    public String toString(){
        return this.name + " " + this.location;
    }
}


