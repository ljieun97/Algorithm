package programmers.level2.카카오블라인드.메뉴리뉴얼;

import java.util.*;

class Solution {
  static HashMap<String, Integer> m;
  static int maxCnt;

  public String[] solution(String[] orders, int[] course) {
    ArrayList<String> list = new ArrayList<>();

    for (int j = 0; j < course.length; j++) {
      m = new HashMap<>();
      maxCnt = 0;
      for (int i = 0; i < orders.length; i++) {
        char a[] = orders[i].toCharArray();
        Arrays.sort(a);
        String order = String.copyValueOf(a);
        combi(order, course[j], 0, "");
      }
      m.forEach((key, value) -> {
        if (value == maxCnt)
          list.add(key);
      });
    }

    String[] arr = list.toArray(new String[0]);
    Arrays.sort(arr);

    return arr;
  }

  void combi(String n, int r, int start, String str) {
    if (r == 0) {
      if (m.containsKey(str)) {
        maxCnt = Math.max(maxCnt, m.get(str) + 1);
        m.put(str, m.get(str) + 1);
      } else
        m.put(str, 1);
      return;
    }
    for (int i = start; i < n.length(); i++) {
      combi(n, r - 1, i + 1, str + n.charAt(i));
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    String[] orders1 = { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH" };
    int[] course1 = { 2, 3, 4 };
    String[] orders2 = { "ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD" };
    int[] course2 = { 2, 3, 5 };
    String[] orders3 = { "XYZ", "XWY", "WXA" };
    int[] course3 = { 2, 3, 4 };
    System.out.println(Arrays.toString(s.solution(orders1, course1)));
    System.out.println(Arrays.toString(s.solution(orders2, course2)));
    System.out.println(Arrays.toString(s.solution(orders3, course3)));
  }
}