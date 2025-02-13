package programmers.level2.카카오블라인드.괄호변환;

import java.util.Stack;

class Solution {
  public String solution(String p) {
    if (p.isEmpty())
      return "";
    int idx = getIndex(p);
    String u = p.substring(0, idx+1);
    String v = p.substring(idx+1);

    if (isVaild(u)) {
      return u + solution(v);
    } else {
      return "(" + solution(v) + ")" + changeStr(u);
    }
  }

  public int getIndex(String str) {
    int cnt = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '(')
        cnt++;
      else
        cnt--;
      if (cnt == 0)
        return i;
    }
    return 0;
  }

  public Boolean isVaild(String str) {
    Stack<Character> s = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '(')
        s.push('(');
      else {
        if (s.isEmpty())
          return false;
        else
          s.pop();
      }
    }
    return s.isEmpty();
  }

  public String changeStr(String str) {
    String newStr = "";
    for (int i = 1; i < str.length() - 1; i++) {
      if (str.charAt(i) == ')')
        newStr += "(";
      else
        newStr += ")";
    }
    return newStr;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution("(()())()"));
    System.out.println(s.solution(")("));
    System.out.println(s.solution("()))((()"));
    System.out.println(s.solution(")(()(())(()))("));
  }
}