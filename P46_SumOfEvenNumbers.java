package code.PRACTICE_JAVA;

public class P46_SumOfEvenNumbers {
    public static void main(String[] args) {
        // Write a program using while loop calculates the sum of even numbers between 0 - 30
        // Starting point -->  0
        // Ending   point -->  30
        // Iteration +1
        // "if " condition to check even numbers
        int sum1 = 0;
        // "for" loop
        for (int i = 0; i<= 30; i++){
            if ( i % 2 == 0){ // Even numbers
                System.out.println("Adding " + i + " to sum1 ");
                sum1 += i;
            }
        }
        System.out.println("sum1 = " + sum1);
        System.out.println("********************************");
        int start2 = 0;
        int   sum2 = 0;
        while (start2 <= 30){
            if ( start2 % 2 == 0) { // Even numbers
                System.out.println("Adding " + start2 + " to sum2 ");
                sum2 += start2;

            }
            start2 ++;
        }
        System.out.println("sum2 = " + sum2);
    }
}
