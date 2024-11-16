//6시 반 - 8시
//dp

package programmers.level2.연습문제.멀리뛰기;

class Solution {
  public long solution(int n) {
    long[] answer = new long[n + 1];
    answer[0] = 1;
    answer[1] = 2;

    for (int i = 2; i < n; i++) {
      answer[i] = (answer[i - 2] + answer[i - 1]) % 1234567;
    }
    return answer[n - 1];
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution(4));
    System.out.println(s.solution(3));
  }
}
