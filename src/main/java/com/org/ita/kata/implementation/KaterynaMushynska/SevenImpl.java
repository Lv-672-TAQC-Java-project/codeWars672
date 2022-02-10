package com.org.ita.kata.implementation.KaterynaMushynska;

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
        int count = 0;
        for (int i = 1; i <= p; i++) {
            int infront = i - 1;
            int behind = p - i;
            if (infront >= bef && behind <= aft) {
                count++;
            }
        }
        return count;
    }
}
