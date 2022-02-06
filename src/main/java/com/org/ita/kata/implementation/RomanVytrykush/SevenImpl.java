package com.org.ita.kata.implementation.RomanVytrykush;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        double result = (arr.length + 1) * navg - sum;
        if (result > 0) {
            return  (int) (Math.ceil(result));
        } else {
            throw new IllegalArgumentException();
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
