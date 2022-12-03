package code.PRACTICE_JAVA;

public class P13_AssignmentOperators {
    public static void main(String [] args){

        int x = 100;
        int y = 200;
        System.out.println(x + "   ,  " + y);

        x = -y; // ( x ) = -200
        System.out.println(x + "  ,  " + y); // -200 , 200
        x -= y;
        System.out.println(x + "  ,  " + y); // -400 , 200

        int z = 10;
        int w = 20;

        z = w -z +10 + --z;
        System.out.println(z);

        int a =10;

        a -= a+a-a+20;
        //a = a - (a+a-a+20);
        //a = 10 -(10+10-10+20)
        //a= 10 - (  30   )
        //-20
        System.out.println(a);

        int number =20;

        number *= 2;  // number = number * 2
        System.out.println(number); //40

        number /= 3;  // number = number / 3
        System.out.println(number);//13

    }
}
