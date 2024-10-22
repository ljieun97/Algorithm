//5시 45분 - 7시 10분 = 1시간25분

package baekjoon.조합론.이전순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    // n = 3;
    // input = new int[] { 3, 1, 2 };
    permutation();
  }

  public static void permutation() {
    int i = n - 1;
    while (i > 0 && input[i - 1] < input[i]) {
      i--;
    }

    if (i == 0) {
      System.out.println("-1");
      return;
    }

    int j = n - 1;
    while (input[i - 1] < input[j]) {
      j--;
    }

    swap(i - 1, j);
    j = n - 1;
    while (i < j) {
      swap(i, j);
      i++;
      j--;
    }

    for (int k = 0; k < n; k++) {
      System.out.print(input[k] + " ");
    }
    System.out.println();
  }

  public static void swap(int i, int j) {
    int temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }
}
