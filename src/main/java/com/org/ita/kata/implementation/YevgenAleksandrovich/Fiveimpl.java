package com.org.ita.kata.implementation.YevgenAleksandrovich;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class Fiveimpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }
/*Number of trailing zeros of N!*/
    @Override
    public int zeros(int n) {
        if (n < 0)
            throw new IllegalArgumentException();

        int trailingZeros = 0;

        for (int i = 5; n / i >= 1; i *= 5)
            trailingZeros += n / i;

        return trailingZeros;
    }



    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
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
