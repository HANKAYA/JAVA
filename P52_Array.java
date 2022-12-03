package code.PRACTICE_JAVA;

public class P52_Array {
    public static void main(String[] args) {

        // Create a condition that will check list of array it will print even numbers from the list
        int [] numberList={1,2,45,67,8,10,500,2,40};
        // Loop Start Point= 0 --- End Point= length -1
        for (int i = 0; i < numberList.length; i++){
            if (numberList[i]%2 ==0){
                System.out.println(numberList[i] + " is even number ");
            }
        }
        // Create a condition that will print min and max number
        int [] numberList2= {200,1,2,45,67,8,10,500,2,40};
        // max: 500 -- min: 1
        int max= numberList2[0];
        int min= numberList2[0];
        for (int i= 0; i <= numberList2.length -1 ; i++){
            if (numberList2[i] > max) { //numberList2[0] ==500  > 200
                max = numberList2[i]; //max == 500  , 695
            }

            if (numberList2[i] < min){
                min = numberList2[i];//min == 45 , 8  , 2 ,1
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        }
    }

