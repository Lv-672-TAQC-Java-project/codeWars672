package com.org.ita.kata.implementation.RomanVytrykush;

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
        int zeros = 0;

        while(n / 5 > 0) {
            zeros += n / 5;
            n = n / 5;
        }
        return zeros;
    }
    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;
        BigInteger sum = first.add(second);

        for(BigInteger i = BigInteger.ONE; n.compareTo(i) == 1; i=i.add(BigInteger.ONE)) {
            BigInteger next = first.add(second);
            first = second;
            second = next;
            sum = sum.add(next);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }


    @Override
    public double solveSum(double m) {
        return (1 - Math.sqrt( 4 * m + 1)) / (m * 2) + 1;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
