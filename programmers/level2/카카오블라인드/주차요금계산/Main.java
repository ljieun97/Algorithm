package programmers.level2.카카오블라인드.주차요금계산;

import java.util.*;

class Solution {
  public int[] solution(int[] fees, String[] records) {
    int lastTime = getTime("23:59");
    Map<String, String> map = new HashMap<>();
    Map<String, Integer> time = new HashMap<>();
    for (int i = 0; i < records.length; i++) {
      String[] arr = records[i].split(" ");
      String key = arr[1];
      String value = arr[0];
      if (map.containsKey(key)) {
        if (time.containsKey(key))
          time.replace(key, time.get(key) + getTime(value) - getTime(map.get(key)));
        else
          time.put(key, getTime(value) - getTime(map.get(key)));
        map.remove(key);
      } else
        map.put(key, value);
    }

    // 노 출차
    for (String key : map.keySet()) {
      if (time.containsKey(key)) {
        time.replace(key, time.get(key) + lastTime - getTime(map.get(key)));
      } else
        time.put(key, lastTime - getTime(map.get(key)));
    }

    List<String> keySet = new ArrayList<>(time.keySet());
    Collections.sort(keySet);

    // 돈계산
    int[] answer = new int[keySet.size()];
    int i = 0;
    for (String key : keySet) {
      if (time.get(key) <= fees[0])
        answer[i++] = fees[1];
      else {
        int over = time.get(key) - fees[0];
        if (over % fees[2] > 0)
          answer[i++] = fees[1] + (over / fees[2] +1) * fees[3];
        else
          answer[i++] = fees[1] + over / fees[2] * fees[3];
      }
    }

    return answer;
  }

  public int getTime(String str) {
    String[] arr = str.split(":");
    return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] int1 = { 180, 5000, 10, 600 };
    String[] str1 = { "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
        "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT" };
    int[] int2 = { 120, 0, 60, 591 };
    String[] str2 = { "16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN" };
    int[] int3 = { 1, 461, 1, 10 };
    String[] str3 = { "00:00 1234 IN" };
    System.out.println(Arrays.toString(s.solution(int1, str1)));
    System.out.println(Arrays.toString(s.solution(int2, str2)));
    System.out.println(Arrays.toString(s.solution(int3, str3)));
  }
}
