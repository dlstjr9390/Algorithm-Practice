package 프로그래머스;

public class P12922 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        String result = sol.solution(n);

        System.out.println(result); // "수박수"
    }
    static class Solution {
        public String solution(int n) {
            String answer = "";
            for(int i=0; i<n; i++){
                if(i%2 ==0){
                    answer += "수";
                } else{
                    answer += "박";
                }
            }
            return answer;
        }
    }
}
