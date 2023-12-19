package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/133499

import java.util.Arrays;

public class P133499 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        int result = sol.solution(babbling);
        System.out.println(result); // 2
    }

    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            String[] words = {"aya", "ye", "woo", "ma"};
            String recentWord = "";
            String currentWord = "";

            for (int i = 0; i < babbling.length; i++) {
                char[] babblingWord = babbling[i].toCharArray();
                for (int j = 0; j < babblingWord.length; j++) {
                    currentWord += babblingWord[j];
                    if (Arrays.asList(words).contains(currentWord) && !currentWord.equals(recentWord)) {
                        recentWord = currentWord;
                        currentWord = "";
                    }
                }
                if(currentWord.isEmpty()){
                    answer++;
                }
                recentWord = "";
                currentWord = "";
            }
            return answer;
        }
    }
}
