package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Seven;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double num : arr) {
            sum = sum + num;
        }
        double donation = (navg * (arr.length + 1) - sum);

        if (donation <= 0) throw new IllegalArgumentException();
        return (long) donation;
    }

    @Override
    public String seriesSum(int n) {
        double result = 1;
        NumberFormat formatter = new DecimalFormat("#0.00");

        for (int i = 1; i < n; i++) {
            result = Double.parseDouble(formatter.format(result + 1.0/(1 + i*3)));
        }
        return String.valueOf(result);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return (bef + aft == p) ? p-bef : aft + 1;
    }
}
