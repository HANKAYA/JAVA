package code.PRACTICE_JAVA;

public class P26_SwitchStatement {
    public static void main(String[] args) {


        // Create a java program that will take numbers between 1-12
        // Print months name depends on number
        // Ex
        // 1 -- Jan
        // 5 -- May

        int number = 9;
        String monthName;
        switch (number){
            case 1 : monthName ="Jan" ; // Switch will check number and if it matches with case =1
                // it will make monthName as a Jan
                break;// Break will break all switch after catching the matching case
            case 2 : monthName ="Feb";
                break;
            case 3 : monthName ="March";
                break;
            case 7 : monthName ="July" ;
                break;
            case 4 : monthName ="Apr";
                break;
            case 5 : monthName ="May" ;
                break;
            case 6 : monthName ="Jun" ;
                break;
            case 8 : monthName ="Aug" ;
                break;
            case 9 : monthName ="Sep" ;
                break;
            case 10 : monthName ="Oct" ;
                break;
            case 11 : monthName ="Nov" ;
                break;
            case 12 : monthName ="Dec" ;
                break;
            default: monthName = " invalid number entered please check your number !!!!";
        }
        System.out.println(monthName);
    }
}
