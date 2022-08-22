package c;

public class Class0509 {
    public static void main(String[] args) {
        int aa[] = {100,200,300,400};
        int bb[] = new int[] {100,200,300};

        int cc[];
        cc = new int[] {100,200};
        int[] dd = new int[1];
        dd[0] = 100;
        int i;

        for (i = 0; i < 4; i++) {
            System.out.printf("aa[%d] ==> %d\t", i, aa[i]);
            System.out.println();
        }
    }
}
