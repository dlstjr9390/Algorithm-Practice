package 프로그래머스.LEVEL1;

//https://school.programmers.co.kr/learn/courses/30/lessons/155652

public class P155652 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        String result = sol.solution(s,skip,index);
        System.out.println(result); // "happy"
    }
    static class Solution {
        public String solution(String s, String skip, int index) {
            String answer = "";

            for (int i = 0; i < s.length(); i++) {
                char charS = s.charAt(i);
                for (int j = 0; j < index; j++) {
                    charS += 1;
                    if (charS > 'z') {
                        charS -= 26;
                    }
                    if (skip.contains(String.valueOf(charS))) {
                        j--;
                    }
                }
                answer += charS;
            }

            return answer;
        }
    }
}
