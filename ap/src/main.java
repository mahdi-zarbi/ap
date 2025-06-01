import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Stack;


public class main {
    public static void main(String[] args){
       //------------------- 1 -------------------نحوه کار equals
        String s1="hello";
        String s2="hello";
        String s3="mahdi";
        System.out.println("1.EQUALS");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));


        //------------------- 2 ---------------نحوه کار با compareto
        System.out.println("---------2.Compareto---------");
        System.out.println(s1.compareTo(s2));


        //------------------- 3 ---------------نحوه کار با sort در ارایه
        System.out.println("---------3.sort---------");
        int [] a={1,44,6,22,4};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        //------------------- 3 ---------------نحوه کار با sort در ارایه
        System.out.println("---------4.iterator---------");
        List<String> list=new ArrayList<>();
        list.add(new String("mahdi"));
        list.add(new String("matin"));
        list.add(new String("ali"));

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //------------------- 4 ---------------نحوه کار با Stack و ایتریتور
        System.out.println("---------5.Stack---------");
        Stack<Integer> number=new Stack<>();
        for(int i=0;i<10;i++){
            number.push(i);
        }
        Iterator<Integer> it2=number.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
