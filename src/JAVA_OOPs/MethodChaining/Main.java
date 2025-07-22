package JAVA_OOPs.MethodChaining;

public class Main {
    public static void main(String[] args) {
        Student s1 = Student.of()
                .setId(34)
                .setName("saurabh")
                .setCity("Nagpur");

        System.out.println(s1);

    }
}
