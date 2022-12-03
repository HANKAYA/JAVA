package code.PRACTICE_JAVA;

import javax.naming.Name;

public class Student {

    // NAME -- ID -- AGE -- GRADE -- SCHOOL NAME
    String name;
    int id;
    static String schoolName;
    static int countNumbers= 0;
    // Access to modifier and class name to create a Constructor (If we don't have it,Java will have a default constructor)
    public Student(String name){
        this.name= name;
        id= setStudentNumber();
    }
    // Create a method that will set student id automatically
    public int setStudentNumber(){
        countNumbers++; // 2
        return countNumbers;
    }
    public void getInfo(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
        System.out.println("School Name: "+schoolName);
    }
    public static void setSchoolName(String school){
        schoolName = school;
    }
}
