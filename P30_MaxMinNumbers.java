package code.PRACTICE_JAVA;

import java.util.Scanner;

public class P30_MaxMinNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        short n1 = scanner.nextShort();
        System.out.println(   "Enter second number: ");
        int   n2 = scanner.nextInt();
        System.out.println(    "Enter third number: ");
        int   n3 = scanner.nextInt();

        // double > float > long > int > short > byte

        boolean n1Max = n1 > n2 && n1 > n3;
        boolean n2Max = n2 > n1 && n2 > n3;
        boolean n3Max = n3 > n1 && n3 > n2;
        int maxNumber = (n1Max) ? n1 : (n2Max) ? n2 : n3;
        System.out.println(maxNumber);
    }
}
