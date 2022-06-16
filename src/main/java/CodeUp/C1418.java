package CodeUp;

import java.util.Scanner;

public class C1418 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] str1 = str.split("");

        for (int i = 0; i < str.length(); i++) {
            if (str1[i].equals("t")) {    // 문자열 비교는 equals 로 한다.
                System.out.printf("%d ",i+1);
            }
        }

    }
}
