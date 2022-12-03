package code.PRACTICE_JAVA;

public class ConstructorInfo {

    // Constructor in java is a special method that is used to initialize object
    // The Constructor is called when an object of the class is created ,
    // It can be used to set initial values for object attributes.

    // 1- Constructor needs to have same named that class has.
    // 2- Even if you don't create one constructor java will create one as default.

    public ConstructorInfo(){ // <== This is my constructor
        // It will be created by JAVA automatically - " Constructor " will help to create an object
    }
    
    // QUESTION!!! --> Can we overload the Constructor method ? ==> " YES "

    public ConstructorInfo(int a){
        System.out.println("Constructor with argument int " +a );
    }

    public static void main(String[] args) {
        ConstructorInfo obj1 = new ConstructorInfo();  // Created an object with default constructor.
        ConstructorInfo obj2 = new ConstructorInfo(2);  // Created an object with constructor that has parameter.
    }
}
