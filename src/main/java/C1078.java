public class C1078 {
    public static void main(String[] args) {
        int hap = 0;

        for(int i = 1; i <101; i++){
            if(i % 2 == 1){
                hap += i;
            }
        }
        System.out.println(hap);
    }
}
