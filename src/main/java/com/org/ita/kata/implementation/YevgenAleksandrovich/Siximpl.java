package com.org.ita.kata.implementation.YevgenAleksandrovich;

import com.org.ita.kata.Six;

public class Siximpl implements Six {
    /*Build a oile of cubes*/
    @Override
    public long findNb(long m) {
        if (m == 0) return 0;
        long value = m;
        long i;

        for (i = 1; value > 0; i++) {
            value -= (long) Math.pow(i, 3);
        }

        if (value == 0) return i - 1;
        else return -1;
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
