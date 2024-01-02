package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/118666

import java.util.HashMap;
import java.util.Map;

public class P118666 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5,3,2,7,5};

        String result = sol.solution(survey,choices);
        System.out.println(result); // "TCMA"
    }

    static class Solution {
        public String solution(String[] survey, int[] choices) {
            String answer = "";
            String[] type = {"RT", "CF", "JM", "AN"};
            Map<String, Integer> typeMap = new HashMap<>();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<type.length; i++){
                typeMap.put(type[i],0);
            }
            for (int i = 0; i < survey.length; i++) {
                sb.append(survey[i]);
                if (typeMap.containsKey(sb.toString())) {
                    typeMap.replace(sb.toString(), typeMap.get(sb.toString()) + (choices[i]-4));
                } else if (typeMap.containsKey(sb.reverse().toString())) {
                    typeMap.replace(sb.toString(), typeMap.get(sb.toString()) + (4-choices[i]));
                }
                sb.delete(0, 2);
            }
            for (int i = 0; i < typeMap.size(); i++) {
                if(typeMap.get(type[i]) > 0){
                    sb.append(type[i].charAt(1));
                } else {
                    sb.append(type[i].charAt(0));
                }
            }
            answer = sb.toString();
            return answer;
        }
    }
}
