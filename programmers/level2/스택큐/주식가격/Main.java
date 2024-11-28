package programmers.level2.스택큐.주식가격;

import java.util.Arrays;

class Solution {
  public int[] solution(int[] prices) {
    int[] answer = new int[prices.length];
    for (int i = 0; i < prices.length - 1; i++) {
      int cnt = 0;
      for (int j = i + 1; j < prices.length; j++) {
        cnt++;
        if (prices[i] > prices[j])
          break;
      }
      answer[i] = cnt;
    }
    return answer;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] arr1 = { 1, 2, 3, 2, 3 };
    System.out.println(Arrays.toString(s.solution(arr1)));
  }
}
