package programmers.level2.써머윈터.영어끝말잇기;

import java.util.Arrays;

class Solution {
  public int[] solution(String[] words, int n) {
    int[] answer = new int[2];

    for (int i = 1; i < words.length; i++) {
      if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
        answer[0] = i % n + 1;
        answer[1] = i / n + 1;
        return answer;
      }
      for (int j = 0; j < i; j++) {
        if (words[i].equals(words[j])) {
          answer[0] = i % n + 1;
          answer[1] = i / n + 1;
          return answer;
        }
      }
    }
    return answer;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    String arr1[] = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
    String arr2[] = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish",
        "hang", "gather", "refer", "reference", "estimate", "executive" };
    String arr3[] = { "hello", "one", "even", "never", "now", "world", "draw" };
    System.out.println(Arrays.toString(s.solution(arr1, 3)));
    System.out.println(Arrays.toString(s.solution(arr2, 5)));
    System.out.println(Arrays.toString(s.solution(arr3, 2)));
  }
}
