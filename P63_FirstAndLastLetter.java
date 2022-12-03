package code.PRACTICE_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class P63_FirstAndLastLetter {
    public static void main(String[] args) {
        // Create a java program that will ask for 5 string  name to store in the array
        // Print first and last letter from each string

        // E X A M P L E
        // Input  : berkan , firas ,merve ..
        // Output : bn , fs ,me

        // Scanner : to store numbers
        // Array string : to store 5 names
        // loop to store 5 names (for loop while loop)
        // charAt : to get each letter from each name
        // foreach  : to store initials from each name to new string

        Scanner input= new Scanner(System.in);
        String [] nameList= new String[5]; // To Store 5 names
        for (int i= 0; i < nameList.length; i++){
            System.out.println("Enter a name for index: " +i);
            nameList[i]= input.next();
        }
        // For the print all names
        System.out.println(Arrays.toString(nameList));
        String FirstLastLetters="";
        for (String eachName: nameList){
            FirstLastLetters += " " + eachName.charAt(0) + eachName.charAt(eachName.length() -1);
        }
        System.out.println(FirstLastLetters);
    }
}
