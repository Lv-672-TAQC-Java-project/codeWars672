package com.org.ita.kata.implementation.KaterynaMushynska;

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
