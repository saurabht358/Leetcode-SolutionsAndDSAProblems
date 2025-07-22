package JAVA_OOPs.Interfaces;

public class Car implements Engine,Media{
    @Override
    public void start() {
        System.out.println("Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Engine Stopped");
    }
}
