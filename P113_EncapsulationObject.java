package code.PRACTICE_JAVA;

public class P113_EncapsulationObject {

    public static void main(String[] args) {
        P112_Encapsulation obj1=new P112_Encapsulation();
        // obj1.name="Hello world";
        //name is not accessible because it is private
        obj1.setName("Hello");
//        System.out.println(obj1.name);
        System.out.println(obj1.getName());
        obj1.setIdNum(1981);
        System.out.println(obj1.getIdNum());

        obj1.setAge(35);
        System.out.println(obj1.getAge());

    }
}
