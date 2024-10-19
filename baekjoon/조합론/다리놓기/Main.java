//1010번
//4시40분 -> 7시50분 = 3시간

package baekjoon.조합론.다리놓기;

import java.io.*;

public class Main {
  public static int[][] dp = new int[30][30];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());
    for (int i = 0; i < cnt; i++) {
      String[] arr = br.readLine().split(" ");
      int n = Integer.parseInt(arr[1]);
      int r = Integer.parseInt(arr[0]);
      System.out.println(combination(n, r));
    }
  }

  public static int combination(int n, int r) {
    if (n == r || r == 0)
      return dp[n][r] = 1;

    if (dp[n][r] > 0)
      return dp[n][r];

    return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
  }
}
