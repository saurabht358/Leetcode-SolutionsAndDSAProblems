package JAVA_OOPs.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void  start(){
        System.out.println("Electric Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stopped");
    }
}
