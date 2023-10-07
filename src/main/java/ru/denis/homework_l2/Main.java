package ru.denis.homework_l2;

public class Main {

    private static long[] fiboCashed;

    public static void main(String[] args) {

        int num = 92;

        fiboCashed = new long[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print(fibo(i) + " | ");
        }
    }

    private static long fibo(int num) {
        if (num <= 1) {
            return num;
        }

        if (fiboCashed[num] != 0) {
            return fiboCashed[num];
        }

        long nthFiboNum = (fibo(num - 1) + fibo(num - 2));

        fiboCashed[num] = nthFiboNum;

        return nthFiboNum;
    }
}
