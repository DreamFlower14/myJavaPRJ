package c;

public class C0525_6 {
    public static void main(String[] args) {
        int i = 1, j = 10;

        int s = sum(i,j);
        System.out.println("s : " + s);

        int m = sum(10,11);
        System.out.println("m : " + m);

    }
    public static int sum(int a, int b){
        int plus = 0;
        for (int i = a; i < b; i++) {
            plus += i;
        }
        return plus;
    }
}
