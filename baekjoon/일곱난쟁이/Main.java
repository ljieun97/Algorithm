package baekjoon.일곱난쟁이;

import java.io.*;
import java.util.*;

public class Main {
  static int[] arr = new int[9];
  static int[] answer = new int[7];
  static int sum = 0;
  static boolean flag;

  public static void main(String[] args) throws IOException {
    // arr = new int[] { 20, 7, 23, 19, 10, 15, 25, 8, 13 };
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 9; i++) {
      arr[i] = Integer.parseInt(br.readLine().trim());
    }
    solution(0, 0);
  }

  public static void solution(int start, int cnt) {
    if (flag)
      return;
    if (sum > 100)
      return;

    if (cnt == 7) {
      if (sum == 100) {
        Arrays.sort(answer);
        // System.out.println(Arrays.toString(answer));
        for (int i = 0; i < answer.length; i++) {
          System.out.println(answer[i]);
        }
        flag = true;
      }
      return;
    }

    for (int i = start; i < 9; i++) {
      answer[cnt] = arr[i];
      sum += arr[i];
      solution(start + 1, cnt + 1);
      sum -= arr[i];
    }
  }
}
