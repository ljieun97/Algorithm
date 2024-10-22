package baekjoon.조합론.베라의패션;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    solution(n);
  }

  public static void solution(int n) {
    int answer = n*n-n;
    System.out.println(answer);
  }
}
