package code.PRACTICE_JAVA;

import java.util.Arrays;

public class P55_ReverseWords {
    public static void main(String[] args) {

        // Create a condition that will reverse the given sentence
        // " Java is fun. " ==> " .nuf si avaJ "

        String sentence= "Java is fun.";
        String [] splitSentence= sentence.split(" ");
        System.out.println(Arrays.toString(splitSentence));
        String reverseSentence= ""; // Storing reversed sentence
        for (int i= splitSentence.length -1; i >= 0; i--){
            reverseSentence += splitSentence[i] + " ";
        }
        System.out.println(reverseSentence);



        // Create a condition that will reverse the given sentence

        String sentence2= "Java is fun";
        String [] split2= sentence2.split(""); // We will split each letter and store into string array
        String reverse2= "";
        for (int i= splitSentence.length-1; i >= 0; i--){

            reverse2 += split2[i];
    }
        System.out.println(reverse2);
    }
}
