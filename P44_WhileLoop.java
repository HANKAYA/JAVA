package code.PRACTICE_JAVA;

public class P44_WhileLoop {
    public static void main(String[] args) {

        // Print the figure below
        // ******************** ( 20 stars )

        int i = 1;
        while ( i <= 20){
            System.out.print("*");
            i++;
        }
        System.out.println();
        // Print below figure with while loop
        /*
         ****
         *  *   6 repeat times
         *  *
         *  *
         *  *
         *  *
         *  *
         ****
         */
        int number=1;

        System.out.println("****");
        while (number < 7){
            System.out.println("*  *");
            number++;
        }
        System.out.println("****");
    }
}
