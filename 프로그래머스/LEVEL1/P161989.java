package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/161989

public class P161989 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};

        int result = sol.solution(n,m,section);
        System.out.println(result); // 2
    }

    static class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 0;
            int paintedSection = 0;
            for(int i=0; i<section.length; i++){
                if(section[i]>paintedSection){
                    paintedSection = section[i] + m -1;
                    answer++;
                }
            }
            return answer;
        }
    }
}
