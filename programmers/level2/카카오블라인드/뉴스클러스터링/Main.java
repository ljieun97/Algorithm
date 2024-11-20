package programmers.level2.카카오블라인드.뉴스클러스터링;

import java.util.ArrayList;

class Solution {
  public int solution(String str1, String str2) {
    str1 = str1.toUpperCase();
    str2 = str2.toUpperCase();

    ArrayList<String> a1 = new ArrayList<>();
    for (int i = 0; i < str1.length() - 1; i++) {
      if (!isUpper(str1.charAt(i)) || !isUpper(str1.charAt(i + 1)))
        continue;
      String str = str1.substring(i, i + 2);
      a1.add(str);
    }

    ArrayList<String> a2 = new ArrayList<>();
    for (int i = 0; i < str2.length() - 1; i++) {
      if (!isUpper(str2.charAt(i)) || !isUpper(str2.charAt(i + 1)))
        continue;
      String str = str2.substring(i, i + 2);
      a2.add(str);
    }

    ArrayList<String> minus = new ArrayList<>(a1);
    for (String s : a2)
      minus.remove(s);

    int and = a1.size() - minus.size();
    int sum = a2.size() + minus.size();

    int answer = 65536;
    if (sum == 0)
      return answer;
    return and * answer / sum;
  }

  public boolean isUpper(Character c) {
    if (65 <= c && c <= 90)
      return true;
    else
      return false;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution("FRANCE", "french"));
    System.out.println(s.solution("handshake", "shake hands"));
    System.out.println(s.solution("aa1+aa2", "AAAA12"));
    System.out.println(s.solution("E=M*C^2", "e=m*c^2"));
  }
}
