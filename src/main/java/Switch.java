import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("1~4 중에 선택하세요 : ");
        a = s.nextInt();
        // 조건이 5개 이상이면 무조건 switch case 쓴다
         switch (a) {
            case 1 :
                System.out.printf("1을 선택했다\n");
                break;
            case 2 :
                System.out.printf("2을 선택했다\n");
                break;
            case 3 :
                System.out.printf("3을 선택했다\n");
                break;
            case 4:
                System.out.printf("4를 선택했다\n");
                break;
            default:
                System.out.printf("1부터 4까지 고르랬지.\n");
        }
        // ctrl + alt + L 누르면 알아서 들여쓰기 해준다.
        /*
        if (a == 1) {
            System.out.printf("1을 선택했다\n");
        } else if (a == 2) {
            System.out.printf("2을 선택했다\n");
        } else if (a == 3) {
            System.out.printf("3을 선택했다\n");
        } else if (a == 4) {
            System.out.printf("4을 선택했다\n");
        } else {
            System.out.printf("1~4중에 고르랬지");
        }*/
    }
}
