package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/142086

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P142086 {

    public static void main(String[] args) {
        String s = "banana";
        Solution sol = new Solution();

        int[] result = sol.solution(s);
        System.out.println(Arrays.toString(result)); // [-1, -1, -1, 2, 2, 2]
    }

    static class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            List<Character> charList = new ArrayList<>();
            int index = 1;

            for(int i=0; i<s.length(); i++){
                if(!charList.contains(s.charAt(i))){
                    answer[i] = -1;
                } else{
                    for(int j=charList.size()-1; j>=0; j--){
                        if(charList.get(j).equals(s.charAt(i))){
                            answer[i] = index;
                            index = 1;
                            break;
                        }
                        index++;
                    }
                }
                charList.add(s.charAt(i));
            }
            return answer;
        }
    }
}
