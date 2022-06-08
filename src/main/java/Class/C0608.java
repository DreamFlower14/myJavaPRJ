package Class;

public class C0608 {
    public static void main(String[] args) {
        // New Static 의 정의

        String hello = " 안냥";
        System.out.println(hi(hello));
        // 같은 "Class(C0608)" 밑의 함수 hi를 가져와서 쓴 코드

        sum sum11 = new sum(); //최상위 단위 "Class"를 메모리에 올리려면 쓰려는 곳에다가 new 함수를 쓴다.
        System.out.println(sum11.sum1(1,2));
//        System.out.println(sum11.);


    }
    public static String hi(String s) {    // "Class 밑의 함수를 메모리에 올리려면 Static 을 쓰면 된다.
        return s;
    }
}

class sum{    // 최상위 단위 "Class"
    public int sum1(int num1, int num2){
        int gop = num1 * num2;
        return num1 + num2;
    }
}

// new : 클래스 단위로 메모리에 올린다.
// Static : 함수,메소드,변수 단위로 메모리에 올린다.

// new 와 Static 의 차이
//  - 메모리에 저장되는 장소가 다르다
// new : heap 이라는 공간에 저장, 메모리에 올라가면 내 맘대로 메모리에 올라간 내용을 지울 수 있다.
// Static : Static 이라는 공간에 저장, 자바가 완전히 종료할 때까지 절대 안 사라짐.
