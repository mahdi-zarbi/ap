package q4;
import java.io.Serializable;

public class User implements Serializable {
    String name;
    int id;

    public User(String name, int id){
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString(){
        return "name: "+name+ "  id: "+id;
    }
}
