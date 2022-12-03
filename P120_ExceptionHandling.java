package code.PRACTICE_JAVA;

public class P120_ExceptionHandling {

    // There is 2 way to handle exceptions they don't stop compiler from running
    // 1- You can use try/catch blocks to handle
    // 2- You can use throws keyword to handle

    public static void main(String[] args) {
        System.out.println("Hello Hello");
        try{
            System.out.println("Waiting 5 seconds to start");
            Thread.sleep(5000); // Checked exception
            System.out.println("Waiting is ended");
        }catch (InterruptedException e){
            System.out.println("e.getMessage()= " + e.getMessage());
        }
        int number= 0;
        while (number < 60){
            System.out.println(number);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                // Exception is the parent of all the exception types
                // You can use Exception to catch all types of exception
            }
            number++;
        }
        System.out.println("Done");
    }
}
