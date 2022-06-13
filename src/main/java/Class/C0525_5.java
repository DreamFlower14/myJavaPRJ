package Class;

public class C0525_5 {
    public static void main(String[] args) {
        /*  메소드의 장점
            - 코드의 중복을 줄일 수 있다.
            - 코드를 모듈화해 가독성을 높여 품질을 향상시킨다.
            - 유지보수하기 좋다.
         */
    }
        // 기본적인 함수 구조 (메서드, 펑션)
    public static int sum(int a, int b){
        // public(접근 지정자) : public 은 아무나 접근 가능하다.
        // static : 자동으로 메모리에 올라간다. (무조건 메모리에 올린다. 함수를 메모리에 올릴 때 new 를 써서 올리는 방법의 함수방식)
        // -> 자바는 메모리에 올라가야만 쓸 수 있다.
        // int(반환타입) : 값을 타입으로 반환한다. (int, String, char 등등...) 값을 반환하지 않고 싶으면 void 로 만든다.
        // 함수명 : 아무거나 가능, 보통 기능에 직관적으로 만든다 (ex) sum, plus, avr 등등..)
        // (매개변수) : 더하려는 값.
        int plus = 0;
        for (int i = a; i < b; i++) {
            plus += i;
        }
        return plus; // 반환타입이 void 가 아니면 리턴 값을 써줘야 한다.
    }
}
