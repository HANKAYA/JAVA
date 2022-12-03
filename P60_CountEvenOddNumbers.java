package code.PRACTICE_JAVA;

public class P60_CountEvenOddNumbers {
    public static void main(String[] args) {
        // Create a Java program count ODD or EVEN numbers
        int [] numberList={33,4,5,6,7,0,19,24,66,78,100,33,35,38,39}; // Even count: 8 -- Odd Count: 7
        int evenCount= 0;
        int oddCount = 0;
        for (int a: numberList){
           if (a %2 ==0){
               evenCount++; // For Even numbers
           }else {
               oddCount ++; // For Odd numbers
           }
        }
        System.out.println("evenCount = " + evenCount);
        System.out.println( "oddCount = " + oddCount );

        // For L O O P
        for (int i = 0; i < numberList.length; i++) {
            for (int a: numberList) {
                if (a % 2 == 0) {
                    evenCount++; // For Even numbers
                } else {
                    oddCount++; // For Odd numbers
                }
            }
            System.out.println("evenCount = " + evenCount);
            System.out.println(" oddCount = " + oddCount );
        }
    }
}
