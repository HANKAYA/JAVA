package code.PRACTICE_JAVA;

import org.apache.commons.io.filefilter.TrueFileFilter;

public class P50_Array {
    public static void main(String[] args) {

        // Declaration of Array
        // DataType [] name={.......}
        int []  NumbersList= {10, 20, 30, 40};
        //          INDEX ==>  0  1   2   3
        String [] NamesList= {"Java", "Python", "C#"};
        //          INDEX ==>    0        1      2

        // Print the "Python"
        System.out.println("NamesList[1]= " + NamesList[1] );
        // Print the data "30"
        System.out.println("NumbersList[2]= " + NumbersList[2]);
        // Print all the names
        for (int i= 0; i<= 2; i++ ){
            System.out.println(NamesList[i]);
        }
        int [] Numbers = {1, 5, 19, 20, 35, 5, 0, 100, 200, 400};
        // Example Numbers[4] means index number 4
        if (Numbers[2] > Numbers[5]){
            System.out.println("2nd index from the list is bigger than number 5 ");
        }else {
            System.out.println("2nd index from the list is smaller than number 5");
        }
        String     engineer = new String( ); // This will store only 1 engineer
        String [] engineers = new String[5]; // Size for this container defined as 5 ==> INDEX (0,1,2,3,4)
        // Array size is fixed, you will need to specify the length when you create Array
        // Size has to be passed []
        // For the "engineers" array, you have size == 5 (Number will be assigned as soon as you create the array)
        // Since we didn't define the index numbers, all the index numbers will be null

        System.out.println("engineers[2] = " + engineers[2]); // null
        engineers[2] = "SDET2";
        System.out.println("engineers[2] = " + engineers[2]); // This won't be null anymore because we assigned to "SDET2"
        engineers[4] = "Developer1";
        System.out.println("engineers[4] = " + engineers[4]);

        // Length of Array
        int length = engineers.length;
        System.out.println("length = " + length);
        // Print all engineers
        for (int i=0; i<= engineers.length -1; i++ ){
            System.out.println(engineers[i]);
        }

        // "boolean" container
        // boolean [] listOfBooleans={true,false,true,false,true};
        boolean [] ListOfBooleans2 = new boolean[3];
        // If you don't assign anything to boolean, Java will take as a false as default
        System.out.println(ListOfBooleans2[0]); // F A L S E
        ListOfBooleans2[0]= true;
        ListOfBooleans2[1]= true;
        ListOfBooleans2[2]= false;
        System.out.println(ListOfBooleans2[0]);
        System.out.println(ListOfBooleans2[1]);
        System.out.println(ListOfBooleans2[2]);
        System.out.println("**********************************");
        boolean [] List1 = {true, false, true, true, true, false, true, true};

        // Create a Java program that will check boolean values
        // ==> If value is true  print passed
        // ==> If value is false print failed

        for ( int i = 0; i < List1.length; i++ ){
            if ( List1[i] ){ // list[0] , list[1]  .... list[list1.length -1
                System.out.println("Passed...");
            }else {
                System.out.println("Failed...");
            }
        }
    }
}
