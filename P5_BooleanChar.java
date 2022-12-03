package code.PRACTICE_JAVA;

public class P5_BooleanChar {
    public static void main(String[] args) {

        // boolean  1 Bit Stores true or false values
        // char 2 Bytes Stores a single character letter or ASCII values "a"

        // Choose first dataType variableName=data;

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 > 15; //FALSE
        System.out.println(b3);
        System.out.println(b1);

        char c1='a'; // Char will only SINGLE letter or number.
        System.out.println(c1);

        // == (Means EQUAL)
        // ! (Means NOT EQUAL)
        boolean b4= 25 == 30;
        boolean b5= 20 != 21;
        System.out.println(b4);
        System.out.println(b5);

        // ! Not Equal type
        System.out.println(true == false);
        System.out.println(!true== false); // False equal to False so result will be TRUE
        System.out.println(!true!=!false); // False is not equal True so result will be TRUE
        System.out.println( ! ( true == false) ); // First inside the parenthesis is false, outside the p is false R is True
        System.out.println( ! ( true == true ) == (false == !true)); // F A L S E

        // char 2 Bytes Stores a single character letter or ASCII values "a"
        char c2='b';
        char c3='4';
        char c4='@';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        int   i=97;
        char c5=97; // ASCII TABLE all characters has a number on that table
        int  i2=65;
        char c6=65;
        char c7='A';
        System.out.println(i);
        System.out.println(c5);
        System.out.println(i2);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(i2+c6); // [ int+char ] = ??? 65+65 = 130
                                   // JAVA will sum the ASCII value as result

    }
}