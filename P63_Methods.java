package code.PRACTICE_JAVA;

import static code.day19_methods.c2_Methods.*;

public class P63_Methods {
    public static void main(String[] args) {
        // " printJava10 " in order to print Java 10 times
        printJava10();
        hello();
        evenNumbers100();

        // Declaration of the method
        // public               static           void               main        (String [] args){
        // Access-modifier       specifier        return-type        methodName  (parameter)
        // Statements ,code


        // Access-Modifier =public, protected ,default ,private
        // specifier   : static ,final ,abstract ,synchronized
        // return type : void , any datatype(int,string,char , int [] .......)
        // some method has parameters some don't have parameter

        // Create a method that will print java 10 times

        for (int i = 1; i <= 10; i++) {
            System.out.println("Java");
        }
        // Print a hello
        for (int i = 1; i <= 10; i++) {
            System.out.println("HAN");
        }
        // Create a method that will print even numbers between 1-100
        // Name this method as evenNumbers100

            for (int i= 2; i < 101; i+=2){
                System.out.println( i + " ");
            }
        System.out.println();
    }
}

//    // void method (without parameters)
//    // void method (with parameters)\
//    // return method (without parameters)
//    // return method (with parameters)

// you can use above methods with different access modifier and specifier


