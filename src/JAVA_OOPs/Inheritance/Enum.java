package JAVA_OOPs.Inheritance;

public class Enum {
    enum Week{
        // public static final enum Week
        // Enums can implements interfaces as it want but however it can not extends class
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Saturday;

        System.out.println(week);
//        for(Week day:Week.values()) System.out.println(day);


    }
}
