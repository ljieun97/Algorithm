package programmers.level2.연습문제.뒤에있는큰수찾기;

import java.util.Arrays;
import java.util.Stack;

class Solution {
  public int[] solution(int[] numbers) {
    int length = numbers.length;
    int[] answer = new int[length];
    Stack<Integer> s = new Stack<>();

    for (int i = length - 1; i >= 0; i--) {
      while (!s.empty()) {
        if (numbers[i] < s.peek()) {
          answer[i] = s.peek();
          break;
        } else {
          s.pop();
        }
      }
      if (s.empty())
        answer[i] = -1;
      s.push(numbers[i]);
    }
    return answer;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] arr1 = { 2, 3, 3, 5 };
    int[] arr2 = { 9, 1, 5, 3, 6, 2 };
    System.out.println(Arrays.toString(s.solution(arr1)));
    System.out.println(Arrays.toString(s.solution(arr2)));
  }
}
