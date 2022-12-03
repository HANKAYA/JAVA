package code.PRACTICE_JAVA;

import java.util.NoSuchElementException;

public class P123_ThrowKeyword {

    // Throw vs throws
    // Throw will throw exception to your code
    // Throws will handle exceptions
    public static void main(String[] args) {
        NoSuchElementException obj= new NoSuchElementException();
        // throw obj;
        try{
            throw new ArithmeticException();
        }catch (Exception e){

        }
    }
}
