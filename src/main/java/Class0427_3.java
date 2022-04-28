import java.util.Scanner;

public class Class0427_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int[] aa = new int[4];

        for (int i = 0; i < 4; i++){
            System.out.print(i+1 + "번째 숫자를 입력하세여 : ");
            aa[i] = s.nextInt();
        }
        hap = aa[0] + aa[1] + aa[2] + aa[3];
        System.out.println("합은 "+ hap);
    }
}
