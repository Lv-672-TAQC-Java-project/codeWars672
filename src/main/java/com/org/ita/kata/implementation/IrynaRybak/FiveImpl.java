package com.org.ita.kata.implementation.IrynaRybak;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        List<Long> listNumbers = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            if (isSimple(i)) {
                listNumbers.add(i);
            }
        }
        for (int i = 0; i < listNumbers.size() - 1; i++) {
            long diff = listNumbers.get(i + 1) - listNumbers.get(i);
            if (diff == g) {
                return new long[]{listNumbers.get(i), listNumbers.get(i + 1)};
            }

        }
        return null;
    }

    public static boolean isSimple(long num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
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
