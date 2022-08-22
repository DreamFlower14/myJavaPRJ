package codeup;

import java.util.Scanner;

public class C1403 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] aa = new int[n];

        for (int i = 0; i < n; i++) {
            aa[i] = s.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(aa[j]);
            }
        }
    }
}
