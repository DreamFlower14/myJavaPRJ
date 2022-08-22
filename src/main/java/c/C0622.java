package c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C0622 {
    public static void main(String[] args) {
        man m = new man("painter");
        System.out.println(m.name);
        m.drawing("정훈","브롤스타즈");
    }
}

class painter{
    List<Map<String, String>> Alist = new ArrayList<>();
    Map<String, String> Hmap = new HashMap<>();
    String name = "협" ;


    painter(){};
    public void drawing(String name, String paint){
        Hmap.put(name,paint);
    }
}

class man extends painter {
    String name = "정훈";

    man(String jobs){
        if (jobs.equals("painter")){
            System.out.println("나는 화가입니다");
        }
    }

     man (){
         System.out.println(super.name
         );
         System.out.println(this.name);
    }

    @Override
    public void drawing(String name, String paint){
        System.out.println(name+" "+paint);
    }
//    painter
}