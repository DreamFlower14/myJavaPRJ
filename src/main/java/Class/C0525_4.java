package Class;

public class C0525_4 {
    public static void main(String[] args) {
        String str = "Java programming";
        String str1 = "Java programming";  // 값이 같은 두 변수가 있으면 2번째부터는 새로 메모리에 저장하지않고 첫 번째와 같은 메모리 주소를 쓴다.
        String str2 = new String("Java programming");

        System.out.println("원 문자열1 : " + str);
        System.out.println("원 문자열2 : " + str1);
        System.out.println("원 문자열3 : " + str2);

        System.out.println("문자열1 == 문자열2 : " + (str == str1));  // ==은 같은 메모리에 있으면 true를 출력한다
        System.out.println("문자열1.equals(문자열2) : " + str.equals(str1));  // equals 는 메모리와 상관없이 값만 비교한다.
        System.out.println("문자열1 == 문자열3 : " + (str == str2));
        System.out.println("문자열1.equals(문자열3) : " + str.equals(str2));

        System.out.println("문자열1과 문자열 2가 다른지 비교 compareTo 안쓰고 이렇게 함 : "+ !str.equals(str1));   // 같으면 true를 출력하기 때문에 !을 쓴다.


    }
}
