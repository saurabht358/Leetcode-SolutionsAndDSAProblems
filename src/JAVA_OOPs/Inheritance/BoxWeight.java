package JAVA_OOPs.Inheritance;

public  class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(double l,double w, double h,double weight){
        super(l,w,h);
        this.weight = weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Weight: "+this.weight);
    }
}
