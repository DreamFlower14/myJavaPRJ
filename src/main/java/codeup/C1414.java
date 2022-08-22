package codeup;

import java.util.Scanner;

public class C1414 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int cntc = 0, cntcc = 0;

        for (int i = 0; i < str.length(); i++) {
            if (( str.charAt(i) == 'c') || (str.charAt(i) == 'C')){
                cntc++;
            }
        }

        for (int i = 0; i < str.length()-1; i++) {
            if (
                    (( str.charAt(i)=='c')&&( str.charAt(i+1)=='c'))
                            ||
                    (( str.charAt(i)=='C')&&( str.charAt(i+1)=='c'))
                            ||
                    (( str.charAt(i)=='c')&&( str.charAt(i+1)=='C'))
                            ||
                    (( str.charAt(i)=='C')&&( str.charAt(i+1)=='C'))
            )
            {
                cntcc++;
            }
        }
        System.out.println(cntc);
        System.out.println(cntcc);
    }
}
