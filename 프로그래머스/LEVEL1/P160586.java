package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/160586

import java.lang.annotation.Target;
import java.util.Arrays;

public class P160586 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] keymap = {"BC"};
        String[] targets = {"AC","BC"};

        int[] result = sol.solution(keymap,targets);
        System.out.println(Arrays.toString(result)); // "{-1, 3}"
    }


    static class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];
            int min = 101;
            for(int i=0; i<targets.length; i++){
                for(int j=0; j<targets[i].length(); j++){
                    for(int k=0; k<keymap.length; k++){
                        if(keymap[k].contains(Character.toString(targets[i].charAt(j)))){
                            min = Math.min(keymap[k].indexOf(targets[i].charAt(j))+1, min);
                        }
                    }
                    if(min != 101){
                        answer[i] = answer[i]+min;
                    } else{
                        answer[i] = -1;
                        break;
                    }

                    min = 101;
                }
            }
            return answer;
        }
    }
}
