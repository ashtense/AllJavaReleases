package com.ashwani.algos;

public class Fibonacci {

    public int[] getFibonacciSeries(int n){
        int f[] = new int[n + 1], i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }
}
