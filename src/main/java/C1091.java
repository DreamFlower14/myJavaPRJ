import java.util.Scanner;

public class C1091 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextInt();
        int m = s.nextInt();
        int d = s.nextInt();
        int n = s.nextInt();

        for(int i = 1;i < n; i++){
            a = a * (m) + d;
        }
        System.out.println(a);
    }
}
