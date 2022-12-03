package code.PRACTICE_JAVA;

public class P33_StringMethods {
    public static void main(String[] args) {


        // replace()	     Searches a string for a specified value, and returns
        //                   A new string where the specified values are replaced	           String
        // replaceFirst()	 Replaces the first occurrence of a substring that matches the
        //                   Given regular expression with the given replacement	           String
        //
        // startsWith()	     Checks whether a string starts with specified characters	       boolean
        // substring()	     Extracts the characters from a string,
        //                   Beginning at a specified start position,
        //                   and through the specified number of character	                   String
        // toLowerCase()     Converts a string to lower case letters	                       String
        // toUpperCase(      Converts a string to upper case letters	                       String
        // trim()	         Removes whitespace from both ends of a string	                   String

        // --------------------------------------------------------------------------------------------

        String word = "Hello world 123 hello world 123";
        // replace()	  Searches a string for a specified value, and returns
        //                a new string where the specified values are replaced	               String

        //                Remove all e from word and pass x as a replacement
        System.out.println(word.replace("e","x"));
        System.out.println(word);
        String updatedWord = word.replace("world","planet");
        System.out.println("updatedWord: " + updatedWord);

        // Replace only the first word or letter

        String str    = "Java is here, planet is Java, Java is planet.";
        String newStr = str.replaceFirst("Java","Python");
        System.out.println("New STR: " +newStr);
        System.out.println(str.replace("Java","Python"));

        // startsWith()	     Checks whether a string starts with specified characters	       boolean
        // endsWith()  	     Checks whether a string ends   with specified characters	       boolean
        System.out.println("*******************");
        String sentence = "Bella La vita bella";
        // Check if sentence starts and ends with Bella!
        boolean b1 = sentence.startsWith("Bella") || sentence.endsWith("Bella");
        boolean b2 = sentence.startsWith("Bella") || sentence.endsWith("bella");
        if (b1){
            System.out.println("Sentence starts and ends with bella ");
            if (b2){
                System.out.println("Starts and ends with Bella");
            }else{
                System.out.println("If b1 is true one part is Bella");
            }
        }else{
            System.out.println("Sentence doesn't starts or ends with Bella");
        }

        //substring()	          Extracts the characters from a string,
        //                      beginning at a specified start position,
        //                      and through the specified number of character	                    String

        //we have 2 methods
        //first substring(beginiing index , ending index) :
        //this will print starting given index until the ending index (excluded ending index)
        //second substring(beginiing index) : this will start printing from given index to end of the sentence

        String letters="Hello world Java is fun";
        // 012345678910   15
        //print world Java is fun
        System.out.println(letters.substring(6));
        //print world Java
        System.out.println(letters.substring(6,15));//world Jav  index 15 wont be included
        System.out.println(letters.substring(6,16));//world Java

        //print world
        System.out.println(letters.substring(6,10+1));

        //print Hello
        System.out.println(letters.substring(0,4+1));

        //print Java
        //index of J and index of after a
        int indexOfJ=letters.indexOf("J");
        System.out.println("indexOfJ = " + indexOfJ);

//        int indexOfa=letters.indexOf("a ");
        int indexOfa=letters.lastIndexOf("a");
        System.out.println("indexOfa = " + indexOfa);

        System.out.println(letters.substring(12,15+1));

    }
}
