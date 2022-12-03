package code.PRACTICE_JAVA;

public class P106_ConstructorChaining {
    /*
       Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Constructor chaining can be done in two ways:
Within same class: It can be done using this() keyword for constructors in same class
From base class: by using super() keyword to call constructor from the base class.-- we will see this later
Why do we need constructor chaining ?
This process is used when we want to perform multiple tasks in a single constructor
rather than creating a code for each task in a single constructor we create a separate constructor for each task
and make their chain which makes the program more readable.
     */

    // To be able to create a CConstructor access modifier + class name

    public P106_ConstructorChaining(){
        System.out.println("Default Constructor..."); // 1
    }
    public P106_ConstructorChaining(int a){
        System.out.println("int constructor");  // 2
    }
    public void method1(){
        System.out.println("method 1 ");
    }
    public void method2(){
        System.out.println("method 2 ");
    }

    public static void main(String[] args) {
        P106_ConstructorChaining obj = new P106_ConstructorChaining(24);
    }
    // Within same class: It can be done using this() keyword for constructors in same class
    public P106_ConstructorChaining(String str){
        // System.out.println(); error you can't have anything before this keyword
        // [ this(); ] calls default const
        // this("hello"); you cant call same constructor in the same constructor
        // It will create an infinitive loop
        this(10); // 3        // this();
        System.out.println("String constructor ");
        method2();    // 4
    }
}
