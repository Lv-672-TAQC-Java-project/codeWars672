package com.org.ita.kata.implementation.YuriiDruzhytskyi;

import com.org.ita.kata.Base;
import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl extends Base implements Five {
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
        int result = 0;
        while (n >= 5) {
            result += n / 5;
            n = n / 5;
        }

        return result;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger a;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);
        }

        return sum.multiply(BigInteger.valueOf(4));
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
