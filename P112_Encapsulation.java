package code.PRACTICE_JAVA;

public class P112_Encapsulation {

     /*
     OOP PRINCIPLES : object-oriented programing language
•Encapsulation :(Data Hiding)
•Inheritance   :
•Abstraction   :
•Polymorphism   :
OOP  will combine group of related variables and functions to unit (object).
     */

    /*
Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
Therefore, it is also known as data hiding.
To achieve encapsulation in Java −
1.Declare the variables of a class as private.
2.Provide public setter and getter methods to modify and view the variables values from outside of class.

     */


    // 1- To hide data
    private String name;
    private long  idNum;
    private int     age;
    // Nobody will have direct access to above variables

    // Since all the variables are private which will make them not accessible from outside,
    // - you will need to assign or modify them
    // There should be a way to do this
    // 2- Provide public setter and getter methods to modify and view the variables values.
    // This is ENCAPSULATION

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setIdNum(int i){
        this.idNum = idNum;
    }
    public long getIdNum(){
        return idNum;
    }
    public void setAge(int age){
        this.age   = age;
    }
    public int getAge(){
        return age;
    }
}