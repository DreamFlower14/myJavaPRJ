package aa;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0; // 더하는 값을 입력받을 변수
        int num1, num2, num3;  // ~까지를 정해주는 입력받는 변수

        System.out.print("시작값 입력 : ");
        num1 = s.nextInt();

        System.out.print("끝값 입력 : ");  // num2 까지
        num2 = s.nextInt();

        System.out.print("증가값 입력 : ");   // num3만큼 증가
        num3 = s.nextInt();

        if (num1 < num2) {
            for (int i = num1; i <= num2; i += num3) {
                hap += i;
            }
            System.out.printf("%d부터 %d까지 %d씩 증가한 값의 합 : %d\n", num1, num2, num3, hap);
        } else {
            System.out.println("끝값이 시작값보다 작습니다...");
        }
    }
}
