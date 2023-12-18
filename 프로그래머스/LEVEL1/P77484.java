package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/77484

import java.util.Arrays;

public class P77484 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] wind_nums = {31, 10, 45, 1, 6, 19};

        int[] result = sol.solution(lottos,wind_nums);
        System.out.println(Arrays.toString(result)); // {3,5}
    }

    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int min = 0;
            int zeroNum = 0;

            Arrays.sort(lottos);
            Arrays.sort(win_nums);
            for(int i=0; i<lottos.length; i++){
                if(lottos[i] != 0){
                    for(int j=0; j<win_nums.length; j++){
                        if(lottos[i] == win_nums[j]){
                            min++;
                        }
                    }
                } else{
                    zeroNum++;
                }
            }
            int max = min + zeroNum;
            answer[0] = 7 - max;
            answer[1] = 7 - min;
            if(answer[0] > 6){
                answer[0] = 6;
            }
            if(answer[1] > 6){
                answer[1] = 6;
            }
            return answer;
        }
    }
}
