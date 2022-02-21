package com.org.ita.kata.implementation.KaterynaMushynska;

import com.org.ita.kata.Base;
import com.org.ita.kata.Seven;

public class SevenImpl extends Base implements Seven {
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
        double result = 0.0;
        for (int i = 0; i < n; i++) {
            result += 1.0 / (1 + i * 3);
        }
        return String.format("%.2f", result);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int count = 0;
        for (int i = 1; i <= p; i++) {
            int infront = i - 1;
            int behind = p - i;
            if (infront >= bef && behind <= aft) {
                count++;
            }
        }
        return count;
    }
}
