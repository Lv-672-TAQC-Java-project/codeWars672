package com.org.ita.kata.implementation.OlehPysko;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }

        long avereg = (long) Math.ceil((arr.length + 1) * navg - suma);

        if (avereg < 0) throw new IllegalArgumentException();
        return avereg;
    }

    @Override
    public String seriesSum(int n) {

        double sum = 0.0;

        for (int i=0; i<n; i++) {
            sum = sum + 1.0 / (1 + 3 * i);
        }
        //double sum2 = 1.0 + sum;
        String strResult = String.format("%.2f", sum);
        return strResult;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
