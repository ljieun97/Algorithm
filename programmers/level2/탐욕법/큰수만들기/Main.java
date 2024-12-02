package programmers.level2.탐욕법.큰수만들기;

import java.util.Stack;

class Solution {
  public String solution(String number, int k) {
    Stack<Character> s = new Stack<>();
    String answer = "";
    int length = number.length()-k;
    for (int i = 0; i < number.length(); i++) {
      while (!s.isEmpty() && k > 0 && s.peek() < number.charAt(i)) {
        s.pop();
        k--;
      }
      s.push(number.charAt(i));
    }
    for (int i = 0; i < length; i++) {
      answer += s.get(i);
    }
    return answer;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution("10", 1));
    System.out.println(s.solution("1231234", 3));
    System.out.println(s.solution("4177252841", 4));
  }
}
