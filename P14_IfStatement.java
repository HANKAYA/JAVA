package code.PRACTICE_JAVA;

public class P14_IfStatement {
    public static void main (String [] args){

        boolean b1 = 10>5;        // TRUE
        boolean b2 = 10 == 12;    // FALSE

        System.out.println("HAN");
        if ( 2 > 2) {// opening bracket for if statement true
            System.out.println("NICK");
        } // Closing bracket for " if " Statement
        System.out.println("Mike");

        if (1==1){
            // TRUE JAVA will execute this
            System.out.println("Oscar");
            System.out.println("Oscar");
        }
        if (b2){
            // FALSE JAVA won't execute this
            System.out.println(b2);
            System.out.println("Tom");
        }
        if (true){
            System.out.println("Taylan");
        }
    }
}
