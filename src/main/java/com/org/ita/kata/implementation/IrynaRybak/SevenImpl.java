package com.org.ita.kata.implementation.IrynaRybak;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {

    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.0;
        for (double i = 1; i <= n * 3; i += 3) {
            sum += 1 / i;
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
