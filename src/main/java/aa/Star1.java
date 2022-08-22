package aa;//import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
        int inc = 1,dec = 5;

        for (int i = 1; i <= 3 ; i++ ){
            for(int j = 1; j <= dec; j++){
                if(j < inc){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            inc++;
            dec--;
        }
    }
}

