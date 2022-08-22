package c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class C0511 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");


        Iterator<String> it = list.iterator(); // ArrayList와 같지만 hasNext와 Next의 기능를 추가로 가지고 있다.
//
        while (it.hasNext()){  // hasNext()는 주소 다음 내용이 있으면 true 없으면 false를 나타낸다.  -> while문이기 때문에 조건문에서 true가 나오면 whle문 내부 작업을 실행한다.
            String name = it.next(); // Next()는 주소 다음 요소가 있는곳으로 옮겨가라는 뜻이다
            System.out.println("이름 : " + name); //  그리고 출력~!
        }
        /*
         while문을 쓰는 이유는 for문은 반복횟수를 알기 위해 size변수를 만들면서 한번 더 돌기때문에 더 시간이 오래 걸리기 때문이다.
         원래 변수는 [주소][방1][방2][방3][방4] 순서로 되어있고 변수를 참조하게되면 무조건 주소위치를 우선으로 잡는다.
        */


        for(String name : list){   // String name : [ 이 자리에는 컬렉션 프레임워크만 가능하다] [다음 값이 있는지 확인하고 있으면 name에 변수내용을 넣어준다]
             System.out.println("이름 : "+ name);
         }
        // forEach문
        // 이 문법은 for문 만든 곳에서 사람들이 while문만 쓰니까 만든 문법, 최신 버전부터 사용가능하다.
        // while문의 단점인 코드가 길다는 것을 보안했다


        // 동기식 처리 : 작업을 시작하고 끝나면 다음 것으로 넘어간다
        // 장점 : 시작과 끝을 확실하게 알 수 있다.
        // 단점 : 한 작업이 끝나고 다음 작업으로 넘어가기 때문에 기다리는 동안 시간이 많이 걸린다.

        list.forEach(name -> System.out.println("name : " + name)); // name -> 로 출력문으로 값을 넣어준다.
        // 람다식 (특징 : 비동기 방식 -> 무조건 컬렉션 프레임워크에서만 사용한다.)(요즘 가장 핫한 방식)
        // 비동기 방식 : 작업이 완료되는 말든 일단 다 작업을 시작함 (이 작업은 잘됐을거야 생각하고 던짐)(비동기식를 구현하기 위해서 => 멀티쓰레드를 만들고 멀티쓰레드를 구현하기 위해서 => 병렬처리를 만듦)
        // 장점 : 동시에 여러개를 실행하니까 속도가 빨라진다. (-> 코딩 테스트에서 많이 사용한다)
        // 쓰레드 개념(작업 하나당 독립적인 공간을 가지고 있음)을 도입
        // -> 쓰레드가 작업 하나씩 다 돌린다, 독립적인 공간에서 작업을 실행하기 때문에 작업이 이어진 경우는 사용 못하고 독립적인 경우에만 가능하다)
        // 단점 : 시작은 알지만 언제 끝나는지 끝은 알 수 없다. 데이터를 처리하는 과정에서 순서가 바뀔 수 있다.




    }
}
