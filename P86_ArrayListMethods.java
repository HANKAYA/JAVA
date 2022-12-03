package code.PRACTICE_JAVA;

import java.util.ArrayList;

public class P86_ArrayListMethods {
    public static void main(String[] args) {
        // add -- get -- size

        ArrayList<Integer> numbers= new ArrayList<>(); // ==> size is 0
        // " add " method will always add at the end
        numbers.add(  5); // INDEX --> 0
        numbers.add( 50); // INDEX --> 1
        numbers.add(500); // INDEX --> 2
        System.out.println(numbers);    // [5,50,500]
        numbers.add(0,20); // [20,5,50,500]
        System.out.println(numbers);
        numbers.add(2,100);// [20,5,100,50,500] <== Always add 1st INDEX then DATA
        System.out.println(numbers);
        int sizeOfList= numbers.size();
        System.out.println("sizeOfList = " + sizeOfList); // Size is 5 -- Index is 4
        numbers.add(5,47);
        System.out.println(numbers);    // [20,5,100,50,500,47]
        int sizeOfList2= numbers.size();
        System.out.println("sizeOfList2 = " + sizeOfList2);

        ArrayList<String > letters=new ArrayList<>();
        System.out.println(letters);
        letters.add("B");
        letters.add("X"); // 1

        System.out.println(letters);  // [B, X]

        letters.add(1,"A");// [B, A,X]
        System.out.println(letters);

        letters.set(0,"N");
        System.out.println(letters);  //[N, A,X]

        letters.add("A");
        System.out.println(letters);  //[N, A, X, A]

        //remove
        letters.remove("A");
        System.out.println(letters);  // [N, X, A]
        letters.remove(0);
        System.out.println(letters);  // [X, A]

        letters.remove("T");
        System.out.println(letters);
        // Remove method will look at given object or index to remove it if it is present it will remove
        //                if it is not present nothing will change

        boolean b1=letters.remove("R"); //false
        System.out.println(b1);

        //clear
        letters.clear();
        System.out.println(letters);  // []
        if (letters.size() == 0 ){
            System.out.println("Clear method worked");
        }else {
            System.out.println("Clear method is not working");
        }
    }
}
