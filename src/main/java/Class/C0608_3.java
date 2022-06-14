package Class;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class C0608_3 {
    public static void main(String[] args) throws IOException {
        /*
        파일 입출력

            파일 입출력의 기본 과정
        1. 파일 열기
        2. 파일 쓰기 또는 읽기 작업
        3. 파일 닫기

        파일 열기
        읽기용 : FileInputStream 변수명 = new FileInputStream("파일명")
        쓰기용 : FileOutputStream 변수명 = new FileOutputStream("파일명")
        Stream (데이터 구조) : 용량이 큰 데이터 처리할 때 다 다운받고 처리하지않고 데이터를 처음부터 한쪽에 넣어두고 조금씩 빼와서 처리
                                파일을 다운 받을 때 파일을 다 다운받고 시청하지 않고 다운받으면서 시청하는 것과 비슷함

         */
        FileInputStream fis = new FileInputStream("/class/hi.txt");  
        // 기본 드라이브가 c 인것을 알고 있기 때문에 c:/ 를 안써줘도 된다.
        
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8); 
        // fis 로 아스키 코드로 읽은 것을  다시 isr 로 다시 읽고 UTF_8방식으로 다시 읽는다.
        // 한국어로 출력하려면 무조건 UTF_8을 가져와야하고 굳이 외울 필요는 없다. 

        int ch;

        while ( (ch = isr.read()) != -1){  // File stream 함수의 특징 -> 다 처리하면 -1을 출력한다
            System.out.print((char)ch);
        }
        fis.close();   // 파일을 열고 출력을 할 일들을 다 했으니 닫기
    }
}
