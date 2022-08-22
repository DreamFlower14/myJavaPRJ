package aa;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // 01. 내가 입력한 숫자가 홀인지 짝인지 출력해주는 프로그램
        // 10 -? 짝, 11 -> 홀
        // 02. 내가 입력한 숫자가 3의 배수인지 혹은 5의 배수인지 3과 5의 배수인지

        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int a = s.nextInt();

        if ((a % 3 == 0) && (a % 5 == 0) ){    // 3번의 연산수행
            System.out.println("3 과 5의 배수입니다");
        }else if (a % 3 == 0){
            System.out.println("3의 배수입니다");
        }else if (a % 5 == 0){
            System.out.println("5의 배수입니다");
        }
}}
