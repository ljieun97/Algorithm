//다시풀기
package programmers.level2.써머윈터.방문길이;

import java.util.ArrayList;

class Solution {
  public int solution(String dirs) {
    // [0,0] [0,1] 전후가 같은거
    int answer = 0;
    int[] arr = { 0, 0 };
    ArrayList<String> list = new ArrayList<String>();
    list.add("00");
    for (int i = 0; i < dirs.length(); i++) {
      Character c = dirs.charAt(i);
      switch (c) {
        case 'U':
          arr[1]++;
          break;
        case 'D':
          arr[1]--;
          break;
        case 'L':
          arr[0]--;
          break;
        default:
          arr[0]++;
          break;
      }
      list.add(arr[0]+""+arr[1]);

      //비교후 초기화
      if(!list.get(0).equals(list.get(1))) answer++;
      list.remove(0);
    }
    return answer;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution("ULURRDLLU"));
    System.out.println(s.solution("LULLLLLLU"));
  }
}
