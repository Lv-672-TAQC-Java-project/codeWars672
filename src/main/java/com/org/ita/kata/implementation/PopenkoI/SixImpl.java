package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long counter = 0;
        int i = 1;
        while (m > 0) {
            m = m - (long) Math.pow(i, 3);
            counter = counter + 1;
            i++;
        }
        if (m != 0) {
            return -1;
        }
        return counter;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
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
