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
            long befPrime = Long.MIN_VALUE;

            for (long i = m; i <= n; i++) {
                if (findPrime(i)) {
                    if (i - befPrime == g) {
                        return new long[]{befPrime, i};
                    }
                    befPrime = i;
                }
            }
            return null;
        }
        public static boolean findPrime ( long i){
            for (int y = 2; y < i / 2; y++) {
                if (i % y == 0) {
                    return false;
                }
            }
            return true;
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
