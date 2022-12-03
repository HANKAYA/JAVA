package code.PRACTICE_JAVA;

public class P108_AccessModifiers {

    // Access modifiers: public, protected, default, private
    // Access modifiers explain your access level to the variable ,method or class

    // Private: The access level of a private modifier is only within the class.
    // It cannot be accessed from outside the class.
    // Default: The access level of a default modifier is only within the package.
    // It cannot be accessed from outside the package.
    // If you do not specify any access level, it will be the default.
    // Protected: The access level of a protected modifier is within the package
    // And outside the package through child class.
    // If you do not make the child class, it cannot be accessed from outside the package.
    // Public: The access level of a public modifier is everywhere.
    // It can be accessed from within the class, outside the class, within the package and outside the package.

    public  int   publicVariable    = 10; // <- Instance Public
    private int   privateVariable   = 20; // <- Instance Private
    int           defaultVariable   = 30; // <- Instance Default
    protected int protectedVariable = 40; // <- Instance Protected

    public static void main(String[] args) {
        // [ To be able to call instance variable we need to create ann object ]
        P108_AccessModifiers obj1 = new P108_AccessModifiers();
        // We crete an object from class with help of constructor
        System.out.println("obj1.publicVariable  = "   + obj1.publicVariable  );
        System.out.println("obj1.privateVariable = "  + obj1.privateVariable  );
        System.out.println("obj1.defaultVariable = "  + obj1.defaultVariable  );
        System.out.println("obj1.protectedVariable = "+ obj1.protectedVariable);
    }
}
