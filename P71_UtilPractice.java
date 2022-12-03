package code.PRACTICE_JAVA;

import code.MyUtils.GenericUtils;

import java.util.Arrays;

public class P71_UtilPractice {
    public static void main(String[] args) {
        GenericUtils.Stars();
        GenericUtils.hello();
        GenericUtils.reverseString("Han is an Engineer");
        int []arr1= {4,5,3,0,-2,200,500,55};
        GenericUtils.descendingSort(arr1);
        int [] result=GenericUtils.descendingSort2(arr1);
        System.out.println(Arrays.toString(result));
    }
}
