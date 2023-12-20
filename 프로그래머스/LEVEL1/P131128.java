package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/131128

public class P131128 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String X = "5525";
        String Y = "1255";

        String result = sol.solution(X,Y);
        System.out.println(result); // "552"
    }



    static class Solution {
        public String solution(String X, String Y) {
            String answer = "";
            StringBuilder sb = new StringBuilder();
            for(int i=9; i>=0; i--){
                if(X.contains(i+"") && Y.contains(i+"")){
                    int xPairLength = X.length() - X.replace((i+""),"").length();
                    int yPairLength = Y.length() - Y.replace((i+""),"").length();
                    int min = Math.min(xPairLength,yPairLength);
                    for(int j=0; j<min; j++) {
                        sb.append(i);
                    }
                }
            }
            answer = sb.toString();
            if(answer.isEmpty()){
                answer = "-1";
            } else if(answer.charAt(0) == '0'){
                answer = "0";
            }
            return answer;
        }
    }
}
