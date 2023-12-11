package com.mycompany.fibonacciiterativo;

public class FibonacciIterativo {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println("El término " + n + " de la serie Fibonacci es: " + fibonacci(n));
    }

    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            long a = 1;
            long b = 1;
            long temp = 0;

            for (int i = 3; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }

            return b;
        }
    }
}
