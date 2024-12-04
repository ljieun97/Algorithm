package programmers.level2.연습문제.땅따먹기;

import java.util.Arrays;

class Solution{
  public int solution(int[][] land) {
    for(int i=0; i<land.length-1; i++) {
      land[i+1][0] += Math.max(Math.max(land[i][1], land[i][2]), land[i][3]);
      land[i+1][1] += Math.max(Math.max(land[i][0], land[i][2]), land[i][3]);
      land[i+1][2] += Math.max(Math.max(land[i][1], land[i][0]), land[i][3]);
      land[i+1][3] += Math.max(Math.max(land[i][1], land[i][2]), land[i][0]);
    }
    return Arrays.stream(land[land.length-1]).max().getAsInt();
  }
}
public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[][] arr = {{1,2,3,5}, {5,6,7,8}, {4,3,2,1}};
    System.out.println(s.solution(arr));
  }
}
