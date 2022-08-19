package what_day;

class Solution {
    public String solution(int a, int b) {
        int sum = 0;
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        for (int i=0; i<a-1; i++) {
            sum+=date[i];
        }
        return day[(sum+b)%7];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a = 5;
        int b = 24;
        System.out.println(s.solution(a, b));
    }
}
