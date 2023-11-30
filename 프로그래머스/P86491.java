package 프로그래머스;

// https://school.programmers.co.kr/learn/courses/30/lessons/86491

public class P86491 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] sizes = {{14,4},{19,6},{6,16},{18,7},{7,11}};

        int result = sol.solution(sizes);
        System.out.println(result);
    }


    static class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int max = 0;
            int min = 0;
            for(int i=0; i<sizes.length; i++){
                int cardMax = Math.max(sizes[i][0], sizes[i][1]);
                int cardMin = Math.min(sizes[i][0], sizes[i][1]);

                max = Math.max(cardMax, max);
                min = Math.max(cardMin, min);
            }
            answer = max*min;
            return answer;
        }
    }
}
