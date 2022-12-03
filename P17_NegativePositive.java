package code.PRACTICE_JAVA;

public class P17_NegativePositive {
    public static void main (String [] args){
        // create a java program that will check the given number =20
        // if number is positive print : 20 is positive
        // if number is negative print : 20 is negative
        // if number is zero print : 20 is zero

            int number=0;

            // if number is smaller than zero -- negative number
            // if number is bigger  than zero -- positive number
            // if number is zero              -- number is zero

            if (number > 0){
                System.out.println(number + " is positive");
            }
            if (number < 0){
                System.out.println(number + " is negative");
            }
            if (number == 0){
                System.out.println(number + " is zero");
            }
    }
}
