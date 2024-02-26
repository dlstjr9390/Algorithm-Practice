package 프로그래머스.LEVEL2;

import 프로그래머스.LEVEL2.P12939.Solution;

public class P12951 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "3people unFollowed me";

    String result = sol.solution(s);
    System.out.println(result);
  }

  static class Solution {
    public String solution(String s) {
      String answer = "";
      String[] strArr = s.split(" ");

      for(int i=0; i<strArr.length; i++){
        char firstChar = strArr[i].charAt(0);
        if(firstChar >= 97 && firstChar <=122){
          answer += (char)(firstChar-32)+"";
        } else{
          answer += firstChar;
        }
        answer += strArr[i].substring(1) + " ";
      }
      return answer;
    }
  }
}
