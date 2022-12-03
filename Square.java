package code.PRACTICE_JAVA;

public class Square extends Shape{

    // If I extend parent class that has abstract methods
    // Those methods needs to override otherwise your class will give you issues

    public final String shapeName= "Square";
    public double length;
    public Square(double length){
        this.length= length;
    }

    @Override
    void shapeName(){
        System.out.println("shapeName= "+shapeName);
    }
    @Override
    void shapeArea(){
        double area = length * length;
        System.out.println("Area of " +shapeName+ " is " +area);

    }
}
