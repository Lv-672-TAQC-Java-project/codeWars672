package com.org.ita.kata.implementation.YevgenAleksandrovich;

import com.org.ita.kata.Base;
import com.org.ita.kata.Seven;

public class Sevenimpl extends Base implements Seven {
    /*Benefactor*/
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        long result = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (result < 0) throw new IllegalArgumentException();
        return result;
    }

    /*Sum of the first nth term of Series*/
    @Override
    public String seriesSum(int n) {
        int counter = 4;
        double sum = 1;

        for (int i = 1; i < n; i++) {
            sum += (double) 1 / counter;
            counter += 3;

        }
        double scale = Math.pow(10, 2);

        return String.valueOf(Math.round(sum * scale) / scale);
    }

    /*Where is Vasya*/
    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int position = 0;
        int a, b;
        for (int i = 1; i <= p; i++) {
            a = i - 1;
            b = p - i;
            if (a >= bef && b <= aft) {
                position++;
            }
        }
        return position;
    }
}

