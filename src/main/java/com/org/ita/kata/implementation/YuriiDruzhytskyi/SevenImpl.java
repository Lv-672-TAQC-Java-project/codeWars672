package com.org.ita.kata.implementation.YuriiDruzhytskyi;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
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
        return 0;
    }
}
