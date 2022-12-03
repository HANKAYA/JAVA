package code.PRACTICE_JAVA;

public class P23_Ternary {
    public static void main(String[] args) {

        // If else ( if else, if else with ternary )

        // This task :
        // Create a java program that takes score of student and prints the grade of student
        // Between 100 and 85 is grade A
        // Between  70 and 84 is grade B
        // Between  60 and 69 is grade C
        // Between  40 to  59 is grade D
        // Between   0 to  39 is grade E
        // if number is not between 0-100 grade 0 ,,"invalid number"

        // if   == ?
        // else == :
        // : ?  == else if

        int  score =  75;
        char grade = '0';
        String rst =  ""; // "rst" means result
        if       (score >= 85 && score <=100){     // Between 100 and 85 is grade A
            grade = 'A';
        }else if (score >= 70 && score <= 85){     // Between  70 and 84 is grade B
            grade = 'B';
        }else if (score >= 60 && score <= 70) {    // Between  60 and 69 is grade C
            grade = 'C';
        }else if (score >= 40 && score <= 60) {    // Between  40 to  59 is grade D
            grade = 'D';
        }else if (score >=  0 && score <= 40) {    // Between   0 to  39 is grade E
            grade = 'E';

        }else {      // This part will be true if number is minus or bigger than 100
            grade = '0';
        }
        rst = " Student grade is: "+ grade;
        System.out.println(rst);

        char grade2= score >= 70 && score < 85 ? 'B'
                        : score >= 60 && score < 70 ? 'C' : score >= 40 && score < 60 ? 'D'
                        : score >=  0 && score < 40 ? 'E' : '0';

        String result2=" Student grade is: " + grade2;
        System.out.println(result2);

    }
}
