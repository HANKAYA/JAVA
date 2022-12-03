package code.PRACTICE_JAVA;

import java.util.Arrays;

public class P73_OverLoadingMethod {
    public static void main(String[] args) {
        method();
        method(10);
        method(5 );

        method(5.5);    // double
        method("text"); // string
        method(5,5); // 2 int

        method(3);

        // If you don't define whole number gave will take as an int

        byte number1=3;
        method(number1);


    }

    public static void method(){
        System.out.println("Method");
    }

    public static void method(int a){
        System.out.println("hello method int " + a);
    }

    public static void method(int a ,int b){
        System.out.println("method 2 int");
    }
    public static void method(double a){

        System.out.println("method double " + a);
    }

    public static void method(String s){
        System.out.println("method string " + s);
    }

    public static void method(byte b){
        System.out.println("method byte "   + b);
    }
}

