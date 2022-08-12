package sosu;

class Solution {
    public static boolean sosu (int sum) {
        boolean answer = false;
        for (int i=2; i<sum; i++) {
            if (sum%i==0) {
                answer = false;
                break;
            } else {
                answer = true;
            }
        }
        return answer;
    }

    public int solution(int[] nums) {
        int answer = 0;
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    int num=nums[i]+nums[j]+nums[k];
                    if(sosu(num)) answer++;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(s.solution(nums));
    }
}

