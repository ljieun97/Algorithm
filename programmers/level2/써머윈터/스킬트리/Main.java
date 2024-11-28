package programmers.level2.써머윈터.스킬트리;

class Solution {
  public int solution(String skill, String[] skill_trees) {
    int answer = 0;
    for (int i = 0; i < skill_trees.length; i++) {
      if (skill.indexOf(skill_trees[i].replaceAll(String.format("[^%s]", skill), "")) == 0)
        answer++;
    }
    return answer;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    String[] arr1 = { "BACDE", "CBADF", "AECB", "BDA" };
    System.out.println(s.solution("CBD", arr1));
  }
}
