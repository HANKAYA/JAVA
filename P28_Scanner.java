package code.PRACTICE_JAVA;

import java.util.Scanner;

public class P28_Scanner {
    public static void main(String[] args) {
        // Scanner is a library under java
        // This library has ready methods that you can use it
        // To be able to use this library we need to call them in our class
        // Create object from that library

        // Scanner input=new Scanner(System.in);

        Scanner input=new Scanner(System.in);

        // I called scanner class (ready library under java) and we created an object called "input"
        // From Scanner class


        // To import library
        // Move your mouse on red line
        // Click on option + enter  for mac
        // Click on alt + enter for windows

        //to go to library hold on ctrl or command then click on library name

        System.out.println("insert your byte number");
        byte b1 = input.nextByte();

        // in scanner if you assign something that is not on the range of variable you will have exception

        System.out.println(b1);

        System.out.println("enter int number");
        int number=input.nextInt();
        // To be able to use scanner library methods you need to call the object
        System.out.println("int number : "+number);


        Scanner scan=new Scanner(System.in);
        // This is another object that we just created. It comes  from scanner class
        // Object name is :  scan

        System.out.println("enter short number ");
        short number2=scan.nextShort();
        System.out.println("short number " + number2);
    }
}
