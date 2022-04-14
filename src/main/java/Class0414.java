import java.io.IOException;
import java.util.Scanner;

public class Class0414 {
    public static void main(String[] args) throws IOException {

    Scanner s = new Scanner(System.in);
    long a,b;
    char ch;

    while(true){
        System.out.print("계산할 첫번째 수를 입력 : ");
        a = s.nextInt();
        System.out.print("계산할 두번째 수를 입력 : ");
        b = s.nextInt();
        System.out.print("계산할 연산자를 입력 : ");
        ch = s.next().charAt(0);

        switch(ch){
            case '+' :
                System.out.printf("%d + %d = %d 입니다.\n", a, b, a+b);
                break;
            case '-':
            System.out.printf("%d - %d = %d 입니다.\n", a, b, a-b);
                break;
            case '*':
            System.out.printf("%d * %d = %d 입니다.\n", a, b, a*b);
                break;
            case '/':
            System.out.printf("%d / %d = %d 입니다.\n", a, b, a/b);
                break;
            case '%':
            System.out.printf("%d % %d = %d 입니다.\n", a, b, a%b);
                break;
            default:
            System.out.printf("연산자를 잘못 입력했습니다.\n");
        }
    }
}}
