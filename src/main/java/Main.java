import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        int a = s.nextInt();
        int[] aa = new int[a];

        for (int i = 0; i < a; i++) {
            aa[i] = s.nextInt();
        }

        for (int i = 0; i < a; i++) {
            int min = i;
            for (int j = i + 1; j < a; j++) {
                if (aa[i] > aa[j]){
                    min = j;
                    System.out.println("test: "+min);
                }
            }
            int temp = aa[i];
            aa[i] = aa[min];
            aa[min] = temp;
        }

        for (int i = 0; i < a; i++) {
            System.out.println(aa[i]);
        }
    }
}
