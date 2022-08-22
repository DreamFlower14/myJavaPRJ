package c;

public class C0518_4 {
    public static void main(String[] args) {
        String str = "지금 배우는 자바1는 재미있어요. 자바2를 자바3버렸네";

        System.out.println("문자열 ==> " + str);

        System.out.print("제일 처음 나오는 자바 위치 : ");
        System.out.println(str.indexOf("자바"));
        System.out.print("마지막 자바 위치 : ");
        System.out.println(str.lastIndexOf("자바"));
        // 로그 주소 앞에는 숫자가 있는데 그 숫자를 알아낼 때 그 숫자가 끝나고 나오는 공백의 위치를 받고 그 앞까지 출력하는 식로 많이 쓴다.


        for (int i = 7; i < 10; i++) {
            System.out.print(str.charAt(i));
        }
    }
}
