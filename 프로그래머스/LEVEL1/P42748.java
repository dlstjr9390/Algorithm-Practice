package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/42748

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P42748 {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Solution sol = new Solution();

        int[] result = sol.solution(array,commands);
        System.out.println(Arrays.toString(result)); // {5, 6, 3}
    }

    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            List<Integer> intList = new ArrayList<>();

            for(int i=0; i<commands.length; i++){

                for(int j=commands[i][0]; j<=commands[i][1]; j++){
                    intList.add(array[j-1]);
                }

                Collections.sort(intList);
                answer[i] = intList.get(commands[i][2]-1);
                intList.clear();
            }
            return answer;
        }
    }
}
