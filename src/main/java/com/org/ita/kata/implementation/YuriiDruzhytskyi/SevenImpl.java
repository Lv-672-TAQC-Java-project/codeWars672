package com.org.ita.kata.implementation.YuriiDruzhytskyi;

import com.org.ita.kata.Base;
import com.org.ita.kata.Seven;

public class SevenImpl extends Base implements Seven {
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
        double calculatedSum = 0.0;
        for (int i = 0; i < n; i++)
            calculatedSum = calculatedSum + 1.0 / (1 + 3 * i);

        return String.format("%.2f", calculatedSum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p - bef, aft + 1);
    }
}
