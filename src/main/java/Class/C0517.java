package Class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C0517 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("김다운");
        list.add("김성현");
        list.add("주혜경");
        list.add("양주홍");
        list.add("박우정");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String name = it.next();
            System.out.println("이름 : " + name);
        }
        for(String sh : list){
            System.out.println("이름 : " + sh);
        }

        list.forEach( sh -> System.out.println("이름 : " + sh));
    }
}