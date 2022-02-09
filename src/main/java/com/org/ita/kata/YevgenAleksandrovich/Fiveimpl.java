package com.org.ita.kata.YevgenAleksandrovich;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class Fiveimpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
/*Gap in Primes*/
    @Override
    public long[] gap(int g, long m, long n) {
        long a = 0;
        boolean prime;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (i - a == g) {
                    return new long[] { a, i };
                }
                a = i;
            }
        }
        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) {
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
