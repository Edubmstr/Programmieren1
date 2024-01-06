/*package Neu;

import java.util.ArrayList;

public class Student {
   public String firstName;
   public String lastName;
   public String studentID;
   public static Student prevStudent;
   public final Student PREV_STUDENT;

   public University university;
   public int semester = 0;
   public int age = 0;
   public static int count = 0;
   private static float sumAge = 0;
   public Lecture lecture;
ArrayList<Lecture> lectures = new ArrayList<>();
   public Student(String firstName, String lastName, String studentID, int semester, int age){
       this.firstName = firstName;
       this.lastName = lastName;
       this.studentID = studentID;
       this.semester = semester;
       this.age = age;
       this.PREV_STUDENT = prevStudent;
       sumAge += this.age;
       count++;
       prevStudent = this;
   }            //Konstruktor für den Student

   public String getFullName(){
       return this.firstName + " " + this.lastName;
   }        // String mit dem Namen

   public void printInfo(){
       System.out.println("Vorname: " + this.firstName + " " +
               "Nachname: " + this.lastName + " " +
               "StudentenID: " +  this.studentID + " " +
               "Semester: " + this.semester + " " +
               "Alter: " + this.age);
   }        // Alle Infos eines Studenteb

   public float getAverageAge(){
        return sumAge / count;
   }

   public String toString(){
       return this.firstName + " " + this.lastName;
   }

   public Student clone(){
        return new Student(this.firstName,this.lastName,this.studentID,this.semester,this.age);
   }

   public boolean equals(Student student){
       return this.studentID.equals(student.studentID);
   }

   public void setUniversity(University university){
       this.university = university;
   }

   /* public String getUniversity(){
       return this.university.name;
   }

    public University getUniversity(){
        return this.university;
    }

   public void setLecture(Lecture lecture){
       lectures.add(lecture);
       lecture.addStudent(this);
   }

   public void removeLecture(Lecture lecture){
        lectures.remove(lectures);
        lecture.removeStudent(this);
   }

   public ArrayList<Lecture> getLectures(){
       return lectures;
   }
}
*/