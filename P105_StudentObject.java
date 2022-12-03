package code.PRACTICE_JAVA;

public class P105_StudentObject {
    public static void main(String[] args) {

        Student.setSchoolName("Renastech");


        Student obj1=new Student("student 1 ");
        //Student()
        obj1.getInfo();
        //1


        Student obj2=new Student("Student 2");
        obj2.getInfo();
        //2


        Student obj3 =new Student("Student3");
        obj3.getInfo();

        //3

    }
}
