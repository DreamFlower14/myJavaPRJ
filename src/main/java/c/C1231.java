package c;

import java.util.Scanner;

public class C1231 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int inc = a, dec = a;

        for ( int i = 1; i <= a; i++){
            for ( int j = 1; j <= inc; j++){
                if (j < dec ){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            dec--;
            inc++;
            System.out.println();
        }
    }

}