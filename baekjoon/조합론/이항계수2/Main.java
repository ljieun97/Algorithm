//3시 20분 - 3시 40분 = 20분
//조합+dp+모듈러연산

package baekjoon.조합론.이항계수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static int[][] dp = new int[1001][1001];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String arr[] = br.readLine().split(" ");
    int n = Integer.parseInt(arr[0]);
    int r = Integer.parseInt(arr[1]);
    System.out.println(combination(n, r));
  }

  public static int combination(int n, int r) {
    if (dp[n][r] > 0)
      return dp[n][r];
    if (n == r || r == 0)
      return dp[n][r] = 1;
    return dp[n][r] = (combination(n - 1, r - 1) + combination(n - 1, r)) % 10007;
  }
}
