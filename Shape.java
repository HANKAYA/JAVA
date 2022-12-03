package code.PRACTICE_JAVA;

public abstract class Shape {

    // Abstraction is another oop concept in java
    // Main idea of abstraction : abstraction is a process of hiding the implementation details(hiding body) from the user,

    // Only the functionality will be provided to the user.
    // In other words, the user will have the information on what the object does instead of how it does it.
    // Two ways to achieve abstraction
    // 1.Abstract Class , abstract methods
    // 2.Interface
    // [ specifier is :Abstract ]
    // Abstract classes are meant to be inherited. Can not be final
    // [ abstract method : ] Those methods will be without body
    // Those methods are meant to be over-write
    // Those methods can not be final,static or private.

    // [ public void method(){body};   ]
    // [ public abstract void method();]


    // task :
    // create an abstract base class call shape which will has methods call area,shapeName
    // create child classes called rectangle , square ... that will overwrite method area,shapeName

    abstract void shapeName();  // abstract methods can not have a body
    abstract void shapeArea();  //abstract methods are meant to be over-written in the child class



}

// To steps to achieve abstraction by using abstract class
// Create an abstract class and abstract method (to be able to hide implementation of methods )
// Then extend this class to child classes (this is called inheritance)
// override the abstract methods

