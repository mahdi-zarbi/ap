public class DigitalProduct extends Product{

    double fileSize;

    public DigitalProduct(String name,double price,double fileSize){
        super(name,price);
        this.fileSize=fileSize;
    }

    @Override
    public void displayInfo(){
        System.out.println("name: "+getName()+"  price: "+getPrice()+"   file size: "+fileSize);
    }
}
