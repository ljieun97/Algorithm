package programmers.level2.월간코드.괄호회전하기;

import java.util.Stack;

class Solution {
  public Character couple(Character c) {
    if (c == '{')
      return '}';
    else if (c == '(')
      return ')';
    else
      return ']';
  }

  public int solution(String s) {
    if (s.length() % 2 != 0)
      return 0;
    int cnt = 0;
    Stack<Character> stack = new Stack<>();

    for (int j = 0; j < s.length(); j++) {
      stack.push(s.charAt(0));
      for (int i = 1; i < s.length(); i++) {
        if (stack.empty())
          stack.push(s.charAt(i));
        else {
          if (couple(stack.peek()).equals(s.charAt(i)))
            stack.pop();
          else
            stack.push(s.charAt(i));
        }
      }
      if (stack.empty())
        cnt++;
      stack.clear();
      s = s.substring(1, s.length()) + s.charAt(0);
    }
    return cnt;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    String s1 = "[](){}";
    String s2 = "}]()[{";
    String s3 = "[)(]";
    String s4 = "}}}";
    System.out.println(s.solution(s1));
    System.out.println(s.solution(s2));
    System.out.println(s.solution(s3));
    System.out.println(s.solution(s4));
  }
}
