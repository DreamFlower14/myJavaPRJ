package c;

public class C0608_2 {
    public static void main(String[] args) {
        /*
                    예외 처리
         : 개발자가 개발을 할 때 코드에서 오류가 나면 실행할 코드를 준비해놓는것
         에러계의 시조(최상위 조상) : Exception
         자주 발생되는 에러 : null 포인터 에러 : 메모리에 올라갈 때 실제 메모리에 주소, 값이 저장되는데 메모리에 안 올라갔는데 실행하려고 하면 null 포인터 인셉션이라는 오류가 발생한다.


        예외 처리의 기본 형식
        -----------------------------------------------------
            try {
                Java 코드...
            } catch ( 예외 타입 e(변수명 : exception 의 약자)){
                예외 발생 시 이 부분이 실행됨
            }
        -----------------------------------------------------
        예외 타입 : 에러 타입에 맞는 에러가 나면 catch 로 들어간다.
        e(변수명) : 에러 코드가 e에 저장된다. 디버깅 할 때 e를 보고 디버깅 한다.


         */

        // 기본 형태의 예제
        int[]  aa = new int[3];
        try {
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자가 배열크기보다 커요~!!");
            System.out.println("에러 메세지 : "+ e);
        }

//        C0608_2_2 fi = new C0608_2_2();
//        System.out.println(C0608_2_2.finally14());
    }
}

 class C0608_2_2{
    public static void finally14() {
        /*
        예외 처리의 전체 형식
        -----------------------------------------------------
            try {
                Java 코드...
            } catch ( 예외 타입 e(변수명 : exception 의 약자)){
                예외 발생 시 이 부분이 실행됨
            } catch ( 예외 타입 e(변수명 : exception 의 약자)){
                예외 발생 시 이 부분이 실행됨
            } catch ( Exception e(변수명 : exception 의 약자)){
                예외 발생 시 이 부분이 실행됨
            } finally {  // 메모리 처리 해주는 것 넣어주면 좋다 // 거의 필수
                에러 여부와 상관없이 무조건 실행되는 부분
            }
        -----------------------------------------------------
        // Exception 은 모든 오류를 포함하고 있기 때문에 마지막에 넣어서 오류 타입을 모르는 에러까지 다 잡아준다.
        //           ※ 항상 catch 의 끝에 넣어야 한다.
        //            -> catch 는 순서대로 실행되기 때문에 앞에 넣으면 모든 에러를 혼자 다 채가서 실행해버린다
        //            그러면 각 에러 케이스에 맞게 실행할 것들이 작동하지 않는다.
         */


        // 에러가 여려개 있을 때의 예제
        int[] aa = new int[3];
        try {
            aa[2] = 100/0;
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자가 배열크기보다 커요~!!");
            System.out.println("에러 메세지 : "+ e);
        } catch (ArithmeticException e){
            System.out.println("0으로 나누는 등의 오류에요 ~!!");
            System.out.println("에러 메세지 : "+ e);
        } catch (Exception e){
            System.out.println("위에서 못잡은 모든 오류를 잡아요!!");
            System.out.println("에러 메세지 : "+ e);
        } finally{
            System.out.println("이 부분은 에러 여부와 상관없이 무조건 실행돼요!");
        }
        return;
    }
}

class C0608_2_3{
    public static void throw14() {
        /*
        오류메세지 직접 만들기 - 에러 발생
        throw : 유효성 체크용으로 상당히 많이 쓴다. ex) 회원가입


         */
        int a = 100, b = 0;
        int result;

        try {
            if ( b == 0){
                throw new Exception("0으로 나누는게 말이 되냐;;");
            }
            result = a /b;
        } catch (Exception e) {
            System.out.println(" 발생 오류 ==> ");
            System.out.println(e.getMessage());
        }
    }
}