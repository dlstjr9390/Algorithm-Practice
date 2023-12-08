package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12915

import java.util.Arrays;
import java.util.Comparator;

public class P12915 {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;

        Solution sol = new Solution();

        String[] result = sol.solution(strings,n);
        System.out.println(Arrays.toString(result)); // {"abcd", "abce", "cdx"}


    }
    static class Solution {
        public String[] solution(String[] strings, int n) {
            String[] answer;

            Arrays.sort(strings, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.charAt(n) - o2.charAt(n) == 0){
                        return o1.compareTo(o2);
                    }else{
                        return o1.charAt(n) - o2.charAt(n);
                    }

                }
            });

            answer = Arrays.copyOf(strings,strings.length);
            return answer;
        }
    }

}

