package baekjoon.dfs.숫자판점프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
  static HashSet<String> s = new HashSet<>();
  static int dx[] = { 0, 0, 1, -1 };
  static int dy[] = { 1, -1, 0, 0 };
  static String[][] arr = new String[5][5];
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 5; i++) {
      arr[i] = br.readLine().split(" ");
    }
    solution(arr);
  }

  public static void solution(String[][] arr) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        dfs(i, j, arr[i][j], 5);
      }
    }
    System.out.println(s.size());
  }

  public static void dfs(int x, int y, String str, int cnt) {
    if (cnt == 0) {
      s.add(str);
      return;
    }

    for (int i = 0; i < 4; i++) {
      int nowX = x + dx[i];
      int nowY = y + dy[i];
      if (0 <= nowX && nowX < 5 && 0 <= nowY && nowY < 5) {
        dfs(nowX, nowY, str + arr[nowX][nowY], cnt - 1);
      }
    }
  }
}
