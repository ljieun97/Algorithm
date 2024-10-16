//5시55분시작 - 6시40분완료 = 45분

package programmers.level2.월간코드.이진변환반복하기;

import java.util.Arrays;

class Solution {
  public String solution(String s) {
    int[] answer = new int[2];
    int change = 0;
    int del = 0;

    String str = s;

    while (true) {
      String[] arr = str.split("");
      int cnt = 0;
      for (int i = 0; i < arr.length; i++) {
        if (Integer.parseInt(arr[i]) == 0)
          cnt++;
      }
      str = Integer.toBinaryString(arr.length - cnt);
      change++;
      del += cnt;
      if(str.length()==1) break;
    }

    answer[0] = change;
    answer[1] = del;
    return Arrays.toString(answer);
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution("110010101001"));
    System.out.println(s.solution("01110"));
    System.out.println(s.solution("1111111"));
  }
}
