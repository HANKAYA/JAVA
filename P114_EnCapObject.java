package code.PRACTICE_JAVA;

public class P114_EnCapObject {
    public static void main(String[] args) {

        P112_Encapsulation obj1 = new P112_Encapsulation();
        // [ obj1.name="Hello world"; ] --> name is not accessible because it is private
        obj1.setName("HAN");
        System.out.println(obj1.getName());
        obj1.setIdNum(886120);
        System.out.println(obj1.getIdNum());
        obj1.setAge(34);
        System.out.println(obj1.getAge());

    }
}
