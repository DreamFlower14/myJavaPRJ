package aa;

import java.util.Scanner;

public class Sright {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.printf("%d", i);
            for (int j = a; j > i; j--) {
                System.out.printf("%d", j);
                System.out.printf(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}