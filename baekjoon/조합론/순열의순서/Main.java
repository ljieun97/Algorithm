//다시풀어보기

package baekjoon.조합론.순열의순서;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static boolean[] visited;
  public static int[] arr;
  public static int[] answer;
  public static int k = 0;
  public static int cnt = 0;
  public static boolean flag;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String str = br.readLine();
    solution(n, str);
  }

  public static void solution(int n, String str) {
    visited = new boolean[n];
    answer = new int[n];
    String input[] = str.split(" ");
    if (Integer.parseInt(input[0]) == 1) {
      k = Integer.parseInt(input[1]);
    } else {
      arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(input[i + 1]);
      }
    }
    permutation(n, 0);
  }

  public static void permutation(int n, int idx) {
    if (flag) {
      return;
    }
    if (idx == n) {
      cnt++;
      
      if (cnt == k) {
        // System.out.println(Arrays.toString(answer));
        for (int i = 0; i < n; i++) {
          System.out.print(answer[i] + " ");
        }
        System.out.println();
        flag = true;
      }

      if (Arrays.equals(answer, arr)) {
        System.out.println(cnt);
        flag = true;
      }

      return;
    }

    for (int i = 0; i < n; i++) {
      if (visited[i])
        continue;
      visited[i] = true;
      answer[idx] = i + 1;
      permutation(n, idx + 1);
      visited[i] = false;
    }
  }
}


