package code.PRACTICE_JAVA;

import code.MyUtils.GenericUtils;

public class P97_StaticVariables {


    // S T A T I C     V A R I A B L E S

    // When a variable is declared as static, then a single copy of variable is created
    // --> and shared among all objects at class level. Static variables are, essentially, global variables.
    // All instances of the class share the same static variable.
    // We can create static variables at class-level only.
    // " static: class member, " Can be called through the class
    // There is only one copy of static shared by all objects - prefers to be called through class name
    // " --> static ONLY accepts static <- "

    //    static members:
    //            1. static variable (global variables)
    //            2. static methods
    //            3. static initializer block
    //            4. static nested class

    // " static variable: " ( Declared outside any block with static keyword. )
    // --> There is only one copy of static shared by all objects
    // [ Instance: ] Every single object of the class has its own copy
    // [ local variable: ] Variables that are declared in a block
    // [ instance variables: ] Declared outside the blocks
    // [ Static variables : ] Declared outside the blocks with a static keyword


    int instanceVariable = 25;        // <- instance
    int number = 10;        // <- instance
    static int staticVariable = 100;  // <- static variable

    public static void main(String[] args) {

        int localVariable = 200;  // <- Local Variable
        // To be able to use "instance variable" inside the static method, we will need to create an object method.

        P97_StaticVariables obj1 = new P97_StaticVariables();
        System.out.println(obj1.instanceVariable); // <- 25
        System.out.println(staticVariable);        // <- 100
        // Static variables will have one copy for all object

        P97_StaticVariables obj2 = new P97_StaticVariables();
        P97_StaticVariables obj3 = new P97_StaticVariables();
        obj2.instanceVariable = 250;
        obj3.instanceVariable = 350;

        obj1.staticVariable = 55;
        obj2.staticVariable = 155;
        obj3.staticVariable = 555;

        System.out.println("obj1.instanceVariable = " + obj1.instanceVariable);
        System.out.println("obj2.instanceVariable = " + obj2.instanceVariable);
        System.out.println("obj3.instanceVariable = " + obj3.instanceVariable);

        GenericUtils.Stars();

        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);
        System.out.println(obj3.staticVariable);
    }

    {
        //block

    // local variable : declared inside of block

    // instance variable :declared outside the blocks
    // instance variable can have multiple copy from object
    // they need to be called through object

    // static variables :declared outside any block with static keyword
    // static variable can only have one copy from object
    // they can also be called with classname itself
    }
}
