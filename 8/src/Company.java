public class Company {
    public static void main(String[] args) {
        SimpleEmployye emp1 = new SimpleEmployye("mahdi", 30, 101, 5000);
        SimpleEmployye emp2 = new SimpleEmployye("ali", 28, 102, 6000);

        Manager manager = new Manager("matin", 40, 201, 10000, "Packaging Manager");
        manager.addSubordinate(emp1);
        manager.addSubordinate(emp2);

        manager.showDetails();
    }
}
