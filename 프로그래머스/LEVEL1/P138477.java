package 프로그래머스.LEVEL1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/138477

public class P138477 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int k =3;
        int[] score = {100,30,40,150,300,200,200};
        int[] result = sol.solution(k,score);
        System.out.println(Arrays.toString(result));
    }
    static class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            int[] fameArray = new int[k];
            int min = -1;
            for (int i = 0; i < score.length; i++) {
                if (i >= k) {
                    Arrays.sort(fameArray);
                    if (fameArray[0] < score[i]) {
                        fameArray[0] = score[i];
                    }
                    Arrays.sort(fameArray);
                    answer[i] = fameArray[0];
                } else {
                    fameArray[i] = score[i];
                    for(int j = 0; j<=i; j++){
                        if(min > fameArray[i] || min == -1){
                            min = fameArray[i];
                        }
                    }
                    answer[i] = min;
                }
            }

            return answer;
        }
    }
}
