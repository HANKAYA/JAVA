package code.PRACTICE_JAVA;

public class P25_NestedIf {
    public static void main(String[] args) {


        // Create a java program to check if person is eligible to give blood
        // Requirement to give blood :
        // Person needs to be older than 18
        // Person weight needs to be more than 50

        // Expected output :
        // If person age is smaller and equal to 18
        // Print :"Person needs to be older than 18
        // If person age is bigger 18 and weight is bigger than 50
        // Person is eligible to give blood

        // Example test data is person age is 15 weight is 150
        // Person needs to be older than 18 "
        // Example test data is person age is 20 weight is 40
        // Person is not eligible to give blood
        // Example test data is person age is 20 weight is 100
        // Person is eligible to give blood

        // Example test data is person age is 18 weight is 55
        // Person needs to be older than 18

        String VolunteerName = "HAN";
        int Age = 33;
        double Weight = 148;
        String Result ="";
        if (Age > 18){
            if (Weight > 120) {
                Result = VolunteerName +    " is eligible to donate blood ";
            }else {
                Result = VolunteerName + " is not eligible to donate blood";
            }
        }else if (Age >0 && Age <= 18){
            Result = VolunteerName + " is need to be older than 18 ";
        }else {
            Result = " Invalid age you entered " + Age;
        }
        System.out.println(Result);
    }
}
