package JAVA_OOPs.Interfaces;

import javax.swing.text.Element;

public class NiceCar {
    private Engine engine;
    private Media player;
    public void start() {
        engine.start();
    }

    public NiceCar(){
        engine = new PowerEngine();
        player = new CDPlayer();
    }
    public  NiceCar(Engine engine){
        this.engine = engine;
    }

    public void stop() {
        engine.stop();
    }
    public void StartMusic(){
        player.start();
    }
    public void StopMusic(){
        player.stop();
    }
    public void ChangeEngine(){
        engine = new ElectricEngine();
    }
}
