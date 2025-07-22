package JAVA_OOPs;

public class InnerClass {

    static class Test{
        String name;

        Test(String name){
            this.name = name;
        }
        @Override
        public String toString(){
            return name;
        }
    }
    public static void main(String[] args) {
//        InnerClass obj = new InnerClass();

        Test a = new Test("Rahul");
        Test b = new Test("Rohan");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);
    }
}
