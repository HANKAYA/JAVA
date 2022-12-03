package code.PRACTICE_JAVA;

public class P43_WhileLoop {
    public static void main(String[] args) {

        // Structure of "for Loops"
        for (int i = 0; i < 100; i++){
            // Starting point int = 0
            // Ending point 99 condition i < 100
            // Iteration ==
        }
        // " while loop " This code will keep running as long as while condition is true
        // Initialization will be outside of while loop
        // E X A M P L E
        int i = 0; // <== initialization
        while ( i < 11){ // Condition : As long as condition is true ' while ' code will run.
            // What is the ending point is this condition? Answer is 'ending point is 10'.
            System.out.println("Hello World " + i ); // 0 1 2 3 4 .... 10
            i++; // Iteration
        }
//        while ( 100 > 95 ){ // Condition
//            System.out.println("JAVA"); // Infinitive loop
//        }
        int N1 = 5;
        while (N1 > 0){
            System.out.println("N1 = " + N1);
            N1--; // JAVA reads from top to bottom
        }
        // E X A M P L E - 2
        int N2 = 5;
        while (N2 > 0) {
            N2--; // JAVA reads from bottom to top because we switch the print code under
            System.out.println("N2 = " + N2);
        }
    }
}
