package code.PRACTICE_JAVA.Inheritence;

public class Animal {

    /*
Inheritance is an important pillar of OOP(Object-Oriented Programming).
It is the mechanism in java by which one class is allowed to inherit the features(fields and methods)
of another class.
Important terminology:
Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).
Sub Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class).
The subclass can add its own fields and methods in addition to the superclass fields and methods.
Re-usability: Inheritance supports the concept of “re-usability”, i.e. when we want to create a new class
 and there is already a class that includes some code that we want, we can derive our new class
 from the existing class. By doing this, we are reusing the fields and methods of the existing class.
How to use inheritance in Java
The keyword used for inheritance is extends.
 */

    public String   name;
    public int       age;
    public double weight;
    public  String color;
    public  char  gender;


    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void grow(){
        System.out.println(name + " is growing ");
    }

    public String toString(){
        return "name is "     + name  +
                "-- age is "  + age   +
                "--weight is "+ weight+
                "--color is " + color +
                "--gender is "+ gender;
    }
}
