package code.PRACTICE_JAVA;

import java.util.Scanner;

public class P31_ScannerNext {
    public static void main(String[] args) {


        // For the strings to be able to use scanner you will need to call next method from library
        // 2 way to create string scanner
        // Next and nextLine

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = input.next();
        System.out.println("First name is " + firstName);

        System.out.println("Enter last name name: ");
        String lastName = input.next();
        System.out.println("Last name is " + lastName);

        String fullName= firstName + " "+ lastName;
        System.out.println(fullName);

        System.out.println("Grade for student");
        int grade = input.nextInt();

        System.out.println(fullName + " grade is " + grade);
    }
}
