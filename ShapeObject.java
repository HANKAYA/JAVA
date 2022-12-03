package code.PRACTICE_JAVA;

public class ShapeObject {

    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle(3,5);
        // Area of Rectangle 1 == width * length = 15
        rectangle1.shapeName();
        rectangle1.shapeArea();

        Square square1 = new Square(4);
        // Area of Square1 == 16
        square1.shapeName();
        square1.shapeArea();
    }
}
