package JAVA_OOPs.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stop");
    }
}
