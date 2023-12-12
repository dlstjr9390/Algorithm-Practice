package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12901

public class P12901 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 5;
        int b = 24;

        String result = sol.solution(a,b);
        System.out.println(result); // "TUE"
    }

    static class Solution {
        public String solution(int a, int b) {
            String answer = "";
            String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

            switch (a){

                case 2,8:
                    answer = dayOfWeek[b%7];
                    break;

                case 3,11:
                    answer = dayOfWeek[(b+1)%7];
                    break;

                case 6:
                    answer = dayOfWeek[(b+2)%7];
                    break;

                case 9,12:
                    answer = dayOfWeek[(b+3)%7];
                    break;

                case 1, 4, 7:
                    answer = dayOfWeek[(b+4)%7];
                    break;

                case 10:
                    answer = dayOfWeek[(b+5)%7];
                    break;

                case 5:
                    answer = dayOfWeek[(b+6)%7];
                    break;

            }
            return answer;
        }
    }
}
