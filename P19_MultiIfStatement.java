package code.PRACTICE_JAVA;

public class P19_MultiIfStatement {
    public static void main (String [] args){

        // Check two numbers
        // Check for the 1st if they are equal
        // Second check is one of them bigger
        // Last condition is smaller
        // You will prefer to use multi "if", if you have more than two conditions

        int x = 25;
        int y = 35;
        if(x==y){
            System.out.println(x + " equal to " +y);
        }else if(x>y){
            System.out.println(x + " is bigger than " +y);
        }else{
            System.out.println(x + " is smaller than " +y);
        }
    }
}
