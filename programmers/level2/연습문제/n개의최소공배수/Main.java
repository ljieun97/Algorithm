//3시30분 - 5시
//유클리드 호제법 최대공약수: gcd(a, b) = gcd(b, r)
//최소공배수: axb/최대공약수

package programmers.level2.연습문제.n개의최소공배수;

class Solution {
  public int solution(int[] arr) {
    int gcd = arr[0];
    int lcm = arr[0];
    for (int i = 1; i < arr.length; i++) {
      gcd = getGcd(lcm, arr[i]);
      lcm = lcm * arr[i] / gcd;
    }
    return lcm ;
  }

  public int getGcd(int a, int b) {
    if (a < b) {
      int tmp = a;
      a = b;
      b = tmp;
    }

    if (b == 0) {
      return a;
    }

    int r = a % b;
    return getGcd(b, r);
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] arr1 = { 2, 6, 8, 14 };
    int[] arr2 = { 1, 2, 3 };
    System.out.println(s.solution(arr1));
    System.out.println(s.solution(arr2));
  }
}
