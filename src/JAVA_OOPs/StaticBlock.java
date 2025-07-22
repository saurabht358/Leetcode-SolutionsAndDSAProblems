package JAVA_OOPs;

public class StaticBlock {
    static int a=4;
    static int b;

    // it will only run once when the first object instatiated or if not created;
    static {
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b+=4;

        StaticBlock obj2 = new StaticBlock();
//        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        System.out.println(obj2.a + " " + obj2.b);

    }
}
