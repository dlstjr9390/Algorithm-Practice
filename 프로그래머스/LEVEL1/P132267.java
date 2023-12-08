package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/132267

public class P132267 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 2;
        int b = 1;
        int n = 20;

        int result = sol.solution(a,b,n);
        System.out.println(result); // 19
    }

    static class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;
            int bottle = n;
            int remain = 0;
            while(bottle >= a){
                remain = bottle % a ;
                bottle = (bottle/a)*b;

                answer += bottle;

                bottle = bottle + remain;
            }
            return answer;
        }
    }
}
