package code.PRACTICE_JAVA;

import java.util.Arrays;

public class P56_MultipleDimensionArray {
    public static void main(String[] args) {

        // Declaration of Array -- 1D Dimension of Array ==> DataType [] name= { data1, data2, data3 };
        // 2D Dimension Array ==> DataType [] name= {
        // { data1,data2 ,data3}, { data1,data2  }, { data1,data2 ,data3}, { data1,data2 ,data3}.....}

        int [] arr={1, 2, 3, 4, 5};
        //          0  1  2  3  4 --> INDEX numbers
        System.out.println("arr 1D: " + arr.length); // <- 5
        int [] [] arr2={   {10, 20, 30} , {0, 20, 40} , {20, 40} , {50}};
        // Container indexes -> 0              1            2        3
        // Index for each -> 0   1   2  ,  0   1   2  ,   0   1  ,   0
        System.out.println("arr 2D: " + arr2.length); // 3
        System.out.println(arr2[2].length);           // 2
        // First bracket is always container number
        // Second one is indexed of variable
        System.out.println(arr2 [1] [2]); // arr2[1][2]  : get index1 container and get index2 from index1 container
        // Print "30"
        System.out.println(arr2 [0] [2]);
        // Print "50"
        System.out.println(arr2 [3] [0]);
        System.out.println("***********************");
        // How to get the length of each container?
        System.out.println(arr2[0].length);
        System.out.println(arr2[2].length);
        System.out.println(arr2[3].length);
        // How to print all the numbers of specific container?
        System.out.println(Arrays.toString(arr2 [2] ));
        int [] container0= arr2 [0];
    }
}
