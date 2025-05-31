package q2;
//sort student by grade
// اگه خواستیم بر اساس فقط یه مورد مقایسه کنیم از comparable استفاده میکنیم و متد comparetoرو پیاده سازی و اورراید میکنیم
//برای استفاده هم بدون نیاز به تعریف یه کلاس میتونبم اونو پیاده سازی کنیم
public class compto implements Comparable<compto> {
    String name;
    int grade;

    public compto(String name, int grade){
        this.name=name;
        this.grade=grade;
    }
    @Override
    public int compareTo(compto other){
        return Integer.compare(this.grade,other.grade);
    }
    @Override
    public String toString(){
        return "name: "+name+"  grade: "+grade;
    }
}
