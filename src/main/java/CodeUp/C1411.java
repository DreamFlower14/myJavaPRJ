package CodeUp;

import java.util.Scanner;

public class C1411 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int h = 0,m;

        for (int i = 1; i <= n; i++) {
            h += i;
        }
        for (int i = 0; i < n-1; i++) {
            m = s.nextInt();
            h -= m;
        }
        System.out.println(h);
    }
}
