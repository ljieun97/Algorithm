package programmers.level2.연습문제.전력망둘로나누기;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int[][] arr;

  public int solution(int n, int[][] wires) {
    arr = new int[n + 1][n + 1];
    for (int i = 0; i < wires.length; i++) { // 인접노드를 0과1로 정의
      arr[wires[i][0]][wires[i][1]] = 1;
      arr[wires[i][1]][wires[i][0]] = 1;
    }

    int answer = n - 1;
    for (int i = 0; i < wires.length; i++) {
      int a = wires[i][0];
      int b = wires[i][1];
      arr[a][b] = 0;
      arr[b][a] = 0;
      answer = Math.min(answer, bfs(n, a));
      arr[a][b] = 1;
      arr[b][a] = 1;
    }
    return answer;
  }

  public int bfs(int n, int a) { // a의 인접노드 세고 a와나머지의차 리턴
    int visited[] = new int[n + 1];
    int cnt = 1;
    Queue<Integer> q = new LinkedList<>();
    q.offer(a);

    while (!q.isEmpty()) {
      int idx = q.poll();
      visited[idx] = 1;
      for (int i = 1; i <= n; i++) {
        if (visited[i] == 1)
          continue;
        if (arr[idx][i] == 1) {
          q.offer(i);
          cnt++;
        }
      }
    }

    return Math.abs(cnt - (n - cnt));
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[][] wires1 = { { 1, 3 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 4, 6 }, { 4, 7 }, { 7, 8 }, { 7, 9 } };
    int[][] wires2 = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
    int[][] wires3 = { { 1, 2 }, { 2, 7 }, { 3, 7 }, { 3, 4 }, { 4, 5 }, { 6, 7 } };
    System.out.println(s.solution(9, wires1));
    System.out.println(s.solution(4, wires2));
    System.out.println(s.solution(7, wires3));
  }
}
