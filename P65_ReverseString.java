package code.PRACTICE_JAVA;

import code.MyUtils.GenericUtils;

public class P65_ReverseString {
    public static void main(String[] args) {
        // Arrays.sort();
        P64_MethodsWithParameters.ageCategory(0);
        GenericUtils.hello();
    }
    // You must create your own library that will reverse any string
    // This method will accept a String for us to reverse it
    public static void ReverseString(String name){
        String ReversedResult= "";
        for (int i = name.length() -1; i>=0; i--){
            ReversedResult += name.charAt(i);
        }
        System.out.println("ReversedResult = " + ReversedResult);

    }
}
