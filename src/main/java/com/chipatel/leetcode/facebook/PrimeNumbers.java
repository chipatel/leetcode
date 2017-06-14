/**
 * 
 */
package com.chipatel.leetcode.facebook;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class PrimeNumbers {


  public void isPrime(int n) {
    for (int i = 1; i < n; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println(i + " ");
      }
    }

  }

  public static void main(String[] args) {
    PrimeNumbers pn = new PrimeNumbers();
    pn.isPrime(17);



  }

}
