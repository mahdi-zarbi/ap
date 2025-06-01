import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        //---------------Book--------------------
        System.out.println("----------1.Book-----------");
        List<Book> book=new ArrayList<>();
        book.add(new Book("mahdi","sigma",1998));
        book.add(new Book("matin","tabdil",2025));
        book.add(new Book("ehsan","fbi",1852));

        Collections.sort(book);
        for(Book a: book){
            System.out.println(a);
        }
        //----------------Employee-----------------
        System.out.println("------------2.Employee------------");
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("saman",128));
        employees.add(new Employee("mamad",190));
        employees.add(new Employee("masoud",123));

        Map<Integer,String> employee=new HashMap<>();
        for(Employee a:employees){
            employee.put(a.id,a.name);
        }

        for (Map.Entry<Integer, String> entry : employee.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        //----------------Product-----------------
        System.out.println("-----------3.Product------------");
        Map<String,Integer> product=new HashMap<>();
        product.put("laptop",1999);
        product.put("mobile",562);
        product.put("tablet",860);
        product.put("pc",2150);

        List<String> list=new ArrayList<>();
        for(Map.Entry<String,Integer> a: product.entrySet()){
            if(a.getValue()>100){
                list.add(new String(a.getKey()));
            }
        }

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //----------------game-----------------
        System.out.println("-----------4.game by card------------");


    }
}
