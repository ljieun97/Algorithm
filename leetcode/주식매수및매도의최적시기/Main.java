package leetcode.주식매수및매도의최적시기;

class Solution {
  public int maxProfit(int[] prices) {
    int current = prices[0];
    int max = 0;

    for (int i = 1; i < prices.length; i++) {
      int diff = prices[i] - current;

      if (diff < 0)
        current = prices[i];
      else
        max = max > diff ? max : diff;
    }

    return max;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] prices = { 7, 6, 4, 3, 1 };
    System.out.println(s.maxProfit(prices));
  }
}
