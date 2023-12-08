package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12918

public class P12918 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "a123";
        boolean result = sol.solution(s);

        System.out.println(result); // "false"
    }

    static class Solution {
        public boolean solution(String s) {
            boolean answer = true;
            if(s.length() == 4 || s.length() == 6){
                for(int i=0; i<s.length(); i++){
                    if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                        answer = false;
                    }
                }
            } else{
                answer = false;
            }
            return answer;
        }
    }
}
