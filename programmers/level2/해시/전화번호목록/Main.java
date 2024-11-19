package programmers.level2.해시.전화번호목록;

import java.util.Arrays;

class Solution {
  public boolean solution(String[] phone_book) {
    Arrays.sort(phone_book);
    for (int i = 0; i < phone_book.length - 1; i++) {
      if (phone_book[i + 1].startsWith(phone_book[i]))
        return false;
    }
    return true;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    String[] arr1 = { "119", "97674223", "1195524421" };
    String[] arr2 = { "123", "456", "789" };
    String[] arr3 = { "12", "123", "1235", "567", "88" };
    System.out.println(s.solution(arr1));
    System.out.println(s.solution(arr2));
    System.out.println(s.solution(arr3));
  }
}
