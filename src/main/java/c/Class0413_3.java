package c;

import java.util.Scanner;

public class Class0413_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;

        while(true){
            System.out.printf("더할 첫번재 수 :");
            a = s.nextInt();
            System.out.printf("더할 첫번재 수 :");
            b = s.nextInt();

            System.out.printf("%d + %d = %d \n", a, b, a+b);
        }
    }
}
