import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        //---------------Book--------------------
        System.out.println("1.Book");
        List<Book> book=new ArrayList<>();
        book.add(new Book("mahdi","sigma",1998));
        book.add(new Book("matin","tabdil",2025));
        book.add(new Book("ehsan","fbi",1852));

        Collections.sort(book);
        for(Book a: book){
            System.out.println(a);
        }
        //----------------Employee-----------------
        System.out.println("2.Employee");
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("saman",123));
        employees.add(new Employee("mamad",190));
        employees.add(new Employee("masoud",123));
        Map<Integer,String> employee=new HashMap<>();


    }
}
