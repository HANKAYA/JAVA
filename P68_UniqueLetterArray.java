package code.PRACTICE_JAVA;

public class P68_UniqueLetterArray {

    //Write a program that can print out the unique values from a String Array
    //            Ex:
    //                if arr -> {"A", "A", "B", "C", "C","C"}
    //                output: B
    //
    //                if arr -> {"A", "B", "B", "C"}
    //                output:  A
    //                         C
    // */
    public static void main(String[] args) {

        // if the variable is in the list for only one time that means this is a unique value
        // I should only print strings that has count == 1
        // to check letter count  you will need to compare with all letters and when it equals you increase the count
        // the ones that has count == 1 are unique
        // count 0 , 2 3 4 5 6 ... won't be unique

        String [] letters= {"A", "A", "B", "C", "C","C","D","E","D"};
        for (String eachLetter: letters){
            int count= 0; // to reset count for each letter we have count inside of loop
            for (String eachLetter2: letters){//={"A", "A", "B", "C", "C","C","D","E","D"};}
                if (eachLetter2.equals(eachLetter)) {
                    count++;//1
                }
            }
            if (count==1){ // 1 = 1
                System.out.println(eachLetter + " is unique");// B --- E
            }
        }
        System.out.println("********************");
        String [] arr={"A","C","B","C"};
        uniqueFromArray(arr);
    }
    public static void uniqueFromArray(String [] exampleLetters){
        // String [] letters= {"A", "A", "B", "C", "C","C","D","E","D"}; <== NO NEED ANYMORE because we are getting
        // from our parameter array.
        for (String eachLetter: exampleLetters) {
            int count = 0; // to reset count for each letter we have count inside of loop
            for (String eachLetter2 : exampleLetters) {//={"A", "A", "B", "C", "C","C","D","E","D"};}
                if (eachLetter2.equals(eachLetter)) {
                    count++;//1
                }
            }
            if (count == 1) { // 1 = 1
                System.out.println(eachLetter + " is unique");// B --- E
            }
        }
    }
}
