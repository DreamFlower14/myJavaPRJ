package aa;

public class Test {
    public static void main(String[] args) {
        // 내가 정의한 숫자가 홀수인지 짝수인지

        int a = 10;

        a++;
        System.out.printf(" a++ ==> %d \n", a);

        a--;
        System.out.printf(" a-- ==> %d \n", a);

        a+= 5;
        System.out.printf("a += 5 ==> %d \n", a);

        a-= 5;
        System.out.printf("a -= 5 ==> %d \n", a);

        a *= 5;
        System.out.printf("a *= 5 ==> %d \n", a);

        a /= 5;
        System.out.printf("a /= 5 ==> %d \n", a);

        a %= 5;
        System.out.printf("a %% 5 ==> %d \n", a); // %를 넣으려면 %% 2개를 넣어야한다  */

        int c = 10,b;

        b = c++; // c = c + 1,     b = c = c + 1
        System.out.printf("%d\n",b);

        b = ++c; // c + 1 = c,     b = c + 1 = c
        System.out.printf("%d\n",b);





    }
}
