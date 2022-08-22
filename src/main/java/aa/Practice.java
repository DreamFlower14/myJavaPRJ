package aa;

public class Practice {
    public static void main(String[] args) {
         String str1 = "IT CookBook 입니다.";
        String str2 = "10";
        String str3 = "20";

        str1 = "Java 입니다.";

        System.out.printf("%s \n", str1);
        System.out.printf("%s \n", str2 + str3);

        int a = 2, b = 3, c = 4;
        int result1, mok, namugi;
        float result2;

        result1 = a + b - c;
        System.out.printf(" %d + %d - %d = %d \n", a, b, c, result1);

        result1 = a + b * c;
        System.out.printf(" %d + %d * %d = %d \n", a, b, c, result1);

        result2 = a * b / (float) c;  // 정수형 변수 c를 실수형으로 강제 형변환 시킴, 계산 순서가 오른쪽에서 왼쪽으로 가서 b / c를 먼저하고 그 값에 a 를 곱해준다.
        System.out.printf(" %d * %d / %d = %f \n", a, b, c, result2);

        mok = c / b;
        System.out.printf(" %d / %d 의 몪은 %d \n", c, b, mok);

        namugi = c & b;
        System.out.printf(" %d / %d 의 나머지는 %d \n", c, b, namugi);




    }

}
