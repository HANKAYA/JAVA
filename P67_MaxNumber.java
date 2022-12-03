package code.PRACTICE_JAVA;

public class P67_MaxNumber {
    public static void MaxNumber(int number1 , int number2) {
        if (number1 > number2){      // First number 1 max
            System.out.println(number1 + " is bigger then " + number2);
        }else if (number1 < number2){// Number2 is max
            System.out.println(number2 + " is bigger then " + number1);
        }else {
            System.out.println(number1 + " is equal to  "   + number2);
        }
    }

    public static void main(String[] args) {
        MaxNumber( 5 ,10);
        MaxNumber(100,20);
        MaxNumber( 30,30);

        // Two number compare
        int num1=150;
        int num2=250;
        MaxNumber(num1,num2);
    }
}
