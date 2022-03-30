import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
       /* int a = 200;
        if (a < 100) {
            System.out.printf("100보다 작군요..\n");
        } else {
            System.out.printf("100보다 크군요..");}


        int a = 75;

        if ( a > 50 ){
            if ( a < 100){
                System.out.printf("50보다 크고 100보다 작군요..\n");}
                else {
                    System.out.printf(" 와 100보다 크군요\n");
                }}else {
                System.out.printf("dorp~ 50qhek wkrdnsdy...\n");  } */
        Scanner s = new Scanner(System.in);

        int a;
        System.out.printf("점수 입력");
        a = s.nextInt();

        if(a >90){
            System.out.println("A");
        }
        else if(a >= 80 ){
                System.out.println("B");
            }
        else if (a >= 70){
            System.out.printf("C");}
        else if(a>=60){
                System.out.print("D");}
            else{
                System.out.printf("F");
            }}

}
