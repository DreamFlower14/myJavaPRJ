package c;

import java.util.Scanner;

public class Class0506 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a [] = new int[10];

        for(int i = 0; i < 10; i++){
            a[i] = s.nextInt();
        }
        int b = s.nextInt();
        System.out.printf("%d",a[b-1]);
    }
}
