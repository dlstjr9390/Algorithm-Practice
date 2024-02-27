package 프로그래머스.LEVEL2;

// https://school.programmers.co.kr/learn/courses/30/lessons/12951

public class P12951 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "  for the what 1what  ";

    String result = sol.solution(s);

    System.out.println(result); //"  For The What 1what  "
  }

  static class Solution {
    public String solution(String s) {
      String answer = "";
      String[] strArr = s.split(" ",-1);

      for(int i=0; i<strArr.length; i++){
        if(!strArr[i].isEmpty()){
          char firstChar = strArr[i].charAt(0);

          if(firstChar >= 97 && firstChar <=122){
            answer += (char)(firstChar-32)+"";
          } else{
            answer += firstChar;
          }
          if(i != strArr.length-1){
            answer += strArr[i].toLowerCase().substring(1) + " ";
          } else{
            answer += strArr[i].toLowerCase().substring(1);
          }
        } else if(strArr[i].isEmpty() && i != strArr.length-1){
          answer += " ";
        }


      }
      return answer;
    }
  }
}
