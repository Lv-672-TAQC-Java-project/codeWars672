package com.org.ita.kata.implementation.KaterynaMushynska;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double donations : arr) {
            sum = sum + donations;
        }
        double expectedDonation = navg * (arr.length + 1) - sum;
        if (expectedDonation < 0) {
            throw new IllegalArgumentException();
        } else {
            return (long) (Math.ceil(expectedDonation));
        }
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
