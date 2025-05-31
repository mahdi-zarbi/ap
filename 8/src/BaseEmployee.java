public class BaseEmployee implements Employye{
    String name;
    int id;
    int age;

    public BaseEmployee(String name,int id,int age){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void showDitails(){
        System.out.println("name: "+name+"  age: "+age+"  Id: "+id);
    }
}
