package baekjoon.조합론.다각형의대각선;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    solution(n);
  }

  public static void solution(int n) {
    int answer;
    if (n == 3)
      answer = 0;
    else
      answer = combination(n, 4);
    System.out.println(answer);
  }

  public static int combination(int n, int r) {
    if (n == r || r == 0)
      return 1;
    return combination(n - 1, r - 1) + combination(n - 1, r);
  }
}
