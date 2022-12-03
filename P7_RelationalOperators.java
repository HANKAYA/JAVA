package code.PRACTICE_JAVA;

public class P7_RelationalOperators {
    public static void main (String [] args){

        byte b1=10;
        byte b2=25;

        boolean example= b1 == b2;
        // == Equal Operator
        System.out.println(example == false); // False == False = TRUE
        // != Not Equal Operator
        System.out.println(b1 != b2);
        // > Bigger
        System.out.println(b2  > b1);
        // < Smaller
        System.out.println(b1  < b2);
        // >= ( >  =  together brings that symbol) Bigger or Equal
        System.out.println(b2 >= b1);
        // <= ( < = together brings this symbol ) Smaller or Equal
        System.out.println(b1 <= b2);

    }
}
