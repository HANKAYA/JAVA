package code.PRACTICE_JAVA;

public class Shoe {

    // E X A M P L E --> Array List Class [ S H O E ]
    // " data: " Can be any type of object --> { data: shoe object }
    // " functions: add , remove, size, get... " --> functions: size, brand, color

    // LOGIC of creating object in Class
    // ArrayList< >   list   = new   ArrayList< > ();
    // ( CLASS )   ( Ref Name )   ( O B J E C T )

    // Shoe Nike= new Shoe ();

    // " class: " it is where you actually implement your code . you store variables methods inside your class
    // This is where you create an object from . Class will explain behaviour of objects

    // " local variables: " Local variables that we declared with in block(main method,other methods ,static block)
    // " instance variables: " object variables that we create inside of class
    // Instance variables can not have static specifier - needs to be declared outside of methods or blocks

    // Access-Modifier =public, protected ,default ,private
    // specifier: static ,final ,abstract ,synchronized
    // return type : void , any datatype(int,string,char , int [] .......)
    // !!! Some method has parameters some don't have parameter

    // " instance variables: " object variables that we create inside of class
    // Instance variables can not have static specifier - needs to be declared outside of methods or blocks

    String brand; // instance variables  , more info: brand size abd color are attribute of the Shoe.
    int size;
    String color;

    //static String brand2; // static variable

    public void wear(){ // function of shoe class

        System.out.println("She/He is wearing "+brand+" .");

    }

    public void getShoeInfo(){
        System.out.println(brand +" ,"+size +" ,"+color);

    }


    //this method will set shoe object information
    public void setShoeInfo(String shoeBrand, int shoeSize, String shoeColor){
        brand=shoeBrand;
        size=shoeSize;
        color=shoeColor;

    }
    //    // toString(): the method gets executed automatically whenever we pass the object name into the print statement
    public String toString() {

        return brand + " / " + size + " / " + color;
    }
}
