package aa;

public class Test0522 {
    public static void main(String[] args) {
        /* While 문 기반 break */
        int i = 0;
        while(i < 5){
            if(i == 3){
                break;
            }
            System.out.println( i);
            i++;
        }
    }
}