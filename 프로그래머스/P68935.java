package 프로그래머스;

public class P68935 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 45;
        int result = sol.solution(n);

        System.out.println(result);
    }

    static class Solution {
        public int solution(int n) {
            int answer;
            String trit = Integer.toString(n,3);
            StringBuilder sb = new StringBuilder(trit);
            String reverseTrit = sb.reverse().toString();

            answer = Integer.parseInt(reverseTrit,3);

            return answer;
        }
    }
}
