//다시풀기

package programmers.level2.탐욕법.큰수만들기;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution{
  public String solution(String number, int k) {
    String answer = "";
    boolean[] visited = new boolean[number.length()];
    back(number, visited, "", 0, number.length(), number.length()-k);
    return answer;
  }
  public void back(String number, boolean[] visited, String str, int start, int n, int r) {
    if(r==0) {
      System.out.println(str);
      return;
    }

    for(int i=start; i<n; i++) {
      if(!visited[i]) {
        visited[i]=true;
        back(number, visited, str+number.charAt(i), start+1, n, r-1);
        visited[i]=false;
      }
    }
  }
}
public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution("1924", 2));
    // System.out.println(s.solution("1231234", 3));
    // System.out.println(s.solution("4177252841", 4));
  }
}
