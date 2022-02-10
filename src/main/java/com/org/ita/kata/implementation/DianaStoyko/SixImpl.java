package com.org.ita.kata.implementation.DianaStoyko;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        int i = 1;
        long count = 0;

        while (m > 0) {
            double pow = Math.pow(i, 3);
            m = m - (long) pow;
            count = count + 1;
            i++;
        }

        if (m != 0) { return -1; }
        return count;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return  x/(1+Math.sqrt(x+1));
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