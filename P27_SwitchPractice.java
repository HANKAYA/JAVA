package code.PRACTICE_JAVA;

public class P27_SwitchPractice {
    public static void main(String[] args) {

        // 3 cases with A B C
        // If the case is A result should be Hello A
        // If the case is B result should be Hello B
        // If the case is C result should be Hello C
        // If letter is something else then Hello Invalid.

        char   letter =    'X';
        String result ="Hello";

        switch (letter){
            case 'A':
                // result = "Hello a"; no need to reassign we can just add letter A result
                result +="A";
                break;
            case 'B':
                result +="B"; // Hello B
            case 'C':
                result +="C"; // result = result +"C" // result = hello B C
                break;
            default:
                result +=" invalid";
        }
        System.out.println(result);

        // in switch first it will check matching case
        // Then it will execute all the lines after matching cases if there is no break
        // If there is break it will only execute same line and then break rest of it
    }
}
