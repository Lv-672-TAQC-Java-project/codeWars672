package com.org.ita.kata.implementation.MikeRomanyshyn;

import com.org.ita.kata.Base;
import com.org.ita.kata.Seven;

public class SevenImpl extends Base implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {

        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + (1 / (1 + (double) (3 * i)));
        }

        return (n <= 0) ? String.format("%.2f", 0.0) : String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min((p - bef), (aft + 1));
    }
}
