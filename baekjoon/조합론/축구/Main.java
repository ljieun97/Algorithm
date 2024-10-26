//1시간반 - 못풀겠다

package baekjoon.조합론.축구;

import java.io.IOException;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) throws IOException {

    solution(50, 50);
  }

  public static void solution(double a, double b) {
    a *= 0.01;
    b *= 0.01;
    double am = 1 - a;
    double bm = 1 - b;

    // 1 1 둘다
    // 1 0 a팀
    // 0 1 b팀
    // 1 - 둘다 소수가 아닌 확률

    // 최대 각 18골
    // 소수 2 3 5 7 11 13 17
    // 0 1 4 6 8 9 10 12 14 15 16 18
    // 12중 2개 고르기 중복가능

    // a팀 1골 b팀 1골
    // 0.4^1 * 0.6^17 * 0.3^1 * 0.7^17

    BigDecimal answer = new BigDecimal("1");
    double notSosu[] = { 0, 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18 };
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        BigDecimal ah = new BigDecimal(Math.pow(0.5, notSosu[i]) * Math.pow(0.5, 18 - notSosu[i]));

        
        BigDecimal bh = new BigDecimal(Math.pow(0.5, notSosu[j]) * Math.pow(0.5, 18 - notSosu[j]));

        System.out.println(answer);

        answer = answer.subtract(ah.multiply(bh));
      }

    }

    System.out.println(answer);
  }
}
