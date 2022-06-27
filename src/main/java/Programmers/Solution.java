/*
package Programmers;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] mid = new int[array.length];
        int[] answer = new int[array.length];

        for (int i = 0; i < commands.length; i++) {
            int s = commands[i][0]+1;
            int e = commands[i][1]+1;
            int n = commands[i][2]+1;
            for (int j = s; j < e; j++) {
                mid[j] = array[j];
                Arrays.sort(mid);
                answer[i] = mid[n];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution((1,5, 2, 6, 3, 7, 4),([2, 5, 3], [4, 4, 1], [1, 7, 3]))
    }
}*/
