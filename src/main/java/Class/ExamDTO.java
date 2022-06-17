package Class;

import lombok.Getter;
import lombok.Setter;

@Setter // 밑에 Setter 를 림복 오픈소스에서 다운받은 거에서 알아서 해준다
@Getter // alt + insert 누르고 코드를 더 안써도 돼서 좋다
public class ExamDTO {
    
    private String test;    // private 가 포인트
    private int score;  // ExamOTO 만 쓸 수 있다

  /*  // alt + insert 를 하고 Getter and Setter 를 누르면 자동으로 생성된다.
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;   // this 는 이 파일 안에 있는 이라는 뜻이다
        // 여기서 this.test 는 ExamOTO 밑의 test 라는 뜻
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

   */

}
