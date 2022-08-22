package aa;

public class Exam01 {
    public static void main(String[] args) {
         System.out.println("김성현");
        System.out.println("자바 1~9강까지,11,12강까지 준비");
        System.out.println("왼쪽 ctrl + spacebar 하면 단축키 가능하다.");
        System.out.println("단축키의 종류에는 psvm과 sout이 있다.");
        System.out.println("psvm은 public static void main의 단축키");
        System.out.println("sout은 System.out.println의 단축키이다.");

        System.out.printf("100+100");  // ""안에는 문자로 인식
        System.out.printf("\n");  //ln과 같은 의미인 띄어쓰기를 추가
        System.out.printf("%d", 100 + 100); // "" 안에 %d을 넣으면 정수로 만든다
        System.out.printf("\n");

        System.out.print("문자들을 출력하지만");
        System.out.print(" 줄을 넘기진않는다");
        System.out.printf("\n");

        System.out.println("문자들을 출력하고");
        System.out.println("줄도 넘긴다");

        System.out.printf("%d / %d = %s", 100, 200, 0.5);

        System.out.printf("%d \n", 123);
        System.out.printf("%5d \n", 123);  // %5d : 5만큼 데이터 용량을 정해줌, 채우는 것은 오른쪽부터
        System.out.printf("%05d \n", 123);

        System.out.printf("%f  \n", 123.45);
        System.out.printf("%7.1f \n", 123.45);
        System.out.printf("%7.3f \n", 123.45);

        System.out.printf("%s \n", "Hi~java");
        System.out.printf("%10s \n", "Hi~java");

        int a;
        float b;

        a = (int) 12345678.45f;    // 정수형 변수에 실수를 대입 -> 올바르지 않음 (int)를 넣어 정수로 바꿔서 넣어준다. 실수가 정수를 포함하고 있기 때문에 가능(숫자이기 때문에 가능)
        b = 200;              // 실수형 변수에 정수를 대입 바람직하지 않음 -> 하지만 실수는 정수를 포함하고 있기 때문에 가능

        System.out.printf("a의 값 ==> %d \n", a); 
        System.out.printf("b의 값 ==> %f \n", b);

        /* int a, b;
        float c, d;

        a = 100;
        b = a;

        c = 111.1f;
        d = c;

        System.out.printf("a,b의 값 ==> %d , %d \n", a,b);
        System.out.printf("c,d의 값 ==> %5.1f , %5.1f \n", c,d);

        int a ,b ,c ,d;

        a = 100 + 100;
        b = a + 100;
        c = a + b -100;
        d = a + b + c;
        System.out.printf("a, b, c, d 의 값 ==> %d, %d, %d, %d \n", a, b, c, d);

        a = b = c = d = 100;  // 항상 방향은 오른쪽 -> 왼쪽으로
        System.out.printf("a, b, c, d 의 값 ==> %d, %d, %d ,%d \n", a, b, c, d);

        a = 100;
        a = a + 200;
        System.out.printf("a 의 값 ==> %d \n", a);

        Scanner in = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = in.nextLine();
        System.out.println("입력한 값 출력 : " + name); */


        }

    }


