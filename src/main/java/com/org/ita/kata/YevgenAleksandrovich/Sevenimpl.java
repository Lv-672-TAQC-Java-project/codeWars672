package com.org.ita.kata.YevgenAleksandrovich;

import com.org.ita.kata.Seven;

public class Sevenimpl implements Seven {
    /*Benefactor*/
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double i:arr) {
            sum+=i;
        }
        long result = (long) Math.ceil(navg*(arr.length+1)-sum);
        if (result<0) throw new IllegalArgumentException();
        return result;
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
