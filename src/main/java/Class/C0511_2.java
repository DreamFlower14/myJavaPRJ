package Class;

import java.util.HashMap;
import java.util.Map;

public class C0511_2 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();   // Map(키, 값(종류))

        // 값 저장하기
        map.put("name", "이협건");  // (키 값)
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("dept", "데이터분석과");

        // 값 불러오기
        System.out.println("--------------------------");

        System.out.println("name : " + map.get("name"));
        System.out.println("email: " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));

        System.out.println("---------------------------");
    }
}
