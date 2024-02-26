package 프로그래머스.LEVEL2;

// https://school.programmers.co.kr/learn/courses/30/lessons/12939

public class P12939 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "-1 -2 -3 -4";

    String result = sol.solution(s);

    System.out.println(result); // "-4 -1"
  }
  static class Solution {
    public String solution(String s) {
      String answer = "";
      String[] strArr = s.split(" ");

      int min = Integer.parseInt(strArr[0]);
      int max = Integer.parseInt(strArr[0]);

      for(int i=1; i<strArr.length; i++){
        if(Integer.parseInt(strArr[i]) < min){
          min = Integer.parseInt(strArr[i]);
        }
        if(Integer.parseInt(strArr[i]) > max){
          max = Integer.parseInt(strArr[i]);
        }
      }

      answer = min + " " + max;
      return answer;
    }
  }
}