/*package Neu;

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

    public void sortStudents(ArrayList<Student> students){
        boolean swapped = true;

        while(swapped){
            swapped = false;
            for (int i = 0; i < students.size(); i++) {
                int temp = 0;
                if(students.get(i).getAge < students){

                }
            }
        }
    }

    public ArrayList<Student> students(){
        return students;
    }

    public String toString(){
        return this.name + " " + this.location;
    }
}

 */
