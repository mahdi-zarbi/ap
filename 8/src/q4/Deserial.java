package q4;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String [] args) throws IOException, ClassNotFoundException {
        FileInputStream file=new FileInputStream("user.ser");
        ObjectInputStream in=new ObjectInputStream(file);

        User user=(User)in.readObject();
        in.close();
        file.close();
        System.out.println(user);
    }
}
