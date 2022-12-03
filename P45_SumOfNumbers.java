package code.PRACTICE_JAVA;

import java.util.Scanner;

public class P45_SumOfNumbers {
    public static void main(String[] args) {
        // Create a Java logic that will sum the given numbers
        // Ex if input is 5
        // Output will be 1 + 2 + 3 + 4 + 5 = 15

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int start = 0;
        // We need to have a summary variable
        int  sum  = 0;
        while (start <= number){
            sum += start;
            start++;
        }
        System.out.println("sum = " + sum);
    }
}
