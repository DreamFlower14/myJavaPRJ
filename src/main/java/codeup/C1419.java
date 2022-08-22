package codeup;

import java.util.Scanner;

public class C1419 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.contains("love")){
                str = str.replaceFirst("love","1");
                cnt++;
            }
            System.out.println(i+":"+str);
        }
        System.out.println(cnt);
    }
}
