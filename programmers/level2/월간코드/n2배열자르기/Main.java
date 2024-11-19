package programmers.level2.월간코드.n2배열자르기;

import java.util.Arrays;

class Solution {
  public int[] solution(int n, long left, long right) {
    int length = (int) right - (int) left + 1;
    int[] arr = new int[length];
    int idx = 0;
    for (long i = left; i < right + 1; i++) {
      if (i / n <= i % n )
        arr[idx] = (int) (i % n + 1);
      else
        arr[idx] = (int) (i / n + 1);
      idx++;
    }
    return arr;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(Arrays.toString(s.solution(3, 2, 5)));
    System.out.println(Arrays.toString(s.solution(4, 7, 14)));
  }
}
