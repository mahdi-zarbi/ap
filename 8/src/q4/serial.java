package q4;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serial {
    public static void main(String[] args) throws IOException {
        User user=new User("mahdi",123);

        FileOutputStream file=new FileOutputStream("user.ser");
        ObjectOutputStream out=new ObjectOutputStream(file);

        out.writeObject(user);
        out.close();
        file.close();

        System.out.println("serialization ");

    }
}
