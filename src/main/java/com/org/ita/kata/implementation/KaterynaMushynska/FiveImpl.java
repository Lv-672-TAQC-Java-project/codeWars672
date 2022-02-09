package com.org.ita.kata.implementation.KaterynaMushynska;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.Arrays;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long[] primes = new long[(int) (n - m)];
        int num = 0;
        for (int i = (int) m; i < (int) n; i++) {
            if (checkPrime(i)) {
                primes[num] = (long) i;
                num++;
            }
        }
        for (int i = 0; i < primes.length - 1; i++) {
            if (primes[i] >= m && primes[i] == primes[i + 1] - g) {
                return Arrays.copyOfRange(primes, i, i + 2);
            }
        }
        return null;
    }

    public static boolean checkPrime(long i) {
        for (int j = 2; j < Math.sqrt(i + 1); j++) {
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
