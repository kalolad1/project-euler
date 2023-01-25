package projecteuler;

// Pseudo:
/* sum = 0
 * n from 3 to 1000
 * if n is % 3 or % 5
 * then sum += n 
 */

// Answer: 233168

public class Problem1 {
  public static void main(String[] args) {
      System.out.println(answer());
  }

  public static int answer() {
    int sum = 0;
      for (int i = 3; i < 1000; i++) {
        if (i % 5 == 0 || i % 3 == 0) {
          sum += i;
        }
      }
    return sum;
  }
}
