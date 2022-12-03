package code.PRACTICE_JAVA;

import java.time.LocalDate;

public class P77_Dates {
    public static void main(String[] args) {


        // Local Date class is coming from java library
        LocalDate obj1= LocalDate.of(2022,9,30);
        // We create objects from classes
        System.out.println(obj1);

        LocalDate obj2= LocalDate.of(2021,4,7);
        System.out.println("obj2 = " + obj2);

        boolean b1= obj2.isAfter (obj1); // F A L S E
        boolean b2= obj2.isBefore(obj1); // T R U E
        boolean b3= obj2.isEqual (obj1); // F A L S E
        System.out.println(b1 + " / " + b2 + " / " + b3);

        // T O D A Y   D A T E
        LocalDate TodayDate= LocalDate.now();
        System.out.println(TodayDate);
        String TodayDateString= TodayDate.toString();
        TodayDateString = TodayDateString.replace("-","."); // CHANGING symbols from "-" TO "."
        System.out.println("TodayDateString = " + TodayDateString);
    }
}
