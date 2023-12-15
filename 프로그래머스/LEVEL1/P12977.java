package 프로그래머스.LEVEL1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12977

public class P12977 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,6,7,4};

        int result = sol.solution(nums);
        System.out.println(result); // 4
    }


    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            int count = 0;
            for(int i=0; i<nums.length-2; i++){
                for(int j=i+1; j<nums.length-1; j++){
                    for(int k=j+1; k<nums.length; k++){
                        int sum = nums[i] + nums[j] + nums[k];
                        for(int l=1; l<=sum; l++){
                            if(sum % l == 0){
                                count++;
                            }
                        }
                        if(count == 2 ){
                            answer++;
                        }
                        count = 0;
                    }
                }
            }

            return answer;
        }
    }
}
