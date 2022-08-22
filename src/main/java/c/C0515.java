package c;

public class C0515 {
    public static void main(String[] args) {
        String text = "┌┬┐├┼┤└┴┘";
        System.out.printf("%S",text);
        for(int i = 0; i < text.length(); i++) {
            System.out.println("=========================================================");
            System.out.println(text.charAt(i)); // 10진수//
            System.out.println((int)text.charAt(i)); // 아스키코드 및 유니코드
            System.out.format("0x %02X%n", (int)text.charAt(i)); // 아스키코드 ex) A -> 0x41 // 16진수
            System.out.format("0x %04X%n", (int)text.charAt(i)); // 유니코드 ex) 가 -> 0xAC00 }
            System.out.println("=========================================================");
        }
    }
}