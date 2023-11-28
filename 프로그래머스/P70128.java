package 프로그래머스;

// https://school.programmers.co.kr/learn/courses/30/lessons/70128

public class P70128 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int result = sol.solution(a,b);

        System.out.println(result); //3
    }
    static class Solution {
        public int solution(int[] a, int[] b) {
            int answer = 0;
            for(int i=0; i<a.length; i++){
                answer += a[i]*b[i];
            }
            return answer;
        }
    }
}
