package aa;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = 1;

        System.out.println(a+"단");
        while (b < 10){
            System.out.println(a + " x " + b + " = " + (a*b));
            b++;
        }
    }
}
