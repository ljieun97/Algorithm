package programmers.level2.연습문제.할인행사;

import java.util.*;

class Solution {
  public int solution(String[] want, int[] number, String[] discount) {
    int length = number.length;
    int start = 0;
    int answer = 0;
    Map<String, Integer> m = new HashMap<String, Integer>();
    Map<String, Integer> m2 = new HashMap<String, Integer>();

    for(int i=0; i<length; i++){
      m.put(want[i], number[i]);
    }
    while(start<=discount.length-10) {
      for(int i=start; i<start+10; i++) {
        if(!m2.containsKey(discount[i])) m2.put(discount[i], 1);
        else m2.replace(discount[i], m2.get(discount[i])+1);
      }
      if(m.equals(m2)) answer++;
      start++;
      m2.clear();
    }
    return answer;
  }
}
public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    String[] str1 = {"banana", "apple", "rice", "pork", "pot"};
    int[] int1 = {3, 2, 2, 2, 1};
    String [] arr1 = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

    String[] str2 = {"apple"};
    int[] int2 = {};
    String[] arr2 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};
    System.out.println(s.solution(str1, int1, arr1));
    System.out.println(s.solution(str2, int2, arr2));
  }
}
