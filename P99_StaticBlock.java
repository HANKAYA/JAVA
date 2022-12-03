package code.PRACTICE_JAVA;

public class P99_StaticBlock {
    // in Java, we have class members : class , method , variables
    // Optional you can create a block

    int instanceVariable= 10;
    static  int staticVariable= 20;

    public static void main(String[] args) { // Static Method
        System.out.println("This is main method ");
        methodStat();
        // methodInstance

        P99_StaticBlock obj1= new P99_StaticBlock();
        obj1.methodInstance();

        P99_StaticBlock obj2= new P99_StaticBlock();
        obj2.methodInstance();

    }public static void methodInstance(){
        System.out.println("Instance Method ");

    }public static void methodStat(){
        System.out.println("Static Method ");
    }
    //blocks
    {
        //instance block
        System.out.println("This is instance block");
    }

    static {
        System.out.println("Static Block");
    }

    // instance block : will be executed for any new object
    // static block : will be executed once before everything

}
