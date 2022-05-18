package Class;

import java.util.*;

public class C0518 {
    public static void main(String[] args) {
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();

        map.put("이름","김성현");
        map.put("dept","데이터분석");

        list.add(map);

        map = null;

        map = new HashMap<>();

        map.put("이름","홍길동");
        map.put("dept","정보보안");

        list.add(map);

        System.out.println("-----------------------------------------------");

        Iterator<Map<String,String>> it = list.iterator();

        while(it.hasNext()){
            Map<String,String> rmap = it.next();
            System.out.println("이름 : " + rmap.get("이름"));
            System.out.println("과 : " + rmap.get("dept")+"\n");
        }
        System.out.println("-----------------------------------------------");

        for (Map<String,String> rmap : list){
            System.out.println("이름 : " + rmap.get("이름"));
            System.out.println("과 : " + rmap.get("dept")+"\n");
        }
        System.out.println("-----------------------------------------------");

        list.forEach( rmap -> {
            System.out.println("이름 : " + rmap.get("이름"));
            System.out.println("과 : " + rmap.get("dept")+"\n");
        });

    }
}
