package aa;

import java.util.Scanner;

public class Exam0412 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int inc = num;
        int dec = num;

        for (int i = 1; i <= (num*2)-1 ; i++ ){ // 5 -> 9
            for(int j = 1; j <= inc; j++){
                if(j < dec){
                    System.out.print(j);
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i < num){
                inc++;
                dec--;
            } else {
                inc--;
                dec++;
            }
        }
    }
}

