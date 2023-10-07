package ru.denis.homework_l2;

public class Main {

    private static long[] fibonacciCashed;

    public static void main(String[] args) {

        int num = 92;

        fibonacciCashed = new long[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " | ");
        }
    }

    private static long fibonacci(int num) {
        if (num <= 1) {
            return num;
        }

        if (fibonacciCashed[num] != 0) {
            return fibonacciCashed[num];
        }

        long nthFiboNum = (fibonacci(num - 1) + fibonacci(num - 2));

        fibonacciCashed[num] = nthFiboNum;

        return nthFiboNum;
    }
}
