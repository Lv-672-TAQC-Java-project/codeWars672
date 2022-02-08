package com.org.ita.kata.implementation.YuriiDruzhytskyi;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long result;

        for (long i = m; i <= n; i++) {
            if (BigInteger.valueOf(i).isProbablePrime((int) Math.log(i))) {
                result = i++;
                while (i <= n && !BigInteger.valueOf(i).isProbablePrime((int) Math.log(i)))
                    i++;
                if (i > n) return null;
                if (i - result == g) {
                    long[] a = {result, i};
                    return a;
                }
                i--;
            }
        }

        return null;
    }

    @Override
    public int zeros(int n) {
        return 0;
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
