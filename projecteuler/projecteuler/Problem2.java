// Title: Even Fibonacci numbers

// Pseudo:
/* sum = 0
 * generate the fibo sequence up to 4 million
 * n1 = 1, n2 = 2
 * placeholder = n1 + n2
 * n1 = n2
 * n2 = placeholder
 * for each even number, add to sum
 */

// Answer: 233168

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(answer());
    }
  
    public static int answer() {
        int sum = 0;
        int n1 = 1;
        int n2 = 2;
        while (n2 < 4000000) {
            if (n2 % 2 == 0) {
                sum += n2;
            }
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        return sum;
    }
  }
  