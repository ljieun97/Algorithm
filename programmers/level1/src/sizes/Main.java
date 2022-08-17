package sizes;

class Solution {
    public int solution(int[][] sizes) {
        int wmax = 0;
        int hmax = 0;
        for (int size[] : sizes) {
            wmax = Math.max (wmax, Math.max(size[0], size[1]));
            hmax = Math.max (hmax, Math.min(size[0], size[1]));
        }
        return wmax*hmax;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(s.solution(sizes));
    }
}
