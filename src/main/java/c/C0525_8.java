package c;

import java.util.Scanner;

public class C0525_8 {
    private int coffee_machine(int button){  // private 을 하면 내 파일 안에서만 가능하다.
        System.out.println("# 1.(주전자로) 뜨거운 물을 준비한다");
        System.out.println("# 2.(서랍에서) 종이컵을 준비한다");

        switch (button){
            case 1:
                System.out.println("# 3.(겨우겨우) 아메리카노를 탄다");
                break;
            case 2:
                System.out.println("# 3.(우유넣어) 라떼를 탄다");
                break;
            case 3:
                System.out.println("# 3.(우유+차) 밀크티를 탄다");
                break;
            default:
                System.out.println("# 3.(정성으로) 흙탕물을 탄다");
                break;
        }
        System.out.println("# 4.(내손으로) 물을 붓는다");
        System.out.println("# 5.(힘들게도) 스푼으로 저어서 녹인다 \n");
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int coffee;
        int ret;

        System.out.println("어떤 커피를 드릴까요? (1: 아메리카노 2: 라떼 3: 밀크티)");
        coffee = s.nextInt();

        C0525_8 cm = new C0525_8();
        cm.coffee_machine(coffee);

        System.out.println("손님 여기 있습니다");
    }
}
