package q2;
import java.util.Comparator;
//اگر بخواهیم یک شیی را بر اساس چند چیز مرتب کنیم از comparator استفاده میکنیم
// برای اینکه از comparator استفاده کنیم باید یک کلاس جداگانه استفاده کنیم
public class comptor  {
    String name;
    int grade;

    public comptor(String name,int grade){
        this.name=name;
        this.grade=grade;
    }

    @Override
    public String toString(){
        return "name: "+name+"   grade: "+grade;
    }
    static class sort implements Comparator<comptor>{
        @Override
        public int compare (comptor s1, comptor s2){
        int sortName = s1.name.compareTo(s2.name);
        if (sortName == 0) {
            return Integer.compare(s1.grade, s2.grade);
        }
        return sortName;
    }
    }

}
