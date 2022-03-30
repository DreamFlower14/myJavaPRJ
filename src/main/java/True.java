public class True {
    public static void main(String[] args) {

        // 관계연산자 return 타입은 boolean이다.

        int a = 100, b = 200;
        System.out.printf(" %d == %d 는 %s 이다.\n", a, b, a == b);

        System.out.printf(" %d != %d 는 %s 이다.\n", a, b, a != b);

        System.out.printf(" %d < %d 는 %s 이다.\n", a, b, a < b);

        System.out.printf(" %d > %d 는 %s 이다.\n", a, b, a > b);

        System.out.printf(" %d >= %d 는 %s 이다.\n", a, b, a >= b);

        System.out.printf(" %d <= %d 는 %s 이다.\n", a, b, a <= b);

        System.out.printf(" %d = %d 는 %s 이다.\n", a, b, (a = b));

    }
}
