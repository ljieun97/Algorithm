package parseInt;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = "";
        while(n>0) {
            three += n%3;
            n = n/3;
        }
        answer = Integer.parseInt(three, 3);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 45;
        System.out.println(s.solution(n));
    }
}
