package code.PRACTICE_JAVA;

public class P110_MalePerson {
    public static char gender ='M'; // public and unique variable
    //access level : everywhere

    public static boolean isHuman=true; // public and unique variable
    //access level : everywhere

    public String name; // public and not unique
    //access level : everywhere

    int age; // default and not unique
    //access level : only in same package

    private static long ID=21342543456L;  // priavte and  unique
    //access level : only in same class
}
