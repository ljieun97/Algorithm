package programmers.level2.완전탐색.소수찾기;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public Set<Integer> set;
  public boolean[] visited;

  public int solution(String numbers) {
    int length = numbers.length();
    visited = new boolean[length];
    set = new HashSet<Integer>();
    back(numbers, "", length, 0);
    return set.size();
  }

  public void back(String numbers, String str, int n, int r) {
    if (n == r) {
      return;
    }
    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        visited[i] = true;

        if (isSosu(Integer.parseInt(str + numbers.charAt(i))))
          set.add(Integer.parseInt(str + numbers.charAt(i)));
        back(numbers, str + numbers.charAt(i), n, r + 1);
        visited[i] = false;
      }
    }
  }

  public boolean isSosu(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution("17"));
    System.out.println(s.solution("011"));
  }
}