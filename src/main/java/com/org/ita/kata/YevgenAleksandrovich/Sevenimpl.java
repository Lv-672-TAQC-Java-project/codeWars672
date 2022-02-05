package com.org.ita.kata.YevgenAleksandrovich;

import com.org.ita.kata.Seven;

public class Sevenimpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
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

