import java.util.Scanner;

public class True {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("몇 단? : ");
        int a = s.nextInt();
        System.out.println( a +"단");

        for(int b = 1; b < 10; b++){
                System.out.println(a + "x" + b + "=" + a*b);
            }
        }
    }

