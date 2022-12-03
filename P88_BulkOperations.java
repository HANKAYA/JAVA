package code.PRACTICE_JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P88_BulkOperations {

    /*
       Bulk Operations:
       containsAll(CollectionType):
       addAll(CollectionType):
       removeAll(CollectionType):
       retainAll(CollectionType):
       //
      */
    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(3,5,10,87,123,45,343,78,9,0));
        System.out.println(numbers);
        Integer [] N1= {0,2,3,57,6};
        numbers.addAll(Arrays.asList(N1));
        numbers.add(10000);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        // CONTAINS
        System.out.println(numbers.contains(0));
        // ==> containsAll(CollectionType);
        System.out.println("numbers.containsAll(Arrays.asList(0,2,10,45,57)) = " + numbers.containsAll(Arrays.asList(0, 2, 10, 45, 57)));
        System.out.println("numbers.containsAll(Arrays.asList(0,2,10,45,57)) = " + numbers.containsAll(Arrays.asList(0, 2, 11, 45, 57)));
        // " removeAll " <== This will remove all the matching objects from the ArrayList
        // " remove " <== will remove only first matching one
        ArrayList<Double> nList= new ArrayList<>();
        nList.addAll(Arrays.asList(1.0,2.0,2.5,1.0,2.0,1.0,5.4,6.3,2.0,2.0,2.0,2.0));
        Double num= 2.0;
        nList.remove(num); // This will remove first  " 2.0 "
        nList.remove(num); // This will remove second " 2.0 "
        System.out.println(nList);

        // If you want to move all the 1.0 ( for example )
        nList.removeAll(Arrays.asList(1.0));
        System.out.println(nList);

        // " retainAll " (CollectionType):
        // That will search  for given data it will keep them and others will be removed
        ArrayList<Integer> list5=  new ArrayList<>();
        list5.addAll(Arrays.asList(1,1,11,1,1,2,2,2,3,3,3,55,5,54,4));
        System.out.println(list5);
        list5.retainAll(Arrays.asList(11,2)); // <== With this code it will keep the " 11,2 " and it will erase the rest
        System.out.println(list5);
    }
}
