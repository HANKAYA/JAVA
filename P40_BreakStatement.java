package code.PRACTICE_JAVA;

public class P40_BreakStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println("Java");
            if (i == 4) {
                System.out.println("Han");
            }

                // Break Statement
                // Anytime Java reach to break statement it will stop execution
                // If the Java catch the break inside the loop
                // Loop will stop running
                // It won't be executed in any break

                for (int O = 1; i <= 5; i++){
                    System.out.println("Hello");
                    if (O==3){
                        System.out.println("Stop Hello");
                        break; // L O O P will stop with this code
                    }
                }
            }
        System.out.println("Hello once again...");
        }
    }
