package com.org.ita.kata.implementation.RomanVytrykush;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double result = 0.0;
        for (int i = 0; i < n; i++) {
            result += 1.0 / (1 + 3 * i);
        }
        result = Math.round(result * 100) / 100.0;
        return String.format("%.2f", result);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
