package com.org.ita.kata.implementation.RomanVytrykush;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int v = 0;
        for(int i = 0; i != p; i++)
        {
            if (i >= bef && (p - (i + 1)) <= aft) {
                v++;
            }
        }
        return v;
    }
}
