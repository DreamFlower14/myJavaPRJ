public class Exam01 {
    public static void main(String[] args) {
        System.out.println("김성현");
        System.out.println("자바 1~9강까지,11,12강까지 준비");
        System.out.println("왼쪽 ctrl + spacebar 하면 단축키 가능하다.");
        System.out.println("단축키의 종류에는 psvm과 sout이 있다.");
        System.out.println("psvm은 public static void main의 단축키");
        System.out.println("sout은 System.out.println의 단축키이다.");

        System.out.printf("\n");
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

    }

}
