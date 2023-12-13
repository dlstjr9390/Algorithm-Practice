package 프로그래머스.LEVEL1;

//https://school.programmers.co.kr/learn/courses/30/lessons/135808

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P135808 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int k = 4;
        int m = 3;

        int result = sol.solution(k,m,score);
        System.out.println(result); // 33
    }

   static class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            List<Integer> apples = new ArrayList<>();
            Arrays.sort(score);
            for(int i=score.length-1; i>=0; i--){
                apples.add(score[i]);
                if(apples.size() == m){
                    answer += apples.get(m-1)*m;
                    apples.clear();
                }
            }
            return answer;
        }
    }
}
