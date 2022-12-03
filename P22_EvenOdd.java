package code.PRACTICE_JAVA;

public class P22_EvenOdd {
    public static void main(String[] args) {

        int Number;
        Number = 25;
        String result = "";

        // Example 1
        if ( Number % 2 ==0){
            result = Number + " is even number ";
        }else{
            result = Number + " is odd number " ;
        }
        System.out.println(result);

        // T E R N A R Y

        String result2 = ( Number % 2==0 ) ? Number + " is even number " : Number + " is odd number ";
        System.out.println(result2);
    }
}
