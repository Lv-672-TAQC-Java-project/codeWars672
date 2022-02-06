package com.org.ita.kata.implementation.OlehPysko;

import com.org.ita.kata.Six;

public class SixImplO implements Six {
    @Override
    public long findNb(long m) {
        int count = 1;
        long findNb = 0;

        while (m > 0) {
            m = m - (long)(Math.pow(count,3));
            findNb++;
            count++;
        }
        if (m < 0) {
            return -1;
        }
        return findNb;
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
