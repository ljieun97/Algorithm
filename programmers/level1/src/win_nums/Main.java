package win_nums;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero_count = 0;
        int win_count = 0;

        for (int num : lottos){
            if(num==0) {
                zero_count++;
            }else {
                for (int win : win_nums){
                    if(num==win) win_count++;
                }
            }
        }

        int[] result = {rank(zero_count+win_count),rank(win_count)};
        return result;
    }
    public int rank(int count) {
        switch (count) {
            case 6: count=1;
                break;
            case 5: count=2;
                break;
            case 4: count=3;
                break;
            case 3: count=4;
                break;
            case 2: count=5;
                break;
            default: count=6;
                break;
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(s.solution(lottos, win_nums)));
    }
}
