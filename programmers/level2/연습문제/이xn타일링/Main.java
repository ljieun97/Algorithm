//조합말고 dp로간단히풀수있음^^ -> 2시간풀어보고 정답봄

package programmers.level2.연습문제.이xn타일링;

class Solution {
  public int solution(int n) {
    int dp[] = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= n; i++) {
      dp[i] = (dp[i - 2] + dp[i - 1]) % 1000000007;
    }
    return dp[n];
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution(4));
    System.out.println(s.solution(7));
  }
}
