package code.PRACTICE_JAVA;

public class Rectangle extends Shape{

    // Inherited ==> Shape Name - Shape Area
    // Abstract methods are meant to be over-ride
    // So I need to override my abstract methods in order to not have issue

    public final String shapeName= "Rectangle";
    public double width ;
    public double length;
    public Rectangle(double width, double length){
        this.width = width ;
        this.length= length;
    }
    @Override
    void shapeName(){
        // Rectangle area is: width + length
        double area= width * length;
        System.out.println("Area of " +shapeName+ " is " +area);
    }

    @Override
    void shapeArea(){
        System.out.println("shapeName = " + shapeName);
    }

}
