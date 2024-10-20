//2시10분

package baekjoon.조합론.다음순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static int[] input;
  public static int n;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    String str[] = br.readLine().split(" ");
    input = new int[n];
    for (int i = 0; i < n; i++) {
      input[i] = Integer.parseInt(str[i]);
    }
    permutation();
  }

  public static void permutation() {
    int idx = n - 1;
    while (idx > 0 && input[idx - 1] > input[idx]) {
      idx--;
    }

    if (idx == 0) {
      System.out.println("-1");
      return;
    }

    int bigIdx = n - 1;
    while (bigIdx > idx && input[idx - 1] > input[bigIdx]) {
      bigIdx--;
    }

    int temp = input[idx - 1];
    input[idx - 1] = input[bigIdx];
    input[bigIdx] = temp;

    Arrays.sort(input, idx, n);

    for(int i=0; i<n; i++) {
      System.out.print(input[i]+" ");
    }
    System.out.println();
  }
}
