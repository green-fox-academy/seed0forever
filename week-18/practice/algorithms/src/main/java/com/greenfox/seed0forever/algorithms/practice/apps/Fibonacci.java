package com.greenfox.seed0forever.algorithms.practice.apps;

public class Fibonacci {
  // The fibonacci sequence is a famous bit of mathematics, and it happens to
  // have a recursive definition. The first two values in the sequence are
  // 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
  // previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
  // and so on. Define a recursive fibonacci(n) method that returns the nth
  // fibonacci number, with n=0 representing the start of the sequence.

  public static void main(String[] args) {
    final int N = 100; // N = highest index of Fibonacci sequence
    int fibonacciNthIndexValue = 0;

    fibonacci(N);
  }

  static void fibonacci(int elements) {

    if (elements < 2) {
      System.out.print("1");
    }

    System.out.print("1, 1");

    long oneBefore = 1;
    long twoBefore = 1;
    long current = 0;
    for (int i = 2; i <= elements; i++) {
      current = oneBefore + twoBefore;
      twoBefore = oneBefore;
      oneBefore = current;
      System.out.print(", " + current);
    }
  }

}
