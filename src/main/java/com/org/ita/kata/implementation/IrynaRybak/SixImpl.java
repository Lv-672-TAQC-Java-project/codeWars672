package com.org.ita.kata.implementation.IrynaRybak;

import com.org.ita.kata.Six;

public class SixImpl implements Six {

    @Override
    public long findNb(long m) {
        long count = 0;
        for (long i = 1; i < m; i++) {
            m = m - (long) Math.pow(i, 3);
            count++;
        }
        if (m != 0) {
            return -1;
        }
        return count;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
