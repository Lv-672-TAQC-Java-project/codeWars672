package com.org.ita.kata.implementation.IrynaRybak;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {

    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double number : arr) {
            sum += number;
        }
        if (sum > (navg * arr.length)) {
            throw new IllegalArgumentException();
        }
        return (long) (((arr.length + 1) * navg) - sum);
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
        if(p <= 0){
            return -1;
        }
        if(bef < 0) {
            return 0;
        }
        return bef + 1;
    }
}
