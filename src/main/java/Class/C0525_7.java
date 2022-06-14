package Class;

import java.util.Scanner;

public class C0525_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int coffee;
        int ret;

        System.out.println("어떤 커피를 드릴까요? (1: 아메리카노 2: 라떼 3: 밀크티)");
        coffee = s.nextInt();

        C0525_8 cm = new C0525_8();
//        cm.coffee_machine(coffee);

        System.out.println("손님 여기 있습니다");
    }
}
