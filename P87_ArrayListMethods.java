package code.PRACTICE_JAVA;

import code.MyUtils.GenericUtils;

import java.util.ArrayList;
import java.util.Collections;

public class P87_ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(110);
        list.add( 33);
        list.add(-11);
        list.add(-47);

        // Index of(Object) will print index number of the object that you are passing
        // If that object is present in your list you will get index number
        // If object is not present you will get index as -1

        System.out.println(list.indexOf( 33)); //  1
        System.out.println(list.indexOf(-47)); //  3
        System.out.println(list.indexOf(  0)); // -1
        System.out.println(list.indexOf(500)); // -1

        GenericUtils.Stars();

        ArrayList<String> list2= new ArrayList<>(); // ==> String for letter
        list2.add("A");
        list2.add("B");
        System.out.println(list2.indexOf("A")); //  1
        System.out.println(list2.indexOf("b")); // -1
        // Contains return boolean condition
        System.out.println(list2.contains("B"));// TRUE
        // All the methods we used with arraylist will return wrapper class object
        // We can store either in wrapper or primitive
        boolean b1= list2.contains("X");        // FALSE - Unboxing
        // "Collections" is a library which is very useful with arraylist
        // "Collection"  is data structure <== Two different ..tion - ...tions
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        // EQUALS Method
        ArrayList<Integer> num1= new ArrayList<>();
        num1.add(5);
        num1.add(2);
        ArrayList<Integer> num2= new ArrayList<>();
        num2.add(5);
        num2.add(2);
        num2.add(2);
        boolean b2= num1.equals(num2);
        System.out.println(b2);
        Collections.sort(num2);
        System.out.println(num2);
        for (int each: num2){
            System.out.println(each);
        }
        System.out.println("**************");
        //isEmpty
        num2.clear();
        System.out.println(num2.isEmpty());
        System.out.println(num2.size());
    }
}
