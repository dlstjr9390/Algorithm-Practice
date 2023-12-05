package 프로그래머스;

// https://school.programmers.co.kr/learn/courses/30/lessons/68644

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P42748 {
    public static void main(String[] args) {

        int[] numbers = {2, 1, 3, 4, 1};

        Solution sol = new Solution();

        int[] result = sol.solution(numbers);
        System.out.println(Arrays.toString(result)); // {2, 3, 4, 5, 6, 7}
    }

    static class Solution {
        public int[] solution(int[] numbers) {

            List<Integer> sumList = new ArrayList<>();

            for(int i=0; i<numbers.length; i++){
                for(int j=i+1; j<numbers.length; j++){
                    if(!sumList.contains(numbers[i]+numbers[j])){
                        sumList.add(numbers[i]+numbers[j]);
                    }
                }
            }

            int[] answer = new int[sumList.size()];
            for(int i=0; i<sumList.size(); i++){
                answer[i] = sumList.get(i);
            }
            Arrays.sort(answer);
            return answer;
        }
    }
}
