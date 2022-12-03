package code.PRACTICE_JAVA;

public class P100_StaticBlock {

    // ==> S T A T I C    V A R I A B L E S <==

    static int a1=  10;
    static int a2=  20;
    static int a3= 100;

    // [ non - static ] -- [ instance variable ]
    int   b;  // As default, it will int default value, which is 0
    int age= 200;

    public static void main(String[] args) {
        // Because " a1 " and " a2 " have static keyword , we can direct use them
        System.out.println(a1); // --> 10 , after static block a value will be 99 because it's in the static block.
        System.out.println(a2); // --> 20
        System.out.println(a3); // --> 100 , 89 after static block.

        P100_StaticBlock obj = new P100_StaticBlock();
        System.out.println(obj.b);      // --> 0
        System.out.println(obj.age);    // --> 200
        System.out.println("*****************************************");

        // ==> method2(); it will give error if you want to directly access to non-static static method.
        method1(); // It doesn't show any Error
        // What should we do to access to method2 which is not static ?
        P100_StaticBlock obj2= new P100_StaticBlock();
        obj2.method2(); // I was able to access to method2, which is not static, after creating object of the class.

    }
    static {  // This is a static block, no matter where it's located.
        System.out.println("Hello Java! "); // JAVA will print " Hello Java! " before everything.
        System.out.println("WELCOME MR HAN ");
        a1  = 99;
        a3 = 89;
        if (400 != 200){ // T R U E statement
            a1 = 35; // " a " will be 35
            System.out.println("What would you like to do sir? ");
        }
    }
    // This method is static because it has static keyword.
    public static void method1(){
        System.out.println("-----------------------------------------");
    }
    // NON - STATIC
    public void method2() {
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }

}


