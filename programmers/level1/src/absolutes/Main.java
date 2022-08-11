package absolutes;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(s.solution(absolutes, signs));
    }
}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        return answer;
    }
}
