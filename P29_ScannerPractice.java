package code.PRACTICE_JAVA;

import java.util.Scanner;

public class P29_ScannerPractice {
    public static void main(String[] args) {

        Scanner userInput= new Scanner(System.in);
        // We just import scanner class from the library to into this class
        // We will be able to used all the methods from scanner by calling [ userInput ] object
        System.out.println("Insert first number: ");
        int n1 = userInput.nextInt(); // We are asking user to enter number from console
        System.out.println("You have inserted number: " + n1);
        if (n1 %2 == 0){
            System.out.println(n1 + " is even number");
        }else {
            System.out.println(n1 +  " is odd number");
        }
    }
}
