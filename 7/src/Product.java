public abstract class Product implements IDiscountable {

    private String name;
    private double price;

    private static int counter=0;

    public Product(String name,double price){
        this.price=price;
        this.name=name;
        counter++;
    }
    public Product(String name){
        this.name=name;
        this.price=0.0;
        counter++;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public static void countNumber(){
        System.out.println("count: "+counter);
    }
    
    
    public void applyDiscount(double t){
        this.price=price-(price*t)/100;
        System.out.println("apllay discount :"+this.price);
    }

    public void displayInfo(){
        System.out.println("name: "+name+"  price: "+price);
    }

    @Override
    public void apllyDiscount(double t) {
        this.price=price-(price*t)/100;
        System.out.println("interface: "+this.price);
    }
}
