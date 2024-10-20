//3시 45분 - 4시 30분 = 45분
//조합+dp+오버플로우

package baekjoon.조합론.조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static BigInteger[][] dp = new BigInteger[101][101];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String arr[] = br.readLine().split(" ");
    int n = Integer.parseInt(arr[0]);
    int r = Integer.parseInt(arr[1]);
    System.out.println(combination(n, r));
  }

  public static BigInteger combination(int n, int r) {
    if (n == r || r == 0)
      return dp[n][r] = BigInteger.valueOf(1);
    if (dp[n][r] != null) {
      if (dp[n][r].compareTo(BigInteger.valueOf(0)) == 1)
        return dp[n][r];
    }
    return dp[n][r] = combination(n - 1, r - 1).add(combination(n - 1, r));
  }
}
