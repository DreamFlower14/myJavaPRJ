public class Class0413_2 {
    public static void main(String[] args) {
        /* int i,k;

        for(i = 0; i < 3; i++){
            for(k = 0;k<2; k++){
                System.out.printf("중첩 for문 입니다. (i값: %d, k값: %d)\n",i,k);
            }
        }

        for(int i = 2; i < 10; i++){
            for(int k = 1; k < 10; k ++){
                System.out.println(i + " x " + k + " = " + i*k);
            }
            System.out.println();
        }*/
        int i,hap;
        i = 1;
        hap = 0;

        while (i < 11){
            hap += i;
            i++;
        }
        System.out.println(hap);
    }
}
