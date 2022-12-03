package code.PRACTICE_JAVA;

public class P124_FinalVariables {

    // Differences between ( finally ) and ( final ) keyword

    // " finally " is used with try catch block it will get executed always

    // " final " keyword is used to make things not changeable

    int instanceVariable;
    static int staticVariable;
    final int instanceVariable2= 100;
    final static int staticVariable2= 200;

    public static void main(String[] args) {
        staticVariable= 10;
        P124_FinalVariables obj1 = new P124_FinalVariables();
        obj1.instanceVariable  =  20;

        //        obj1.instanceVariable2=500;
        //        staticVariable2=300;
        // final keyword will make variable not changeable

    }
}
