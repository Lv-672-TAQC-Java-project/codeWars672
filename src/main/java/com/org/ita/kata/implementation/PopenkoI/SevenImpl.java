package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double num : arr) {
            sum = sum + num;
        }
        double donation = (navg * (arr.length + 1) - sum);

        if (donation <= 0) throw new IllegalArgumentException();
        return (long) donation;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
