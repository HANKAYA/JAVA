package code.PRACTICE_JAVA;

import javax.xml.bind.SchemaOutputResolver;

public class P2_Variables{
    public static void main (String[] args){

        System.out.println("Renastech");

        // \t: PROGRAM SPACE

        System.out.println("\tRenastech");
        System.out.println("       Renastech");
        System.out.println("\t\t\t\t\tRenastech");

        // \n: NEW LINE

        System.out.println("Hello World");
        System.out.println("Hello \nWorld");
        System.out.println("Hello \n\tWorld \n\t\tJAVA");

        // \": PRINTS DOUBLE QUOTE ON THE CONSOLE
        // \\: PRINTS "\" ON THE CONSOLE

        System.out.println("\\");
        System.out.println("/");

        //        Primitive Data Types
//        A primitive data type specifies the size and type of variable values, and it has no additional methods.
//
//                There are eight primitive data types in Java:
//
//        Data Type            Size           Description
//        byte             1 byte         Stores whole numbers from -128 to 127
//        short             2 bytes            Stores whole numbers from -32,768 to 32,767
//        int              4 bytes            Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long             8 bytes            Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


//        float                4 bytes            Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double           8 bytes            Stores fractional numbers. Sufficient for storing 15 decimal digits

//        boolean          1 bit          Stores true or false values
//        char             2 bytes            Stores a single character/letter or ASCII values   'a'
//
//primitive data types: byte, short, int, long, float, double, char, boolean
//
//        for numbers: byte, short, int, long, float, double
//
//        whole number: byte, short, int, long
//
//        decimal number: float, double
//
//        range:
//        double > float > long > int > short > byte
//
//        larger one cannot be assigned to smaller one
//        smaller one can be assigned to larger one
//
//
//        As a default java picks int for whole number
//        As a default java picks double for decimal number
//
//
//
//        Non primitive types: String, Object
//        There are also reference types that wrap the primitive types.
//        These can be useful if you need a make a variable null or use it in a class that requires a non-primitive type
//
//        Non primitives are usually objects that we create (the exception being String)



            //        for numbers: byte, short, int, long, float, double
            //        whole number: byte, short, int, long
            //        decimal number: float, double
            //        range:
            //        double > float > long > int > short > byte

            //        byte             1 byte         Stores whole numbers from -128 to 127

            //byte number1=135;  this will give error because its out of byte range
            byte number2=-23;
            //byte number3=5.5; we cant assign decimal number to byte

            System.out.println(number2);

            //to get back what you deleted use below comment :
            //ctrl + Z for windows users
            //command + Z for mac users

            byte number3=-100;
            System.out.println(number3);


            //        short             2 bytes            Stores whole numbers from -32,768 to 32,767
            short s1=128;
            short s2=25;
            short s3=20000;
            //short s4=40000; out of range

            System.out.println("*****************");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);

            //        int              4 bytes            Stores whole numbers from -2,147,483,648 to 2,147,483,647
            int i1=123134;
            System.out.println(i1);
            //int i2=20000000000; out of range
            // Lets say the number is very long .....
            //int viewsCount= 3_458_239_405; // failed so how you can fix it with 'long' code and 'l' at the end
            long viewsCount= 3_458_239_405L;
        System.out.println("viewsCount");

        System.out.println("35"); //this is text
            System.out.println(35); //this is actual number
            ////        As a default java picks int for whole number


            //        long             8 bytes        Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

            long evin=2000;
            long l2=20000000000L;//when you move out from int range compiler needs to know what is this number
            //thats why we pass L at the end to tell java this is long number

            System.out.println(evin);
            System.out.println(l2);

            //-------------------------------------------------------

        //    escape sequences:
//   \t: paragraph space
//  \n: new line
//  \": prints double quote " on the console
//  \\: prints \ on the console
//  \': prints single quote
//   ' : prints single quote



            System.out.println("Renastech");

            //   \t: paragraph space
            System.out.println("\tRenastech");
            System.out.println("      Renastech");
            System.out.println("\t\t\t\t\tRenastech");

            //  \n: new line
            System.out.println("Hello World");
            System.out.println("Hello \nWorld");
            System.out.println("Hello \n\tWorld \tJava");

            //  \\: prints \ on the console
            System.out.println("\\\\");
            System.out.println("//");

            //  \": prints double quote " on the console
            System.out.println("Today is \"Tuesday\" . ");


            //  \': prints single quote
            //   ' : prints single quote
            System.out.println("Today is \'Friday\' .");
            System.out.println("Today is 'Friday' .");

            //----------------------------------------------------------------------------------

        //        float                4 bytes            Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        //        double           8 bytes            Stores fractional numbers. Sufficient for storing 15 decimal digits

        //        As a default java picks double for decimal number



            double d1=5.5;
            System.out.println(d1);
            double d2=2.33333333333;
            System.out.println(d2);

            System.out.println(4.5);//any decimal numbers that are not defined with variable will be taking as a double

            float f1=2.5f;//java will take decimal numbers as a double thats why we need to tell compiler this is a float number


            System.out.println(2+5);//this is number result will be 7
            System.out.println("2+5");//this one is text result will be 2+5

            int i3=6;
            int i2=3;

            //sum of 2 numbers
            System.out.println(i1 + i2);//number + number = number 8
            System.out.println(i1 - i2);

            double doubled1=5.5;
            double doubled2=3.5;

            System.out.println(doubled1 + doubled2);//9.0

            //minus operator
            System.out.println(i2-i1);
            System.out.println(d1-d2);

        }

    }


