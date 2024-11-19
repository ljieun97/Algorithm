package programmers.level2.스택큐.프로세스;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
  public int solution(int[] priorities, int location) {
    Map<Integer, Integer> m = new HashMap<Integer, Integer>();
    Queue<Integer> q = new LinkedList<>();
    Queue<int[]> index = new LinkedList<>();

    for (int i = 0; i < priorities.length; i++) {
      int[] ttt = { priorities[i], i };
      index.add(ttt);
      q.add(priorities[i]);
    }
    int i = 0;
    while (!q.isEmpty()) {
      int n = q.peek();
      int max = Collections.max(q);
      int[] at = index.peek();
      if (n < max) {
        q.add(n);
        index.add(at);
      } else {
        int[] put = {at[1], i+1};
        m.put(put[0], put[1]);
        i++;
      }
      q.poll();
      index.poll();
    }
    System.out.println(m);
    return m.get(location);
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] arr1 = { 2, 1, 3, 2 };
    int[] arr2 = { 1, 1, 9, 1, 1, 1 };
    System.out.println(s.solution(arr1, 2));
    System.out.println(s.solution(arr2, 0));
  }
}
