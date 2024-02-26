package 프로그래머스.LEVEL1;

import java.util.Arrays;

public class P161990 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] wallpaper = {".#...", "..#..", "...#."};

        int[] result = sol.solution(wallpaper);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] solution(String[] wallpaper) {
            int[] answer = {-1,-1,-1,-1};
            int rdx = 0;
            int rdy = 0;
            for(int i=0; i<wallpaper.length; i++){
                if(wallpaper[i].contains("#") && answer[0] == -1){
                    answer[0] = i;
                    for(int j=0; j<wallpaper[i].length(); j++){
                        if(wallpaper[i].charAt(j) == '#'){

                        }
                    }
                }
            }
            return answer;
        }
    }
}
