//7시20분 - 8시 = 40분

package baekjoon.조합론.파스칼삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String arr[] = str.split(" ");
    solution(arr);
  }

  public static void solution(String[] arr) {
    int answer = 0;
    int r = Integer.parseInt(arr[0]); // 3
    int c = Integer.parseInt(arr[1]); // 1
    int w = Integer.parseInt(arr[2]); // 4
    for (int i = r - 1; i < r + w - 1; i++) {
      for (int j = c - 1; j < i - (r - 2) + (c - 1); j++) {
        System.out.println(combination(i, j));
        answer += combination(i, j);
      }
    }
    System.out.println(answer);
  }

  public static int combination(int n, int r) {
    if (n == r || r == 0)
      return 1;
    return combination(n - 1, r - 1) + combination(n - 1, r);
  }
}
