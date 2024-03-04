package 프로그래머스.LEVEL2;

// https://school.programmers.co.kr/learn/courses/30/lessons/12909


public class P12909 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "())(()";

    boolean result = sol.solution(s);

    System.out.println(result); // false
  }

  static class Solution {

    boolean solution(String s) {

      int num = 0;

      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
          num++;
        } else {
          num--;
        }
        if(num < 0){
          return false;
        }
      }

      return num == 0;
    }
  }
}
