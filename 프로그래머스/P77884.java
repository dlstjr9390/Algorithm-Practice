package 프로그래머스;

// https://school.programmers.co.kr/learn/courses/30/lessons/77884

import java.util.ArrayList;
import java.util.List;

public class P77884 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 13;
        int b = 17;
        int result = sol.solution(a,b);

        System.out.println(result); // 43
    }
    static class Solution {
        public int solution(int left, int right) {
            int answer = 0;
            List<Integer> divList = new ArrayList<>();
            for(int i=left; i<=right; i++){
                for(int j=1; j<=i; j++){
                    if(i % j == 0){
                        divList.add(j);
                    }
                }
                if(divList.size() % 2 ==0){
                    answer += i;
                } else{
                    answer -= i;
                }
                divList.clear();
            }
            return answer;
        }
    }
}
