package JAVA_OOPs.Inheritance;

public class Box {
    double l;
    double w;
    double h;
    Box(){
        l=-1;
        w=-1;
        h=-1;
    }

    //creating a cube
    Box(double x){
        l = x;
        w = x;
        h = x;
    }
    //creating rectangular box
    public Box(double l,double w,double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
     void display(){
        System.out.println("Length: "+l + " Width: "+ w +" Height: "+ h );
    }
}
