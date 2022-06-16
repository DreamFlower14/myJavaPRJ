package CodeUp;

import java.util.Scanner;

public class C1416 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.printf("%s",Integer.toBinaryString(a)); // Integer.toBinaryString -> 정수 객체를 2진수 문자열로 만든다. 그리고 printf에서 %s로 2진수로 출력
    }
}
