import java.util.Scanner;

public class Sreverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = a; j > i; j--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}