package Class;

public class C0518_6 {
    public static void main(String[] args) {
        String str = "  한글  ABCD    efgh    ";

        System.out.println("원 문자열 : [" + str + "]" );
        System.out.println("대문자로 : [" + str.toUpperCase() + "]");
        System.out.println("소문자로 : [" + str.toLowerCase() + "]");
        System.out.println("공백 제거 : [" + str.trim() + "]");
        System.out.println("전체공백 제거 : [" + str.replace(" ", "") + "]");
    }
}
