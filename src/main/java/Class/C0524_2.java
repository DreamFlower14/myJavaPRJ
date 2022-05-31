package Class;

import java.util.Scanner;

public class C0524_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                System.out.print("-");
            }else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
