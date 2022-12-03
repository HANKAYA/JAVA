package code.PRACTICE_JAVA;

public class P104_StaticBlock {

    // S T A T I C   V A R I A B L E S

    static  int a1=  10;
    static  int a2=  20;
    static  int a3= 100;
    // Non-Static , instant variable
    int b; // As Default, It will int default value, which is 0
    int age= 200;

    public static void main(String[] args) {
        // Because " a1 " and " a2 " have static keyword , we can direct use them
        System.out.println(a1); // --> 10 , after static block a value will be 99 because it's in the static block.
        System.out.println(a2); // --> 20
        System.out.println(a3); // --> 100, 89 after static block
        // if you want to use non-static variables , we will need to create an object of the class
        P104_StaticBlock obj1  = new P104_StaticBlock();
        System.out.println(obj1.b  ); // --> 0
        System.out.println(obj1.age); // --> 200
        System.out.println("**************************************");
        // [ method2(); ] it will give error if you want to directly access to non-static static method.
        method1(); // No Error
        // wWat should we do to access to method2 which is not static ?
        P104_StaticBlock obj2  = new P104_StaticBlock();
        obj2.method2(); // I was able to access to method2, which is not static, after creating object of the class.
    }
    static {   // This is a static block, no matter where it's located.
        System.out.println("Hello Java"); // JAVA  will print Hello Java! before everything.
        System.out.println("WELCOME MR HAN");
        a1 = 99;
        a2 = 89;
        if (400 != 200){ // TRUE statement
            a1 = 35; // " a1 " will be 35
            System.out.println("Hello HAN");
        }
    }
    // This method is static because it has static keyword.
    public static void method1(){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
    public static void method2(){
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
}
