public class Hello {
    public static void main(String[] args){
        System.out.println("BYE!! My last Java Coding!! ");
        System.out.print("it was good\n");
        int num = 2;
        System.out.printf("i want %d apples\n", num);

        /*
        int b = 2;
        int c = a + b;
        int d = c - a;
        int e = b * c;
        int f = e / b;
        int g = c % b;
        a++; // a = a + 1;
        a--; // a = a - 1;
        ++a;
        --a;

        System.out.println(a);
        a = a++;
        System.out.println(a);
        a = ++a;
        System.out.println(a);

        int i = 1;
        float j = 3.1f;
        double k = 3.14;
        System.out.println(i + j);
        System.out.println((int)(i + j));

        Scanner sc = new Scanner(System.in);
        
        System.out.println("숫자를 입력해주세요.");
        sc.nextInt();
        sc.
        System.out.println();

        int b;
        int c = 1;
        for(b = 9 ;b < 82 ; b += 9) {
            System.out.printf("9 * %d = %d\n", c, b);

            c++;
        }
        int d = 13;
        int e;
        for(e = 1; e < 10; e++) {
            //System.out.printf("%d * %d = %d\n", d, e, d * e);
            System.out.println(d + " * " + e + " = " + d * e);
        }

        for(int a = 0; a < 10; a++) {
            System.out.println(a);
        }
        int s = 100;

        while(s > 0) {
            --s;
            System.out.println(s);} */

        int a = 1;
        int b = 2;
        int c = a + b; // c = 3
        float d = c * a;  // d = 3
        float e = d++;   // e = 4

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println((c++) + " + " + --d + " = " + (c++ + d) );
        System.out.println( c );





    }
}
// 자바 파일명은 무조건 영문 대문자로 시작해야 함, 대소문자 구별함
// public class 파일명 외우기 *****
// 무조건 main 이라는 함수가 있어야지 자바가 실행함(시작점)
