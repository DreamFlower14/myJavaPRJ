package Class;

import java.util.Scanner;

public class C0518_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str,strRep,strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = s.nextLine();

        strRep= str.replace(" ", "$");  // 바꾸기
        strSub= str.substring(1,5);  // 사이 출력
        strAry= str.split("");  // 구분

        System.out.println("입력한 문자열 : " + str);
        System.out.println("바꾼 문자열 : " + strRep);
        System.out.println("일부 문자열 : " + strSub);

        for (int i = 0; i < strAry.length; i++) {
            System.out.println("분리한 문자열 : " + i + " == "+ strAry[i]);
        }
    }
}
