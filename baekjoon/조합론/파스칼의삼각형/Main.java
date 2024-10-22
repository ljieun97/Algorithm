//6시20분 - 6시25분 = 5분

package baekjoon.조합론.파스칼의삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str[] = br.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int k = Integer.parseInt(str[1]);
    System.out.println(solution(n-1, k-1));
  }

  public static int solution(int n, int k) {
    if (n == k || k == 0)
      return 1;
    return solution(n - 1, k - 1) + solution(n - 1, k);
  }
}