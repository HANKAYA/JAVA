package code.PRACTICE_JAVA;

import java.util.ArrayList;

public class P85_ArrayListReverse {
    public static void main(String[] args) {
        // Write a program that can print the list of integers in Reversed Order
        // E X A M P L E ==> list=> {1,2,3,4,5,6} ---- output: 6 5 4 3 2 1

        ArrayList<Integer> list= new ArrayList<>();
        for (int i= 1; i <= 10; i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println("reverseArrayList () = " + reverseArrayList(list));
    }
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer>numbers){
        ArrayList<Integer> reversedList= new ArrayList<>();
        for (int i= numbers.size()-1; i>=0; i--){
            reversedList.add(numbers.get(i));
        }
        return reversedList;
    }
}
