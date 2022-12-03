package code.PRACTICE_JAVA;

public class Car {

    // Even if you don't create one constructor java will create one as default.
    // INSTANCE VARIABLES
    String   brand;
    int       year;
    double   price;
    String   color;

    // C O N S T R U C T O R
    // <<<<<<<<< H E A D
    // We need access modifier and class name in order to create a constructor.

    // E X A M P L E
                    // ==========
    // >>>>>>> 028c78cc4b9834e218a1c35e4ea950635a31d56d
    public Car(String brand, int year, double price, String color) { // 4 parameters
        this.brand = brand;
        this.year =   year;
        this.price = price;
        this.color = color;
    }

    public Car(String brand, int year){ // TWO parameters
        // This keyword used to point instance variable in the class
        this.brand = brand;
        this.year  = year ;

    }
    // Convert object to String and will return object as String.
    public String toString(){
        return year+ " , "+brand+" , "+color+" , "+price;
    }
    public void getCarBrandYear(){
        System.out.println("brand is "+brand);
        System.out.println("year is " +year );

    }
}
