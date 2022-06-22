package Class;

import java.util.*;

public class C0511_3 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        list.add(map);

        map = null;

        map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("email", "g.d.hong@kopo.ac.kr");
        map.put("addr", "경기");
        map.put("dept", "시각디자인과");

        list.add(map);



//        int listsize = list.size();

/*        for (int i = 0; i < listsize; i++) {

            rMAP = list.get(i);
            System.out.println("name : " + rMAP.get("name"));
            System.out.println("email : " + rMAP.get("email"));
            System.out.println("addr : " + rMAP.get("addr"));
            System.out.println("dept : " + rMAP.get("dept"));
            System.out.println();
        }
*/
        list.forEach(rmap -> {
            System.out.println("name : " + rmap.get("name"));
            System.out.println("email : " + rmap.get("email"));
            System.out.println("addr : " + rmap.get("addr"));
            System.out.println("dept : " + rmap.get("dept"));
            System.out.println();
            }
        );
        for(Map<String,String> rmap : list){
            System.out.println(rmap.get("name"));
        }
        list.forEach(rmap -> {
            System.out.println(rmap.get("name"));
            System.out.println(rmap.get("email"));
        });
    }
}
