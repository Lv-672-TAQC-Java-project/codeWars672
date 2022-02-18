package com.org.ita.kata.implementation.RomanVytrykush;

import com.org.ita.kata.Base;
import com.org.ita.kata.Seven;

public class SevenImpl extends Base implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        double result = (arr.length + 1) * navg - sum;
        if (result > 0) {
            return (int) (Math.ceil(result));
        } else {
            throw new IllegalArgumentException();
        }
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
        int v = 0;
        for (int i = 0; i != p; i++) {
            if (i >= bef && (p - (i + 1)) <= aft) {
                v++;
            }
        }
        return v;
    }
}
