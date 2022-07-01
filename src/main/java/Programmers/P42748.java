package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class P42748 {
    public static int[] solution(int[] array, int[][] commands) {
        List<Integer> mid = new ArrayList<>();  // 자른 값 넣을 컬렉션
        int[] answer = new int[commands.length];   // 결과값 넣을 배열

        for (int i = 0; i < commands.length; i++) { // 케이스의 수만큼 반복
            int s = commands[i][0]-1;   // s 부터
            int e = commands[i][1]-1;   // e 까지
            int n = commands[i][2]-1;   // n 번째 수

            for (int j = s; j <= e; j++) {
                mid.add(array[j]);  // 1. array 배열의 s부터 e까지 mid 컬렉션에 넣어주기
            }

            Collections.sort(mid);  // 2. 넣은수 정렬하기
            answer[i] = mid.get(n); // 3. 대답해주는 배열에 n번째 수 넣어주기
            mid.clear();    // mid 에 넣어둔거 초기화 하기
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4}; // 원본 배열
        int [][] arr2 = {
                {2, 5, 3},  // 2부터 5까지 자르고 정렬하고 3번째 수 뽑기
                {4, 4, 1},  // 4부터 4까지 자르고 정렬하고 1번째 수 뽑기
                {1, 7, 3}   // 1부터 7까지 자르고 정렬하고 3번째 수 뽑기
        };
        int[] sol = solution(arr,arr2);

        for (int j : sol) {
            System.out.println(j);
        }
    }
}
