package 프로그래머스;

import java.util.Arrays;

public class P12940 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        int m = 12;
        int[] result = sol.solution(n,m);

        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] solution(int n, int m) {
            int[] answer = new int[2];
            int divisor = 0;
            int multiple = 0;
            if(m % n ==0){
                answer[0] = n;
                answer[1] = m;
            } else{
                for(int i=1; i<=n; i++){
                    if(m%i == 0 && n%i == 0){
                        divisor = i;
                        multiple = (n/i)*m;
                    }
                }
                answer[0] = divisor;
                answer[1] = multiple;
            }
            return answer;
        }
    }
}
