package 프로그래머스;

// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class P12926 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "a B z";
        int n = 4;

        String result = sol.solution(s,n);
        System.out.println(result); // "e F d"
    }
   static class Solution {
        public String solution(String s, int n) {
            String answer = "";
            for(int i=0; i<s.length(); i++){
                if((s.charAt(i)+n > 'Z' && s.charAt(i) < 'a')|| s.charAt(i)+n > 'z'){
                    answer += (char)(s.charAt(i) -26 +n);
                } else if (s.charAt(i) == ' '){
                    answer += s.charAt(i);
                } else{
                    answer += (char)(s.charAt(i)+n);
                }

            }
            return answer;
        }
    }
}
