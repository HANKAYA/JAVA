package code.PRACTICE_JAVA;

import code.MyUtils.GenericUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

import static code.MyUtils.GenericUtils.descendingSort2;

public class P70_ArraySorting {
    public static void main(String[] args) {
        int [] numbers= {5,45,67,89,0,2,4,21,47};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("*******************");
        int [] numbers2= {5,45,67,89,0,2,4,21,47};
        descendingSort(numbers2);
        GenericUtils.Stars();
        descendingSort(numbers2);
        GenericUtils.Stars();
        int [] descendingResult = descendingSort2(numbers2);
        System.out.println(Arrays.toString(descendingResult));
        // int [] descendingResult= descendingSort(numbers2); --> T H I S won't work because void doesn't give you return
        int [] descendingResult2= descendingSort2(numbers2);
        System.out.println(Arrays.toString(descendingResult));
    }
    // Create a method that will sort array ---> descending order
    public static void descendingSort(int [] arr){
        // First I will sort it and reverse to array, so I can have from large to small
        Arrays.sort(arr);
        int [] descArr= new int[arr.length];
        int lastIndex = arr.length -1;
        for (int i= 0; i < descArr.length; i++){
            // descArr[0] == arr[lastIndex]
            // descArr[1] == arr[lastIndex-1]
            // descArr[2] == arr[lastIndex-2]
            // descArr[3] == arr[lastIndex-3]
            //....
            // descArr[lastIndex]==arr [0]
            descArr [i]= arr[lastIndex];
            lastIndex--;
        }
        System.out.println(Arrays.toString(descArr));
    }
}
