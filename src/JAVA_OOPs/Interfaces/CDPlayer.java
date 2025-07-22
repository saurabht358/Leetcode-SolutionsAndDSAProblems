package JAVA_OOPs.Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("CDPlayer Started");
    }
    @Override
    public void stop() {
        System.out.println("CDPlayer Stopped");
    }
}
