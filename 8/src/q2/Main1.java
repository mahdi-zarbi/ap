package q2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args){

        List<compto> student=new ArrayList<>();
        student.add(new compto("mahdi",15));
        student.add(new compto("hasan",26));
        student.add(new compto("ali",5));
        Collections.sort(student);
        for(compto stu:student){
            System.out.println(stu);
        }

    }
}
