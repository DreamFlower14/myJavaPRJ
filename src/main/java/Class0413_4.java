import java.util.Scanner;

public class Class0413_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;

        while (true){
            System.out.printf("더할 첫 번째 수 : ");
            a = s.nextInt();
            System.out.printf("더할 두 번째 수 : ");
            b = s.nextInt();

            if ((a == 0) || (b == 0))
                break;

            System.out.printf("%d + %d = %d \n", a, b, a+b);
        }
        System.out.printf("0을 입력해서 반복문을 탈출했습니다.\n");
    }
}
