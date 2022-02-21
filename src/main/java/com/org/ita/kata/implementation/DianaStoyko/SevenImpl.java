package com.org.ita.kata.implementation.DianaStoyko;

import com.org.ita.kata.Base;
import com.org.ita.kata.Seven;

public class SevenImpl extends Base implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double i : arr) sum += i;
        long res = (long) Math.ceil((arr.length + 1) * navg - sum);
        if (res < 0) throw new IllegalArgumentException();
        return res;
    }

    @Override
    public String seriesSum(int n) {
        double res = 0.0;
        for (int i = 0; i < n; i++) res += 1 / (1 + (double) i * 3);
        return String.format("%.2f", res);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}