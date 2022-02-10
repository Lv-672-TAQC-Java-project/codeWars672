package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        boolean[] primes = fillSieve((int) n);
        ArrayList<Long> primesInGap = new ArrayList<>();

        for (int i = (int) m; i < primes.length; i++) {
            if (primes[i]) {
                primesInGap.add((long) i);
            }
        }
        for (int i = 0; i < primesInGap.size() - 1; i++) {
            if (primesInGap.get(i + 1) - primesInGap.get(i) == g) {
                return new long[]{primesInGap.get(i), primesInGap.get(i + 1)};
            }
        }
        return null;
    }

    private boolean[] fillSieve(int n) {
        boolean[] primes;
        primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
        return primes;
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
