package code.PRACTICE_JAVA;

public class P42_JavaPractice {
    public static void main(String[] args) {

        // Write a java program that will check numbers from 1-50
        // If number is divisible by 2 print JA                      number % 2 ==0
        // If number is divisible by 3 print VA                      number % 3 ==0
        // If number is divisible both by 2 and 3 JAVA               number % 2 ==0  &&  number %3 ==0
        // If it is not divisible by 2 or 3 print number itself      number % 2 !=0  &&  number %3 !=0

        // Expected result : // 1  2    3    4    5   6 ...50
        // 1  JA   VA   JA   5  JAVA

        String result="";
        int count2and3=0;

        for (int i =1 ; i<20 ; i++){  // for i =1  i=2 i3

            if (i % 2 == 0 && i % 3==0 ){//true
                result += "JAVA ";
                count2and3++; // 0 1 2 3
            }else if (i % 3==0 ){
                result +="VA ";
            }else if ( i % 2 == 0 ){
                result +="JA "; //result = 1 JA
            }else {
                result += i + " "; //result= 1
            }

        }
        System.out.println("result = " + result);
        System.out.println("count2and3 = " + count2and3);
    }
}
