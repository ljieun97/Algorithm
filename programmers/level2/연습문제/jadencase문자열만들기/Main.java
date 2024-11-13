package programmers.level2.연습문제.jadencase문자열만들기;

class Solution {

  public String solution(String s) {
    String answer = "";
    int tmp = (int) s.charAt(0);
    if (97 <= tmp && tmp <= 122) // 소문자면
      answer += (char) (tmp - 32); // 대문자
    else
      answer += (char) tmp;

    boolean next = false;
    for (int i = 1; i < s.length(); i++) {
      tmp = (int) s.charAt(i);

      if (s.charAt(i) == ' ') {
        next = true;
        answer += (char) tmp;
        continue;
      } 
     
      if (next) {
        if (97 <= tmp && tmp <= 122) // 소문자면
          answer += (char) (tmp - 32); // 대문자
        else
          answer += (char) tmp;
        next = false;
      } else {
        if (65 <= tmp && tmp <= 90) // 대문자면
          answer += (char) (tmp + 32); // 소문자
        else
          answer += (char) tmp;
      }
    }
    return answer;
  }

}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution("3people unFollowed me"));
    System.out.println(s.solution("for the last week"));
  }
}
