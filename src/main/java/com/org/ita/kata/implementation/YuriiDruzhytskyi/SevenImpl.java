package com.org.ita.kata.implementation.YuriiDruzhytskyi;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double donationSum = 0;
        for (double donation : arr) {
            donationSum = donationSum + donation;
        }

        long expectedDonation = (long) (Math.ceil(navg * (arr.length + 1) - donationSum));

        if (expectedDonation <= 0) {
            throw new IllegalArgumentException();
        } else {
            return expectedDonation;
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
