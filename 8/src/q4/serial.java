package q4;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//خیلی ساده بگم، Serializable در جاوا یعنی اینکه یک شیء را می‌توان به داده‌های باینری تبدیل کرد و
// بعداً دوباره آن را به همان شیء تبدیل کرد. این کار برای ذخیره‌سازی یا ارسال داده‌ها مفید است
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
