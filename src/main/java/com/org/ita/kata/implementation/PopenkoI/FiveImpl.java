package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        int fibonachi1 = 0, fibonachi2 = 1, fibonachi3 = 1;
        BigInteger sum = BigInteger.valueOf(0);
        ArrayList<Integer> fibonachiNumbers = new ArrayList<>();
        // обчислює фібоначі
        for (int i = 0; i < n.intValue() + 1; i++) {
            fibonachiNumbers.add(fibonachi3);
            fibonachi3 = fibonachi1 + fibonachi2;
            fibonachi1 = fibonachi2;
            fibonachi2 = fibonachi3;
        }

        for (Integer fibonachiNumber : fibonachiNumbers) {
            sum = sum.add(BigInteger.valueOf(fibonachiNumber));
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
