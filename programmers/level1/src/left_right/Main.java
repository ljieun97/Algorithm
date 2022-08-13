package left_right;

class Solution {
    public int solution(int left, int right) {
//        int answer = 0;
//        for (int i=left; i<right+1; i++) {
//            int count = 0;
//            for (int j=1; j<i+1; j++) {
//                if(i%j==0) count++;
//            }
//            if (count%2==0) {
//                answer+=i;
//            } else {
//                answer-=i;
//            }
//        }
//        return answer;
        int answer = 0;
        for (int i=left;i<=right;i++) {
            if (i % Math.sqrt(i) == 0) {
                //어떤수를 제곱근으로 나누었을때 나머지가 0이면 제곱수
                answer -= i;
            }
            else {
                answer += i;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int left = 13;
        int right = 17;
        System.out.println(s.solution(left, right));
    }
}
