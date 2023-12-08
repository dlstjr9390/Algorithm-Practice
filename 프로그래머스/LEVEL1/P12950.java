package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12950

import java.util.Arrays;

public class P12950 {

    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        Solution sol = new Solution();
        int[][] result = sol.solution(arr1, arr2);
        System.out.println(Arrays.deepToString(result)); // "{{4,6},{7,9}}"
    }
    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr1[0].length];
            for(int i=0; i<arr1.length; i++){
                for(int j=0; j<arr1[i].length; j++ ){
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return answer;
        }
    }
}
