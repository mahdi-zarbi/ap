import java.util.ArrayList;
import java.util.List;

class Manager extends BaseEmployee {
    private double salary;
    private String position;
    private List<Employye> subordinates = new ArrayList<>();

    public Manager(String name, int age, int id, double salary, String position) {
        super(name, age, id);
        this.salary = salary;
        this.position = position;
    }

    public void addSubordinate(Employye employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employye employee) {
        subordinates.remove(employee);
    }

    public void showDetails() {
        super.showDitails();
        System.out.println("مقام: " + position);
        System.out.println("زیرمجموعه‌ها:");
        for (Employye employee : subordinates) {
            employee.showDitails();
        }
    }

}