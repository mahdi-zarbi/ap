package q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
//اینترفیس iterator به ما کمک میکنه که روی لیست ها,عناصر حرکت کنه
//میتونیم با اون روی مجموعه ها حلقه بزنیم
public class iterate {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add(new String("ali"));
        list.add(new String("hasan"));
        list.add(new String("mahdi"));

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
