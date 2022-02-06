package com.org.ita.kata.implementation.OlehPysko;

import com.org.ita.kata.Seven;

public class SevenImplO implements Seven {
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
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
