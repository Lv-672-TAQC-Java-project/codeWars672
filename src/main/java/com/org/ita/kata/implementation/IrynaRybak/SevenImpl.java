package com.org.ita.kata.implementation.IrynaRybak;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {

    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double number : arr) {
            sum += number;
        }
        if (sum > (navg * arr.length)) {
            throw new IllegalArgumentException();
        }
        return (long) (((arr.length + 1) * navg) - sum);
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
