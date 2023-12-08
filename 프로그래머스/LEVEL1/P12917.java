package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12917

import java.util.Arrays;

public class P12917 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "Zbcdefg";
        String result = sol.solution(s);

        System.out.println(result); // "gfedcbZ"
    }

    static class Solution {
        public String solution(String s) {
            String answer = "";
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            for(int i=charArr.length-1; i>=0; i--){
                answer += charArr[i];
            }
            return answer;
        }
    }
}
