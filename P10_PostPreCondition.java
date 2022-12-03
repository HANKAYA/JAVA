package code.PRACTICE_JAVA;

public class P10_PostPreCondition {
    public static void main(String [] args){

        int x = 10;
        System.out.println(x);
        // PRE CONDITION
        System.out.println(++x); // Pre condition will increase your number by +1 (10+1=11)
        System.out.println(x);   // IN HERE your number is not "10" anymore.
        System.out.println(+x);
        // POST CONDITION ( IT WON'T AFFECT YOUR NUMBER RIGHT AWAY )

        int y =20;
        // POST CONDITION ( IT WON'T AFFECT YOUR NUMBER RIGHT AWAY ) - it will affect in next step
        System.out.println(y++);
        System.out.println(y);

        byte n1 = 30;
        System.out.println(x);   // 30
        System.out.println(--x); // 29 pre-condition

        int n2 = 50;
        System.out.println(n2--); // Post [50] But it will be 49 in next line
        System.out.println(n2--); // Post [49] But it will be 48 in next line
        System.out.println(--n2); // PRE  [48] and since It's pre-condition it is 47 now
        System.out.println(  n2); // 47
        System.out.println(n2++); // 47
        System.out.println(n2++); // 47


    }
}
