//6시50분 - 7시10분 = 20분
//조합론 정답확률 60퍼이상 푸는중

package baekjoon.조합론.차량번호판1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String arr[] = str.split("");
    solution(arr);
  }

  public static void solution(String[] arr) {
    int answer = 1;
    int n = 1;
    String pre = "";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals("c")) {
        n = 26;
      } else {
        n = 10;
      }
      if (pre.equals(arr[i]))
        n -= 1;
      pre = arr[i];
      answer *= n;
    }
    System.out.println(answer);
  }
}
