//우선순위 큐는 배열 항상 정렬
//큐에서 poll은 size 확인후 사용

package programmers.level2.힙.더맵게;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
  public int solution(int[] scoville, int K) {
    int answer = 0;
    Queue<Integer> q = new PriorityQueue<>();
    for (int i = 0; i < scoville.length; i++) {
      q.add(scoville[i]);
    }

    while (q.peek() < K) {
      if (q.size() < 2)
        break;
      int fir = q.poll();
      int sec = q.poll();
      if (q.size() == 0) {
        if (fir + sec * 2 < K)
          return -1;
      }
      q.add(fir + sec * 2);
      answer++;
    }
    return answer;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] arr1 = { 1, 2, 3, 9, 10, 12 };
    System.out.println(s.solution(arr1, 7));
  }
}
