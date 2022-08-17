package hash_sort;

import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }

        int length = 0;
        answer = new int[set.size()];
        for (int num : set) {
            answer[length++] = num;
        }

        Arrays.sort(answer);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {2,1,3,4,1};
        System.out.println(Arrays.toString(s.solution(numbers)));
    }
}
