package programmers.level2.써머윈터.점프와순간이동;

class Solution {
  public int solution(int n) {
    // 2500 1250 625
    // 624 312 156 78 39
    // 38 19
    // 18 9
    // 8 4 2 1
    int cnt = 1;
    while (n > 1) {
      if (n % 2 == 0) {
        n /= 2;
      } else {
        n -= 1;
        cnt++;
      }
    }
    return cnt;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int n1 = 5;
    int n2 = 6;
    int n3 = 5000;
    System.out.println(s.solution(n1));
    System.out.println(s.solution(n2));
    System.out.println(s.solution(n3));
  }
}
