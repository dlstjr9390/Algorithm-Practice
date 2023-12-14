package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/42840

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P42840 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] answers = {1,3,2,4,2};

        int[] result = sol.solution(answers);
        System.out.println(Arrays.toString(result)); // [1,2,3]
    }

    static class Solution {
        public int[] solution(int[] answers) {
            int[] answer = new int[3];
            List<Integer> highScorer = new ArrayList<>();
            int[] person1 = {1,2,3,4,5};
            int[] person2 = {2,1,2,3,2,4,2,5};
            int[] person3 = {3,3,1,1,2,2,4,4,5,5};
            for(int i=0;i<answers.length;i++){
                if(answers[i] == person1[i % person1.length]){
                    answer[0]++;
                }
                if(answers[i] == person2[i % person2.length]){
                    answer[1]++;
                }
                if(answers[i] == person3[i % person3.length]){
                    answer[2]++;
                }
            }
            int max = Math.max(Math.max(answer[0],answer[1]),answer[2]);
            if(max == answer[0]){
                highScorer.add(1);
            }
            if(max == answer[1]){
                highScorer.add(2);
            }
            if(max == answer[2]){
                highScorer.add(3);
            }
            int[] result = new int[highScorer.size()];
            for(int i=0; i<highScorer.size(); i++){
                result[i] = highScorer.get(i);
            }

            return result;
        }
    }
}
