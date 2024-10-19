//6603번
//6시 10분 -> 8시 20분 = 2시간 10분
//조합+백트래킹

package baekjoon.조합론.로또;

import java.io.*;

public class Main {
  public static int n;
  public static String[] input = {};
  public static String[] answer = new String[6];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String str = "";
      if ((str = br.readLine()).equals("0"))
        break;
      String arr[] = str.split(" ");
      n = Integer.parseInt(arr[0]);
      input = new String[n];
      for (int i = 0; i < n; i++) {
        input[i] = arr[i + 1];
      }
      combination(0, 0);
      System.out.println();
    }
  }

  public static void combination(int start, int cnt) {
    if (cnt == 6) {
      for (int i = 0; i < 6; i++) {
        System.out.print(answer[i] + " ");
      }
      System.out.println();
      return;
    }
    for (int i = start; i < n; i++) {
      answer[cnt] = input[i];
      combination(i + 1, cnt + 1);
    }
  }
}
