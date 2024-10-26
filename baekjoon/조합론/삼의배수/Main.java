//5시50분 - 7시30분 = 1시간40분

package baekjoon.조합론.삼의배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    solution(n);
  }

  public static void solution(int n) {
    n = n / 3;
    int answer = 0;

    for(int i=1; i<n; i++) {
      for(int j=1; j<n-i; j++) {
        if(i+j+1<=n) answer+=1;
       
      }
    }
    System.out.println(answer);
  }
}
