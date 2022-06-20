package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C0620 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        collection co = new collection();
        int a = 0;

        while (true){
            System.out.println("리스트에 넣을 수를 입력해주세요");
            System.out.println("Step->0");
            int n = s.nextInt();

            if (n == 0){
                break;
            }

            co.coll(n);
            a++;
            System.out.println(a+"번째 입력입니다");
        }
        System.out.println("몇 번째 값을 보시겠습니까? ");
        int n1 = s.nextInt();
        co.out(n1);
    }
}

class collection{
    List<Integer> col = new ArrayList<>();

    public void coll(int a){
        col.add(a);
    }

    public void out(int a){
        System.out.println(a + "번째 값은 " + col.get(a) + "입니다");
    }
}
