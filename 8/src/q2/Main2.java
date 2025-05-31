package q2;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args){
        List<comptor> student = new ArrayList<>();
        student.add(new comptor("ali",16));
        student.add(new comptor("hasan",12));
        student.add(new comptor("ali",18));

        student.sort(new comptor.sort());
       // Collections.sort(student,new comptor.sort());

        for(comptor s:student){
            System.out.println(s);
        }
    }
}
