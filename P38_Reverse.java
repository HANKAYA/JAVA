package code.PRACTICE_JAVA;

import java.util.Scanner;

public class P38_Reverse {
    public static void main(String[] args) {

        // How you can R E V E R S E the String
        // Hello ---> olleH
        // Input Java -----> Output avaJ

        String word = "Hello"; // index of (o) ==4
        String reverseString = "" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("reverseString = " + reverseString);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word2 = input.nextLine();
        int lastIndex= word2.length() -1;
        String reverseWord2 = ""; // I need to store word2 from last to first index

        // Last index length -1
        // First index 0
        // I need to go from last index to first 1 by 1
        // Iteration -1

        for (int i = lastIndex; i >= 0 ; i--){
            System.out.println("i = " + i); //prints index from last to first
            System.out.println("reverseWord2 = " + reverseWord2); //prints reverseword
            System.out.println("word2.charAt(i) = " + word2.charAt(i)); //prints what you add to reverse
            reverseWord2 += word2.charAt(i); // reverseword2 = reverseword2  + letter
            System.out.println(" after adding charAt reverseWord2 = " + reverseWord2);
        }
        System.out.println(reverseWord2);
    }
}
