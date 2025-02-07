package programmers.level2.카카오테크.두큐합같게만들기;

import java.util.*;

class Solution {
  public int solution(int[] queue1, int[] queue2) {
    int answer = 0;
    int sum = 0;
    List<Integer> list = new ArrayList<>();

    for (int i : queue1) {
      list.add(i);
      sum+=i;
    }
    for (int i : queue2) {
      list.add(i);
      sum+=i;
    }
    System.out.println(sum);

    return answer;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] q1 = { 3, 2, 7, 2 };
    int[] q2 = { 4, 6, 5, 1 };
    System.out.println(s.solution(q1, q2));
  }
}
