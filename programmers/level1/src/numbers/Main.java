package numbers;

class Solution {
    public int solution(String s) {
        int answer;
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i=0; i<10; i++){
            s=s.replaceAll(number[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "one4seveneight";
        System.out.println(s.solution(str));
    }
}
