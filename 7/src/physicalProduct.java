public class physicalProduct extends Product{

    double weight;

    public physicalProduct(String name,double price,double weight){
        super(name,price);
        this.weight=weight;
    }

    @Override
    public void displayInfo(){
        System.out.println("name: "+getName()+"  price: "+getPrice()+"   weight: "+weight);
    }
}
