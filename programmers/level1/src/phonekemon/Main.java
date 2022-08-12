package phonekemon;

import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            hashSet.add(i);
        }
        return hashSet.size()<nums.length/2 ? hashSet.size() : nums.length/2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 1, 2, 3};
        System.out.println(s.solution(nums));
    }
}
