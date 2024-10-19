//4시 40분 -> 5시 40분 = 1시간

package baekjoon.조합론.암호만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static String[] answer = {};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String num = br.readLine();
    String str = br.readLine();
    String narr[] = num.split(" ");
    String arr[] = str.split(" ");
    int n = Integer.parseInt(narr[1]);
    int r = Integer.parseInt(narr[0]);
    answer = new String[r];
    Arrays.sort(arr);
    combination(arr, 0, n, r, 0);
  }

  public static void combination(String[] arr, int start, int n, int r, int num) {
    if (num == r) {
      String str = "";
      int cnt1 = 0;
      int cnt2 = 0;
      for (int i = 0; i < answer.length; i++) {
        if (answer[i].equals("a") || answer[i].equals("e") || answer[i].equals("i") || answer[i].equals("o")
            || answer[i].equals("u"))
          cnt1++;
        else
          cnt2++;
        str += answer[i];
      }
      if (cnt1 != 0 && cnt2 > 1)
        System.out.println(str);
      return;
    }
    for (int i = start; i < n; i++) {
      answer[num] = arr[i];
      combination(arr, i + 1, n, r, num + 1);
    }
  }
}
