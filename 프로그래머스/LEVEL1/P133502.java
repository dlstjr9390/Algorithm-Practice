package 프로그래머스.LEVEL1;

import java.util.*;

public class P133502 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        int result = sol.solution(ingredient);
        System.out.println(result); // 2
    }

    static class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;
            StringBuilder sb = new StringBuilder();
            for (int i : ingredient) {
                sb.append(i);
                if(sb.length() >= 4 && sb.substring(sb.length()-4,sb.length()).equals("1231")){
                    sb.delete(sb.length()-4,sb.length());
                    answer++;
                }
            }
            return answer;
        }
    }
}
