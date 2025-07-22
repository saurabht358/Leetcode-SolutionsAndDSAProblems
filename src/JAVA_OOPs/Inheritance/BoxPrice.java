package JAVA_OOPs.Inheritance;

public  class BoxPrice extends BoxWeight{
    double price;

    BoxPrice(){
        super();
        this.price = -1;
    }

    BoxPrice(double side,double weight,double price){
        super(side,weight);
        this.price = price;
    }
    BoxPrice(double length,double width,double height,double weight,double price){
        super(length,width,height,weight);
        this.price = price;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Price: "+this.price);
    }

}
