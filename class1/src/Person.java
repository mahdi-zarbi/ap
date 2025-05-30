public class Person {
    private String name;
    private int age;


    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
//sxxxxxxxxxxxxxxxxx
    static int a;

    static void staticShow(){
        System.out.println("HI, MY STATIC");
    }

    void displayInfo(){
        System.out.println("name: "+getName()+"  age: "+getAge());
    }

    public String toString(){
        return "name: "+name+"   age:"+age;
    }
}
