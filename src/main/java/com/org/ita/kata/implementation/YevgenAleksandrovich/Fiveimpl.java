package com.org.ita.kata.implementation.YevgenAleksandrovich;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class Fiveimpl implements Five {

    /*African Rain*/
    @Override
    public int artificialRain(int[] v) {
        int[] arrRight = countRight(v);
        int[] arrLeft = countLeft(v);
        int count = 0;

        for (int i = 0; i < arrLeft.length; i++) {
            count = Math.max(arrLeft[i] + arrRight[i] + 1, count);
        }
        return count;
    }

    static boolean goLeft(int[] numbers, int i) {
        if (i == 0)
            return false;
        return numbers[i - 1] <= numbers[i];
    }

    static boolean goRight(int[] numbers, int i) {
        if (numbers.length - 1 == i)
            return false;
        return numbers[i + 1] <= numbers[i];
    }

    static int[] countLeft(int[] numbers) {
        int[] count = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (goLeft(numbers, i)) {
                count[i] = count[i - 1] + 1;
            } else {
                count[i] = 0;
            }
        }
        return count;
    }

    static int[] countRight(int[] numbers) {
        int[] count = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (goRight(numbers, i)) {
                count[i] = count[i + 1] + 1;
            } else {
                count[i] = 0;
            }
        }
        return count;
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
        if (n < 0)
            throw new IllegalArgumentException();

        int trailingZeros = 0;

        for (int i = 5; n / i >= 1; i *= 5)
            trailingZeros += n / i;

        return trailingZeros;
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


    @Override
    public double solveSum(double m) {
        return 0;
    }
/*Find the smallest */
    @Override
    public long[] smallest(long n) {
        long smallestValue = n;
        long smallestI = 0;
        long smallestJ = 0;

        String value = String.valueOf(n);
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < value.length(); j++) {
                if (i == j) continue;

                long replaced = replace(n, i, j);
                if (replaced < smallestValue){
                    smallestValue = replaced;
                    smallestI = i;
                    smallestJ = j;
                }
            }
        }

        return new long[]{smallestValue, smallestI, smallestJ};
    }

    private static long replace(long value, int i, int j) {
        StringBuilder builder = new StringBuilder(String.valueOf(value));

        char digit = builder.charAt(i);
        builder.deleteCharAt(i);
        builder.insert(j, digit);
        return Long.parseLong(builder.toString());
    }
}
