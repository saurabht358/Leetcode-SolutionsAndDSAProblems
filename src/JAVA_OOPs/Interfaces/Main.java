package JAVA_OOPs.Interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
        Media car2 = new Car();

//        car.start();
//        car2.start();

        NiceCar c = new NiceCar();
        c.start();
        c.StartMusic();
        c.ChangeEngine();
        c.start();
    }
}
