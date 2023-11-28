package 프로그래머스;

public class P12903 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcde";
        String result = sol.solution(s);

        System.out.println(result); // "c"
    }

    static class Solution {
        public String solution(String s) {
            String answer = "";
            if(s.length() % 2 == 0){
                answer = s.substring(s.length()/2-1,s.length()/2+1);
            } else{
                answer = s.substring(s.length()/2,s.length()/2+1);
            }
            return answer;
        }
    }
}

