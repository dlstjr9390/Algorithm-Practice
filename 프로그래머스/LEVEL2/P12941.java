package 프로그래머스.LEVEL2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12941

import java.util.Arrays;

public class P12941 {
  public static void main(String[] args) {

    Solution sol = new Solution();
    int[] arrA = {1, 4, 2};
    int[] arrB = {5, 4, 4};

    int result = sol.solution(arrA, arrB);

    System.out.println(result); // 29
  }

  static class Solution {
    public int solution(int[] A, int[] B)
    {
      int answer = 0;
      Arrays.sort(A);
      Arrays.sort(B);
      for(int i =0; i<A.length; i++){
        answer += A[i] * B[(B.length-1)-i];
      }
      return answer;
    }
  }
}
