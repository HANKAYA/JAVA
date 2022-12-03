package code.PRACTICE_JAVA;

public class P21_Ternary {
    public static void main(String[] args) {

        // TERNARY is just another way of using if else block

        int n1 = 10;
        int n2 = 20;
        int mx =  0;         // This variable will be used to store max number.
        String message = ""; // This variable will be used for storing result as a message.
        System.out.println(mx);
        System.out.println(message);

        if ( n1 > n2){
            mx = n1;
        }else {
            mx = n2;
        }
        message ="Maximum number is: " +mx;
        System.out.println(message);

        // TERNARY Example 2

        int n3 = 10;
        int n4 = 20;
        int m2;

        m2 = ( n3 > n4 ) ? n3 : n4; // [ ? ] <- If present _ [ : ] <- Present else
        System.out.println(m2);
        String result = "";
        result = (false) ? "Java" : "Python";
        System.out.println(result);

    }
}
