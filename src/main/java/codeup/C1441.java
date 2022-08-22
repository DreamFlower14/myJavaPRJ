package codeup;

import java.util.Scanner;

public class C1441 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[] aa = new int[a];

        for (int i = 0; i < a; i++) {
            aa[i] = s.nextInt();
        }

        for (int i = 0; i < a-1; i++) {
            for (int j = 0; j < a-1-i; j++) {
                if (aa[j] > aa[j+1]) {
                    int temp = aa[j];
                    aa[j] = aa[j+1];
                    aa[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < a; i++) {
            System.out.println(aa[i]);
        }
    }
}
