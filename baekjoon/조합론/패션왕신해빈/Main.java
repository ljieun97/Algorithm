//5시 15분 - 6시 = 45분

package baekjoon.조합론.패션왕신해빈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int caseCnt = Integer.parseInt(br.readLine());
    while (true) {
      caseCnt--;
      int n = Integer.parseInt(br.readLine());
      String input[] = new String[n];
      for (int i = 0; i < n; i++) {
        input[i] = br.readLine();
      }
      solution(n, input);
      if (caseCnt == 0)
        return;
    }
  }

  public static void solution(int n, String[] input) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < n; i++) {
      String str[] = input[i].split(" ");
      String type = str[1];
      Integer cnt = map.get(type);
      if (cnt == null) {
        map.put(type, 1);
      } else {
        map.put(type, cnt + 1);
      }
    }

    int answer = 1;
    for (String key : map.keySet()) {
      answer *= map.get(key) + 1;
    }
    System.out.println(answer - 1);
  }
}
