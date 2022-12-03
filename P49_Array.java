package code.PRACTICE_JAVA;

public class P49_Array {
    // int - double - float - string
    // Each variable has own value
    public static void main(String[] args) {

        int N1 = 10; // Can contain only one value
        int N2 = 20; // Can contain only one value
        int N3 = 30; // Can contain only one value

        // If you want to store multiple value in 1 container, list
        // Arrays: Contains for multiple variables
        // Arrays has some ready methods that you can modify your variables
        // Declaration of Array
        // DataType [] NameOfYourContainer = {data1, data2 , data3, ...} data== variable
        // Container of Numbers
        // int container, double container, float container....
        // integer container

        // DataType [] NameOfYourContainer = {data1, data2 , data3, ...}
        int [] numbers= {10,20,30,40,50,190,3,5,0,10};
        // INDEX NO  -->  0  1  2  3  4  5  6 7 8  9
        // You can not store any other data type
        // Array has indexed numbers ( 0, 1, 2, 3, 4, ......99999999)
        System.out.println(N3+10);

        // Print the 3rd number ==> 30 ( index number is 2 )
        System.out.println( numbers[2] );


        //print first number
        System.out.println( numbers[0] );

        //second number == 20 index = 1
        int secondNumber= numbers [1];

        System.out.println("secondNumber = " + secondNumber);

        System.out.println("numbers[15] = " + numbers[15]);  // ArrayIndexOutOfBoundsException
        // Total we had 10 numbers which last index is 9 for the last one
        // We don't have indexed 15
    }
}
