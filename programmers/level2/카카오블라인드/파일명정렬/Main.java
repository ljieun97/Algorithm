//하는중

package programmers.level2.카카오블라인드.파일명정렬;

import java.util.*;

//영어같을때 숫자같으면 안바꿈
//영어다르면 정렬

class Solution {
  public String[] solution(String[] files) {
    Arrays.sort(files, new Comparator<String>() {
      public int compare(String str1, String str2) {
        String head1 = str1.split("[0-9]")[0];
        String head2 = str2.split("[0-9]")[0];
        if (head1.toLowerCase().equals(head2.toLowerCase())) {
          String regex = "[a-zA-Z.\\-\\s]";
          String num1 = str1.split(head1)[1].split(regex)[0];
          String num2 = str2.split(head2)[1].split(regex)[0];
          if(num1.length()>5) num1 = num1.substring(0,4);
          if(num2.length()>5) num2 = num2.substring(0,4);
          if (Integer.parseInt(num1) == Integer.parseInt(num2))
            return 0;
          else
            return Integer.parseInt(num1) - Integer.parseInt(num2);
        }
        return str1.compareTo(str2);
      }
    });
    return files;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    String[] arr1 = { "img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG" };
    String[] arr2 = { "F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat" };
    System.out.println(Arrays.toString(s.solution(arr1)));
    System.out.println(Arrays.toString(s.solution(arr2)));
  }
}
