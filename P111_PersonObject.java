package code.PRACTICE_JAVA;

public class P111_PersonObject {
    public static void main(String[] args) {
        P110_MalePerson male1=new P110_MalePerson();

        System.out.println("P110_MalePerson.isHuman = " + P110_MalePerson.isHuman);
        System.out.println("P110_MalePerson.gender = " + P110_MalePerson.gender);

        male1.name="OB";
        male1.age=32;

//        c7_MalePerson.ID
        //male1.ID

        if (P110_MalePerson.isHuman & P110_MalePerson.gender == 'M' && male1.age<55 ){
            System.out.println("Person name " +male1.name);
            System.out.println("Age " + male1.age);
            System.out.println("Person is smaller 55");
        }

    }
}
