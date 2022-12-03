package code.PRACTICE_JAVA;

import java.util.NoSuchElementException;

public class P121_MultiCatch {
    public static void main(String[] args) {

        try{
            System.out.println(10/0); // --> Unchecked the Exception - Arithmetic Exception
        }catch (NoSuchElementException e){
            System.out.println("No such element");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }catch (Exception e){
            System.out.println("Exception");
        }
        // To be able to catch exception you need use same level exception or parents of exceptions
        // Example : handling arithmetic exceptions will be handled with arithmetic,runtime,exceptions

        // In multi catch as soon as block catch it won't check other catch blocks
    }
}
