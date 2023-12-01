package 프로그래머스;

// https://school.programmers.co.kr/learn/courses/30/lessons/81301

import java.util.Arrays;

public class P81301 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "one4seveneight";

        int result = sol.solution(s);
        System.out.println(result); // 1478
    }
    static class Solution {
        public int solution(String s) {
            int answer = 0;
            String strNum = "";
            String strAnswer = "";
            String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) >= 48 && s.charAt(i) <= 57 ){
                    strAnswer += s.charAt(i)+"";
                } else {
                    strNum += s.charAt(i)+"";
                    if(Arrays.asList(strArr).contains(strNum)){
                        int num = Arrays.asList(strArr).indexOf(strNum);
                        strAnswer += num+"";
                        strNum = "";
                    }
                }
            }
            answer = Integer.parseInt(strAnswer);
            return answer;
        }
    }
}
