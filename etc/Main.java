// 언니 친구가 lg가서 봤다는 코테
// 1~num1 사이값을 가지는 a와 1~num2 사이 값을 가지는 b
// a*b=c 일때, c를 이루는 모든 숫자가 a와 b를 이루는 숫자에 포함되어있는 a,b 쌍의 갯수 구하기
// ex) num=129, num2=32, result=159

package etc;

class Solution {
  public int solution(int num1, int num2) {
    int answer = 0;

    for (int i = 1; i <= num1; i++) {
      for (int j = 1; j <= num2; j++) {
        int c = i * j;
        String strA = Integer.toString(i);
        String strB = Integer.toString(j);
        String strC = Integer.toString(c);

        int length = 0;
        for (int z = 0; z < strC.length(); z++) {
          if (strA.contains(Character.toString(strC.charAt(z))) || strB.contains(Character.toString(strC.charAt(z))))
          length++;
        }

        if (strC.length() == length) answer++;
  
      }
    }
    return answer;
  }
}

public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int num1 = 29;
    int num2 = 32;
    System.out.println(s.solution(num1, num2));
  }
}