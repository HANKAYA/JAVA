package code.PRACTICE_JAVA;

public class P81_ParseMethod {
    public static void main(String[] args) {

        // PARSE METHODS : converts string of text to the primitives, returns primitive values
        // ==> valueOf methods: converting string to wrapper class value, returns wrapper class values

        String str = "5345";
        System.out.println(str + 25);       // ==> Text + number = text 534525 text
        int number = Integer.parseInt(str); // Actual number --> 5345
        System.out.println(number + 25);    // 5345 + 25 ==> 5370

        String str2= "5.55";
        float   f1 = Float.parseFloat  (str2);
        double  d1 = Double.parseDouble(str2);
        System.out.println(f1 + 2.5);
        System.out.println(d1 + 2.5);
        String str3= "true";
        String str4= "false";
        String str5= "TruE";
        String str6= "FalSE";
        String str7= "HeLLo world";
        boolean b1 = Boolean.parseBoolean(str3);
        boolean b2 = Boolean.parseBoolean(str4);
        boolean b3 = Boolean.parseBoolean(str5);
        boolean b4 = Boolean.parseBoolean(str6);
        boolean b5 = Boolean.parseBoolean(str7);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
