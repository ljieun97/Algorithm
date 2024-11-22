//4시20분 - 6시30분

package programmers.level2.카카오블라인드.압축;

import java.util.*;

class Solution {
  public Object[] solution(String msg) {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Integer> answer = new ArrayList<Integer>();
    for(int i=0; i<26; i++) {
      char c = (char) (i+65);
      list.add(Character.toString(c));
    }
    String[] arr = msg.split("");
    String str = "";
    
    for (int i = 0; i < arr.length; i++) {
      str = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        if (!list.contains(str + arr[j])) {
          answer.add(list.indexOf(str)+1);
          list.add(str + arr[j]);
          break;
        } else {
          i++;
        }
        str += arr[j];
      }
    }
    System.out.println(str);
    answer.add(list.indexOf(str)+1);
    return answer.toArray();
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(Arrays.toString(s.solution("KAKAO")));
    System.out.println(Arrays.toString(s.solution("TOBEORNOTTOBEORTOBEORNOT")));
    System.out.println(Arrays.toString(s.solution("ABABABABABABABAB")));
  }
}
