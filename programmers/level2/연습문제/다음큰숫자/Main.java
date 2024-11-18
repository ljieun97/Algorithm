package programmers.level2.연습문제.다음큰숫자;

class Solution {
  public int countOne(int n) {
    String str = Integer.toBinaryString(n);
    int cnt = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i)=='1')
        cnt++;
    }
    return cnt;
  }

  public int solution(int n) {
    int cnt = countOne(n);
    while (true) {
      n++;
      if (cnt == countOne(n))
        break;
    }
    return n;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int n1 = 78;
    int n2 = 15;
    System.out.println(s.solution(n1));
    System.out.println(s.solution(n2));
  }
}
