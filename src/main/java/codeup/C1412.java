package codeup;

import java.util.Scanner;

public class C1412 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int len = st.length();
        char[] ch = new char[len];
        int[] cnt = new int [26]; // 알파벳 카운트 받을 배열

        for (int i = 0; i < len; i++) {
            ch[i] = st.charAt(i);   // 문자열으로 입력받은 것을 문자로 바꿔서 넣어준다
        }

        for (int i = 0; i < len; i++) {
            for (int j = 97; j < 123; j++) {
                if ( ch[i] == j){  // ch배열과 알파벳이 같으면
                    cnt[j-97]++; //  카운트 배열이 올라간다. -97은 cnt의 0번 인덱스가 a와 같게 하기 위해서
                }
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            System.out.printf("%c:%d \n",i+97,cnt[i]);   // printf로 서식을 char형으로 하고 숫자로 입력해줘서 아스키코드로 변환해서 출력해준다.
        }


    }
}
