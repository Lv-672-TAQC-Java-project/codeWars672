package com.org.ita.kata.implementation.OlehPysko;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImplO implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {

        long var1 = 0;
        long [] a = {0, 0};
         for (long i = m+1; i <= n; i++) {
            if ((i) % m == 0) {
                for (long b = 2; b < i/2; b++) {
                    if (i%b != 0){
                        System.out.println("Nothig");
                    }
                    else if (i - var1 == g)
                    {a[0] = var1;
                        a[1] = i;}
                    else{var1 = i;}

                }
            }
            else {System.out.println("");}
        }

        return null;
    }

    @Override
    public int zeros(int n) {
        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
