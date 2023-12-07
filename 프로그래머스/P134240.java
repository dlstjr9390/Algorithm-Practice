package 프로그래머스;

// https://school.programmers.co.kr/learn/courses/30/lessons/134240

public class P134240 {

    public static void main(String[] args) {

        int[] food = {1, 3, 4, 6};

        Solution sol = new Solution();
        String result = sol.solution(food);

        System.out.println(result); // "1223330333221"

    }
    static class Solution {
        public String solution(int[] food) {
            String answer = "";
            StringBuilder prefix = new StringBuilder();
            StringBuilder postfix = new StringBuilder();
            for(int i=1; i<food.length; i++){
                if(food[i] >=2){
                    int divFood = food[i]/2;
                    while(divFood > 0){
                        prefix.append(i);
                        postfix.insert(0,i);
                        divFood--;
                    }
                }
            }
            answer = prefix + "0" + postfix;
            return answer;
        }
    }
}
