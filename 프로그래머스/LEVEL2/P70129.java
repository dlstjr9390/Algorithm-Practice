package 프로그래머스.LEVEL2;

import java.util.Arrays;

public class P70129 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "110010101001";

    int[] result = sol.solution(s);

    System.out.println(Arrays.toString(result));
  }
  static class Solution {
    public int[] solution(String s) {
      StringBuilder str = new StringBuilder();
      if(str.toString().contains("0")){
        for(int i=0; i<s.length(); i++){
          if(s.charAt(i) == '1'){
            str.append("1");
          }
        }
        int intStr = Integer.parseInt(str.toString(),2);
        str = new StringBuilder(Integer.toBinaryString(intStr));
      }
      int[] answer = new int[str.length()];
      for(int i =0; i< str.length(); i++){
        answer[i] = Character.getNumericValue(str.charAt(i));
      }
      return answer;
    }
  }
}
