import java.lang.Math;
import java.util.ArrayList;
// Title: Largest prime factor

// Pseudo:
/* for i to sqrt(n)
 * check if divisible
 * add to list
 * starting from end of list
 * check if prime
 * if prime, return
 */

// Answer: 6857

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(answer());
    }
  
    public static long answer() {
        long N = 600851475143L;
        ArrayList<Long> factors = new ArrayList<Long>();
        for (long i = 3; i < (int) Math.sqrt(N); i++) {
            if (N % i == 0) {
                factors.add(i);
            }
        }

        long largestPrimeFactor = -1;
        for (int i = factors.size() - 1; i >= 0; i--) {
            if (isPrime(factors.get(i))) {
                largestPrimeFactor = factors.get(i);
                break;
            }
        }
        return largestPrimeFactor;
    }

    public static boolean isPrime(long n) {
        for (int i = 3; i < (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
  }
  