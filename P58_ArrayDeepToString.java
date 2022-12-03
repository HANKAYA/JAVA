package code.PRACTICE_JAVA;

import java.util.Arrays;

public class P58_ArrayDeepToString {
    public static void main(String[] args) {
        int [] number= {1, 2, 3};
        System.out.println(Arrays.toString(number));
        // 2D
        int [] [] number2D= { {1, 2} , {2, 3, 4} , {4} };
        System.out.println(number2D);
        System.out.println(Arrays.toString(number2D));
        System.out.println(Arrays.toString(number2D[0]));
        System.out.println(Arrays.deepToString(number2D));
    }
}
