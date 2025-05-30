public class Main {
    public static void main(String[] args){

        Product p1=new Product("mobile",100);
        Product p2=new Product("laptop",155);
        Product p3=new Product("tv",220);
        Product p4=new Product("car",342);
        Product p5=new DigitalProduct("hard",199,500);
        Product p6=new physicalProduct("table",50,15.6);

        p4.applyDiscount(30);
        Product.countNumber();
        p5.displayInfo();
        p3.apllyDiscount(30);
        p6.displayInfo();
    }
}
