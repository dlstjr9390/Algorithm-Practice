package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/140108

import java.util.ArrayList;
import java.util.List;

public class P140108 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "banana";

        int result = sol.solution(s);
        System.out.println(result); //3
    }


    static class Solution {
        public int solution(String s) {
            int answer = 0;
            int index = 0;
            int isX = 0;
            int isNotX = 0;
            List<String> strList = new ArrayList<>();
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<s.length(); i++){
                sb.append(s.charAt(i));
                char x = s.charAt(index);
                if(x == s.charAt(i)){
                    isX++;
                }else{
                    isNotX++;
                }

                if(isX == isNotX || i==s.length()-1){
                    strList.add(sb.toString());
                    sb.delete(0,sb.length());
                    index = i+1;
                }
            }
            answer = strList.size();
            return answer;
        }
    }
}
