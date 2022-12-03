package code.PRACTICE_JAVA;

public class P107_PrintOrder {
    public P107_PrintOrder(){        // When we create a new object constructor block will run
        System.out.println("Default constructor ");
    }
    public static void main(String[] args) {
        System.out.println("Main method started ");
        P107_PrintOrder obj1 = new P107_PrintOrder();
    }
    static {   // <== Static Block
        System.out.println("Static Method ");
    }
    { // <== When we create a new object instance block will run
        System.out.println("Instance Block");
    }
    public static void methodStatic(){ // if we call it , it will run
        System.out.println("Static Method ");
    }
    public void instanceMethod(){
        System.out.println("Instance Method");
    }
}

         // 1.Static block
         // 2.Main method will run in order of line that we passed

         // Each new object will run instance block and constructor together
         // P107_PrintOrder obj1 = new P107_PrintOrder();
         // First instance block will get executed before constructor
