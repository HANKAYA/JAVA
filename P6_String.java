package code.PRACTICE_JAVA;

public class P6_String {
    public static void main(String [] args){
        // String is non PRIMITIVE data Type
        // dataType variableName = data;
        String nameOfStudent = "Ozgur";
        String schoolName = "RenasTech";
        // ID for OZGUR
        // Since ID is a number It is better to use whole numbers.
        int    id =  123000;
        //String id2= "123000";  HAS NO FUNCTION only a TEXT message
        System.out.println(nameOfStudent);
        System.out.println("Name of Student : " + nameOfStudent + " Student ID : " + id );
        // If you want to print on next line
        System.out.println("Name is: " + nameOfStudent + "\nSchool Name: "+schoolName );

        String n1="100";
        byte   b1= 100 ;
        System.out.println( n1 + 10 ); // Text + Number will be 10010
        System.out.println( b1 + 10 ); // Number + Number = 110

        //  create 3 name and assign any name  ex: Firat Hatice Abe
        //  create 3 age assign any number you want to   ex : 20 30 40
        //  print those age with person name   ex : Abe age is : 20
        //  also sum those three person age  ex : 20 + 30 + 40
        //  print  "Sum of persons Age = 90 ;

            //  create 3 name and assign any name  ex: Firat Hatice Abe
            String name1="Firat";
            String name2="Hatice";
            String name3="Abe";

            //  create 3 age assign any number you want to   ex : 20 30 40
            byte age1=27;
            byte age2=25;
            byte age3=31;

            //  print those age with person name   ex : Abe age is 20
            System.out.println("Abe age is 31");
            System.out.println(name3 + " age is : " + age3 );
            System.out.println(name2 + " age is : " + age2 );
            System.out.println(name1 + " age is : " + age1 );

            //  also sum those three person age  ex : 20 + 30 + 40
            //  print  "Sum of persons Age = 90 ;
            System.out.println("Sum of persons Age =  " + (age1+age2+age3) );

            int sumOfAge=age1+age2+age3;
            System.out.println("Sum of persons Age =  " + sumOfAge );

    }
}
