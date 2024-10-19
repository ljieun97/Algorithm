//4시10분 -> 4시30분 = 20분

package baekjoon.조합론.이항계수1;

import java.io.*;

public class Main {
  public static int[][] dp = new int[11][11];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String arr[] = str.split(" ");
    int n = Integer.parseInt(arr[0]);
    int r = Integer.parseInt(arr[1]);
    System.out.println(combination(n, r));
  }

  public static int combination(int n, int r) {
    if (n == r || r == 0)
      return dp[n][r] = 1;

    if (dp[n][r] > 0)
      return dp[n][r];

    return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
  }
}
