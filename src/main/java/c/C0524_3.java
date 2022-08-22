package c;

import java.util.Scanner;

public class C0524_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        if (!str.startsWith("(")){
            System.out.print("(");
        }
        for (int i = 0; i < str.indexOf("안"); i++) {
            System.out.print(str.charAt(i));
        }
        if (!str.endsWith(")")){
            System.out.print(")");
        }

    }
}
