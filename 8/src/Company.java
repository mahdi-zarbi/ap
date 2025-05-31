public class Company {
    public static void main(String[] args) {
        SimpleEmployye emp1 = new SimpleEmployye("علی", 30, 101, 5000);
        SimpleEmployye emp2 = new SimpleEmployye("حسین", 28, 102, 6000);

        Manager manager = new Manager("محمد", 40, 201, 10000, "مدیر بخش فناوری");
        manager.addSubordinate(emp1);
        manager.addSubordinate(emp2);

        manager.showDetails();
        //System.out.println("حقوق مدیر: " + manager.());
    }
}
