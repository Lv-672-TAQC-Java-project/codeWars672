package com.org.ita.kata.implementation.MikeRomanyshyn;

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
        double s = Math.sqrt((4 * m) + 1);
        return ((1 - s) / (2 * m) + 1);
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
