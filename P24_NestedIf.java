package code.PRACTICE_JAVA;

public class P24_NestedIf {
    public static void main(String[] args) {


        // Simply nested if is if conditions inside of if conditions
        // If the main is condition is true then you will check sub if conditions

        // To comment everything choose the area
        // Then hold on ctrl (windows) + /
        // Then hold on command(mac)  + /

        // To get back things that you deleted
        // Command + z
        // Ctrl + z

        // ---------------------------------------------------------------------------------------
        //  T H I S    T A S K

        // Create a java program that takes score of student and prints the grade of student
        // Between 100 and 51 is grade A
        // Between   0 and 50 is grade B
        // If number is not between 0-100 grade 0 ,,"invalid number"
        // If students absent
        // Having student present
        // Check student grades
        // Having student absent
        // No need to check student grade


        int score=-20;
        String  attend="yes";    // Yes No
        String  result= "  ";

        if (attend == "yes"){    // Java is case-sensitive
            if        (score>=51 && score <=100){
                result = " Student was present and Score is: "+  score +" Grade is A";
            } else if (score>= 0 && score <  51){
                result = " Student was present and Score is: "+  score +" Grade is B";
            }else {
                result = " Student was present and Score is: "+  score +" Invalid Number";
            }
        }else if (attend == "no"){
            result = "-----------Student was Absent --- no need to check score";
        }else {
            result ="!!!!!invalid text for attendance please check attendance "+ attend;
        }
        System.out.println(result);
    }
}
