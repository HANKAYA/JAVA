package code.PRACTICE_JAVA;

public class P126_AbstractionPractice extends abstractClass1{

    @Override
    public void abstractMethod1 (){
        System.out.println("Abstract method in abstract class ");
    }
    // Extends will apply inheritance logic, which means it will extend. Belows are going to be extended
    // method2 abstract-method1
}
abstract class abstractClass1{
    public abstract void abstractMethod1();
    //no body needed in abstract methods
    //it needs to be overriden

    public void method2(){
        System.out.println("method 2 ");
    }

}

abstract class abstractClass2 extends abstractClass1{
    // Belows are going to be extended
    // method2 abstract-method1

    // Abstract classes can have regular method and abstract method
    // Extend abstract method and method2
    // public abstract void abstractMethod1();
    // public void method2(){body}

    abstract void abstractMethod3();
}
class class3 extends abstractClass2{
    // abstractMethod1();  method2()  ;abstractMethod3(); will be inherited as soon as you extend
    @Override
    public void abstractMethod1() {
    }
    @Override
    void abstractMethod3() {
    }
}


// parent : abstract 2   ;;;abstractMethod1();  method2()  comes from grandparent abstractClass1
// child : class3

