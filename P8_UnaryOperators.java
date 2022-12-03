package code.PRACTICE_JAVA;

public class P8_UnaryOperators {
    public static void main (String [] args){

        // ( + )-( ++ )-( - )-( -- )
        int n1=20;
        int n2=15;
        int n3= +n1; // 20
        int n4= -n1; //-20
        System.out.println("Number 3: "+n3);
        System.out.println("Number 4: "+n4);

        int x= 10;
        int y= -x; // y= -10
        System.out.println(y);

        boolean b1= y > 0;  // -10 > 0 ( FALSE )
        boolean b2= x >=0;  //  10 > 0 ( TRUE  )
        System.out.println(b1);
        System.out.println(b2);

        int i1 = -15;
        int i2 = +i1;
        int i3 =  i1 + -i1;
        int i4 = -i1;
        int i5 = -i3;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

    }
}
