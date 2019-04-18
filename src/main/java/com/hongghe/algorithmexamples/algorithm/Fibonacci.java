package com.hongghe.algorithmexamples.algorithm;

/**
 * @author: hongghe @date: 2019-04-18 11:22
 */
public class Fibonacci {

    public static void main(String[] args) {

    }

    /**
     * 典型递归
     *
     * @param n
     * @return
     */
    public static int fibonacciRecursive(int n) {
        if (n<0) {
            return 0;
        }

        if (n ==0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    /**
     * 求n项和
     *
     * @param n
     * @return
     */
    public static int fibonacciSumRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum +=fibonacciRecursive(i);
        }
        return sum;
    }

    public static int fibonacci(int n) {
        int f1 = 1;
        int f2 = 1;
        int prePrefib = f1;
        int preFib = f2;
        int fib = 0;
        int flag = 2;
        if (n == 1 || n == 2) {
            return f1;
        }

        if (n > 3) {
            while (flag < n) {
                fib = preFib + prePrefib;
                prePrefib = preFib;
                preFib = fib;
                flag ++;
            }
        }
        return fib;
    }

    public static int fibonacciSum(int n) {
        return fibonacci(n+2) - 1;
    }


}
