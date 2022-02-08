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
        return new long[0];
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
        final String sampleString = "" + n;
        long[] result = new long[]{Long.MAX_VALUE, 0, 0};

        for (int i = sampleString.length() - 1; i >= 0; i--) {
            final String resultString = sampleString.substring(0, i) + sampleString.substring(i + 1);

            for (int j = sampleString.length() - 1; j >= 0; j--) {
                final long finalString = Long.valueOf(resultString.substring(0, j) + sampleString.charAt(i) + resultString.substring(j));
                if (finalString <= result[0]) result = new long[]{finalString, i, j};
            }
        }

        return result;
    }
}
