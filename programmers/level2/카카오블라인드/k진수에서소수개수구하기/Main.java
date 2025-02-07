//3시20분 - 4시

package programmers.level2.카카오블라인드.k진수에서소수개수구하기;

class Solution {
  public int solution(int n, int k) {
    int answer = 0;
    String str = Integer.toString(n, k);
    String[] arr = str.split("0");
    for (int i = 0; i < arr.length; i++) {
      if (!arr[i].isBlank()) {
        if (sosu(Long.parseLong(arr[i])))
          answer++;
      }
    }
    return answer;
  }

  public boolean sosu(long n) {
    if (n == 1)
      return false;
    for (int j = 2; j <= (int)Math.sqrt(n); j++) {
      if (n % j == 0)
        return false;
    }
    return true;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution(437674, 3));
    System.out.println(s.solution(110011, 10));
  }
}
