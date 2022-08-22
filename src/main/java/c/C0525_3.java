package c;

public class C0525_3 {
    public static void main(String[] args) {
        String str = "Java programming";
        String str2 = "Java IT CookBook";

        System.out.println("원 문자열 : " + str);
        System.out.println("원 문자열 : " + str2);

        System.out.println(str.compareTo(str2));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.indexOf("Java") > -1);
    }
}
