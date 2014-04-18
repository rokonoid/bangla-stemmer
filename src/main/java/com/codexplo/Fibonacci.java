package com.codexplo;

/**
 * Created by rokonoid on 4/19/14.
 */
public class Fibonacci {
    public static int fib(int n) {
        if (n < 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
