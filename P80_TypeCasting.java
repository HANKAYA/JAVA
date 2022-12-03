package code.PRACTICE_JAVA;

public class P80_TypeCasting {

    // Type Casting
    // 1.Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing.
    // For example, converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:
    // Passed as a parameter to a method that expects an object of the corresponding wrapper class.
    // Assigned to a variable of the corresponding wrapper class.
    // 2.Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
    // For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:
    // Passed as a parameter to a method that expects a value of the corresponding primitive type.
    // Assigned to a variable of the corresponding primitive type.
    // The following table lists the primitive types and their corresponding wrapper classes,
    // Which are used by the Java compiler for autoboxing and unboxing:
    // Primitive Data Type	Wrapper Class
    // byte                 Byte
    // shor                 Short
    // int	                Integer
    // long	                Long
    // float	            Float
    // double	            Double
    // boolean	            Boolean
    // char	                Character

    public static void main(String[] args) {
        String str = new String("Hello");
        // Create an Integer Object
        Integer IN1= new Integer(10);
        int      i1= IN1;    // UNBOXING...
        // Converting an object of wrapper class to primitive int
        Character myCH= 'w'; // AUTOBOXING...
        char    ch2= myCH;   // UNBOXING...
        System.out.println("myCH= " + myCH);
        System.out.println("ch2= "  + ch2 );
        int number = 100;    // PRIMITIVE...
        Integer IN2= number; // AUTOBOXING...
        Byte myByte=26;
        byte b1=myByte;      // UNBOXING...
    }
}
