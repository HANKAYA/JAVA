package code.PRACTICE_JAVA;

public class P4_AritmeticOperators {


    //        float                4 bytes            Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    //        double           8 bytes            Stores fractional numbers. Sufficient for storing 15 decimal digits

    public static void main(String[] args){

        double d1=5.5;
        System.out.println(d1);
        double d2=2.3333333;
        System.out.println(d2);
        System.out.println(4.5); // Any decimal numbers that are not defined with variable will be taking as a double
        float f1=2.5f; // Java will take decimal numbers as a double that's why we need to tell compiler this is a float
        System.out.println(2+5);
        System.out.println("2+5");

        int i1=3;
        int i2=5;
        // Sum of two numbers
        System.out.println(i1+i2); // its the tottal of i1 and i2
        System.out.println(i2-i1);

        double d3=5.5;
        double d4=3.5;
        System.out.println(d3+d4); // Result will be 9.0

        // ------------------ (+),(-),(x),(/) -----------------------------//

        byte hanAge=33;
        byte nickAge=57;

        double gabbyAge=27.5;
        double oumaAge=19.2;

        //(+)
        System.out.println(hanAge+nickAge);
        //(-)
        System.out.println(nickAge-gabbyAge);
        //(*)
        System.out.println(hanAge*oumaAge);
        System.out.println(nickAge*4);
        //(/)
        System.out.println(nickAge/2);
        System.out.println(hanAge/oumaAge);

    }
}
