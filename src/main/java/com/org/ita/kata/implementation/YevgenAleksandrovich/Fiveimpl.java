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

    @Override
    public int zeros(int n) {
        return 0;
    }
/*Perimeter of squares in a rectangle*/
    @Override
    public BigInteger perimeter(BigInteger n) {

            BigInteger first = BigInteger.ZERO;
            BigInteger second = BigInteger.ONE;
            BigInteger temp = BigInteger.ONE;
            BigInteger sum = BigInteger.ZERO;
            for (long i = 0; i <= n.longValue(); i++) {
                first = second;
                second = temp;
                temp = first.add(second);
                sum = sum.add(first);
            }
            return sum.multiply(BigInteger.valueOf(4));
        }
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
