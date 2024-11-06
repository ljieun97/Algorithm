//5시40분 - 7시40분

package etc.블록;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Solution s = new Solution();
    // String[] wall = { "1 2 4", "1 1 2 3", "2 3 1 1", "1 1 2 3" };
    // int[][] points = { { 0, 1 }, { 1, 1 } };
    String[] wall = { "5", "2 1 2", "5" };
    int[][] points = { { 2, 0 }, { 0, 0 } };
    System.out.println(Arrays.toString(s.solution(wall, points)));
  }
}

class Solution {
  public static int count = 0;

  public static void next(int a, int b, int size, String[] wall) {
    if (a == wall.length - 1)
      return;

    // [0,2] 4 // [1,2] 5
    // 4 앞에 있는거 다 더하기
    String[] arr = wall[a].split(" ");
    int sum = 0;
    for (int i = 0; i < b; i++) {
      sum += Integer.parseInt(arr[i]);
    }

    // 3에서 0될때까지 빼기
    String[] arrr = wall[a + 1].split(" ");
    int j = 0;
    while (sum >= 0) {
      sum -= Integer.parseInt(arrr[j]);
      j++;
    }
    j--;
    int start = j;
    count -= j;

    // 4보다 클때까지 더하기
    sum = 0;
    while (sum < size) {
      sum += Integer.parseInt(arrr[j]);
      j++;
    }
    j--;
    // System.out.println(j); // 다음줄 b
    count += j;

    count++;

    // System.out.println(count);
    // 다음수는 다음줄의 sum
    next(a + 1, start, sum, wall);
  }

  public int[] solution(String[] wall, int[][] points) {
    // 다음줄 시작점: 2의 앞에 있는것 만큼 다음줄 첫번째꺼부터 빼고 시작
    // 다음줄 마침점: 시작점부터 더한게 2보다 큰순간까지
    int[] answer = new int[points.length];
    for (int i = 0; i < answer.length; i++) {
      count = 0;
      int a = points[i][0];
      int b = points[i][1];
      String[] arr = wall[a].split(" ");
      int size = Integer.parseInt(arr[b]);
      next(a, b, size, wall);
      answer[i] = count;
    }
    return answer;
  }
}