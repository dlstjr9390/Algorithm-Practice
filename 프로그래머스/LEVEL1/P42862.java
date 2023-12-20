package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/42862

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P42862 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};

        int result = sol.solution(n,lost,reserve);
        System.out.println(result); // 5
    }



    static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;
            answer = n - lost.length;
            Arrays.sort(lost);
            Arrays.sort(reserve);
            List<Integer> reserveList = new ArrayList<>();
            for (int i = 0; i < reserve.length; i++) {
                reserveList.add(reserve[i]);
            }
            for (int i = 0; i < lost.length; i++) {
                if (reserveList.contains(lost[i])) {
                    answer++;
                    reserveList.remove(reserveList.indexOf(lost[i]));
                    lost[i] = -99;
                }
            }
            for (int i = 0; i < lost.length; i++) {
                if (reserveList.contains(lost[i] - 1)) {
                    answer++;
                    reserveList.remove(reserveList.indexOf(lost[i] - 1));
                } else if (reserveList.contains(lost[i] + 1)) {
                    answer++;
                    reserveList.remove(reserveList.indexOf(lost[i] + 1));
                }
            }
            return answer;
        }
    }
}
