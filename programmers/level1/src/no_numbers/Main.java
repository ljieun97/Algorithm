package no_numbers;

import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int n : num) {
            for (int ns : numbers) {
                if (n==ns) num[n]=0;
            }
        }
        int answer = Arrays.stream(num).sum();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(s.solution(numbers));
    }
}
