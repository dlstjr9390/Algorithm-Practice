package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/136798

public class P136798 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int number = 10;
        int limit = 3;
        int power = 2;

        int result = sol.solution(number,limit,power);
        System.out.println(result); // 21
    }

    static class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 0;
            int factor = 0;
            for(int i=1; i<=number; i++){
                for(int j=1; j*j<=i; j++){
                    if(j*j == i){
                        factor++;
                    }else if(i % j == 0){
                        factor += 2;
                    }
                }
                if(factor > limit){
                    answer+= power;
                }else{
                    answer+= factor;
                }
                factor = 0;
            }

            return answer;
        }
    }
}
