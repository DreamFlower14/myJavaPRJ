import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(sum(1,2));
        sum(1,2);
    }

    /** 숫자 2개 입력하면 문자열로 합쳐서 반환하는 함수 */
    public static String sum(int a, int b){
        return "a + b";
    }
}