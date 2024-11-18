package programmers.level2.연습문제.귤고르기;

import java.util.*;

class Solution {
  public int solution(int k, int[] tangerine) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < tangerine.length; i++) {
      if (map.containsKey(tangerine[i]))
        map.put(tangerine[i], map.get(tangerine[i]) + 1);
      else
        map.put(tangerine[i], 1);
    }

    Collection<Integer> values = map.values();
    Object[] arr = values.toArray();
    Arrays.sort(arr);
    int i = arr.length - 1;
    int cnt = 0;
    while (k > 0) {
      k -= (Integer)arr[i];
      i--;
      cnt++;
    }
    return cnt;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] arr1 = { 1, 3, 2, 5, 4, 5, 2, 3 };
    int[] arr2 = { 1, 3, 2, 5, 4, 5, 2, 3 };
    int[] arr3 = { 1, 1, 1, 1, 2, 2, 2, 3 };
    System.out.println(s.solution(6, arr1));
    System.out.println(s.solution(4, arr2));
    System.out.println(s.solution(2, arr3));
  }
}
