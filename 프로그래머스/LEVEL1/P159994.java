package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/159994

public class P159994 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        String result = sol.solution(cards1,cards2,goal);
        System.out.println(result); // "No"
    }
    static class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            String answer = "";
            int indexCard1 = 0;
            int indexCard2 = 0;
            for(int i=0; i<goal.length; i++){
                if(indexCard1<cards1.length && goal[i].equals(cards1[indexCard1]) ){
                    indexCard1++;
                } else if(indexCard2 < cards2.length && goal[i].equals(cards2[indexCard2]) ){
                    indexCard2++;
                } else if(indexCard1>=cards1.length ||
                        indexCard2 >= cards2.length){
                    return "No";
                } else{
                    return "No";
                }
            }
            answer = "Yes";
            return answer;
        }
    }
}
