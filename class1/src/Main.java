public class Main {
    public static void main(String [] args){
        Person person1=new Person("mahdi",15);
        Person person2=new Person("ehsan",18);
        Person person3=new Person("matin",17);
        Person person4=new Person("erfan",16);
        Student s1=new Student("ali",99);

        System.out.println(person3);
        Person.staticShow();
        s1.displayInfo();
        person2.displayInfo();
    }
}
