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
        if (n < 0) {
            return -1;
        }
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger f = BigInteger.ZERO;
        BigInteger s = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i <= n.intValue(); i++) {
            f = s;
            s = c;
            c = f.add(s);
            sum = sum.add(f);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        int smallestPosition = 0;
        int replacedPosition = 0;
        String number = String.valueOf(n);
        String possibleValue = number;

        for (int i = 0; i < number.length(); i++) {
            char currentNumber = number.charAt(i);
            for (int j = 0; j < number.length(); j++) {
                StringBuilder sb = new StringBuilder(number);
                sb.deleteCharAt(i);
                sb.insert(j, currentNumber);
                String newNumber = sb.toString();
                if (Long.parseLong(newNumber) < Long.parseLong(possibleValue)) {
                    possibleValue = newNumber;
                    smallestPosition = i;
                    replacedPosition = j;
                }
            }
        }
        return new long[]{Long.parseLong(possibleValue), smallestPosition, replacedPosition};
    }
}
