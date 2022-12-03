package code.PRACTICE_JAVA;

public class P109_AccessTesting {
    public static void main(String[] args) {
        //to be able to call instance variable we need to create ann object

        P108_AccessModifiers obj1=new P108_AccessModifiers(); // <== Called from previous class
        //we crete an object from class with help of constructor

        // System.out.println("obj1.privateVariable = " + obj1.privateVariable);
        System.out.println("obj1.publicVariable    = " + obj1.publicVariable   );
        System.out.println("obj1.protectedVariable = " + obj1.protectedVariable);
        System.out.println("obj1.defaultVariable   = " + obj1.defaultVariable  );

        // Private will have access only in same class
    }
}

