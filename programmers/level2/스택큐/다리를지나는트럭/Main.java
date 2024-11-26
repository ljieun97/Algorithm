package programmers.level2.스택큐.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;
    int sum = 0;
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < truck_weights.length; i++) {
      while (true) {
        if (q.isEmpty()) {
          sum += truck_weights[i];
          q.add(truck_weights[i]);
          answer++;
          break;
        }
        if (q.size() == bridge_length) {
          sum -= q.poll();
        } 
        if (sum + truck_weights[i] <= weight) {
          sum += truck_weights[i];
          q.add(truck_weights[i]);
          answer++;
          break;
        } 
        q.add(0);
        answer++;
      }
    }
    return answer + bridge_length;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] arr1 = { 7, 4, 5, 6 };
    int[] arr2 = { 10 };
    int[] arr3 = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    System.out.println(s.solution(2, 10, arr1));
    System.out.println(s.solution(100, 100, arr2));
    System.out.println(s.solution(100, 100, arr3));
  }
}
