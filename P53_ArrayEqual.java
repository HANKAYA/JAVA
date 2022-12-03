package code.PRACTICE_JAVA;

import java.util.Arrays;

public class P53_ArrayEqual {
    public static void main(String[] args) {

        // A R R A Y   E Q U A L
        int [] arr1= {3,5,7};
        int [] arr2= {5,3,7};
        int [] arr3= {3,5,7};
        int [] arr4= {3,4,7};
        boolean b1= Arrays.equals(arr1,arr2); // F A L S E
        boolean b2= Arrays.equals(arr1,arr3); // T R U E
        boolean b3= Arrays.equals(arr2,arr3); // F A L S E
        boolean b4= Arrays.equals(arr3,arr4); // F A L S E
        System.out.println(b1+ " , " +b2+ " , " +b3+ " , "+b4);

        // Only condition that Arrays will be equal if both Arrays are equal with value and order

        Arrays.sort(arr1); // {3,5,7};
        Arrays.sort(arr2); // {5,3,7};
        Arrays.sort(arr3); // {3,5,7};
        Arrays.sort(arr4); // {3,4,7};

        boolean b5= Arrays.equals(arr1,arr2); // T R U E
        boolean b6= Arrays.equals(arr1,arr3); // T R U E
        boolean b7= Arrays.equals(arr2,arr3); // T R U E
        boolean b8= Arrays.equals(arr3,arr4); // F A L S E
        System.out.println(b5+ " , " +b6+ " , " +b7+ " , "+b8);

    }
}
