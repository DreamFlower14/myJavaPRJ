import java.util.Scanner;

public class Exam0412_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        //int inc = (num*2)-1;
        int start = 1;
        int finish = num*2;

        for (int i = 1; i <= (num*2)-1 ; i++ ){
            for(int j = 1; j <= (num*2)-1; j++){
                if(j > start && j < finish){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i < num){
                start++;
                finish--;
            } else {
                start--;
                finish++;
            }
        }
    }
}

