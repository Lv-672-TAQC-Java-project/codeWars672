package com.org.ita.kata.implementation.YevgenAleksandrovich;

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
/*Where is Vasya*/
    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int position=0;
        int a,b;
        for(int i=1;i<=p;i++)
        {
            a=i-1;
            b=p-i;
            if(a>=bef && b<=aft){
                position++;
            }
        }
        return position;
    }
}

