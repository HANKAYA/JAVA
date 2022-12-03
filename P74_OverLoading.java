package code.PRACTICE_JAVA;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class P74_OverLoading {

    // P R I N T  sum of 2 int - 3 int and sum of 2 double numbers

    public static void sum(int a, int b )        {
        System.out.println(a + b);
        System.out.println("*** 2 int sum method ");
    }
    public static void sum(int a, int b, int c ) {
        System.out.println(a + b + c);
        System.out.println("*** 3 int sum method ");
    }
    public static void sum(int a, int b, int c ,int d) {
        System.out.println(a + b + c + d);
        System.out.println("*** 4 int sum method ");
    }
    public static void sum(double a, double b )  {
        System.out.println(a + b);
        System.out.println("*** 2 double sum method ");
    }
    // Public static void sumOf2Numbers(int a , int b){ }  instead of having long method names
    // I can use one method name that will have same functioned but with different loads (method-overloading)
    public static void main(String[] args) {
        sum(10,2);
        sum(104,6,34);
        sum(5.0,2.8);
        sum(14,66,45,81);
    }
}
