package code.PRACTICE_JAVA;

public class P79_WrapperClasses {

    // P R I M I T I V E   D A T A   T Y P E S
    // byte - short - int - long - float - double - boolean - char


    /// Non-Primitives object and objets are getting created by classes

    //Data Structure:
    //	1. Array
    //	2. Collection ==> only accepts objects
    //	3. Map ==>  only accepts objects

    //	primitives: byte, short, int, long, float, double, char, boolean
    //
    //  wrapper classes:
    //		Byte, Short, Integer, Long, Float, Double, Character, Boolean
    //      byte, short, int,     long, float, double, char,       boolean

    // Java Wrapper Classes
    // Provide a way to use primitive data types (int, boolean, etc..) as objects.

    // The table below shows the primitive type and the equivalent wrapper class:

    // Primitive Data Type	Wrapper Class

    // byte - short - int - long - float - double - boolean - char

    // Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
    // where primitive types cannot be used (the list can only store objects):

    // E X A M P L E
    // ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
    // ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

    public static void main(String[] args) {
        int     i1= 10; // Primitive data type
        Integer i2= 10; // Wrapper class object
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        Double D1 = 5.5;   // Wrapper class object
        Character C1= 's'; // Wrapper class object
        short   S1= 100;   // Primitive data type
        int     i3= 25;    // Primitive data type
        Integer i4= i3;    // Wrapper class object
        //Integer i5= S1;  // Integer is another form of int primitive data type -->
                           // you can not assign different forms it has to be int
        Byte b1=11; // wrapper
        byte b2=13; // primitive
        Byte b3=b2; // wrapper

        //Integer number =b2;   b2 is primitive byte . We can't assign different form to Integer
        //Integer number1=b3;

        System.out.println(b3);

        //== toString
        //we can use to convert wrapper objects to string
        Integer i10=555;
        String str =i10.toString();//"555"
        System.out.println("str = " + str);
        System.out.println(str.length());

    }
}
