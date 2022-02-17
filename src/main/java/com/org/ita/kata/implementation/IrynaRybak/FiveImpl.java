package com.org.ita.kata.implementation.IrynaRybak;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {
    public static boolean isSimple(long num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long fastorial(int n) {
        long result = 1L;
        for (long i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
        return result;
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        List<Long> listNumbers = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            if (isSimple(i)) {
                listNumbers.add(i);
            }
        }
        for (int i = 0; i < listNumbers.size() - 1; i++) {
            long diff = listNumbers.get(i + 1) - listNumbers.get(i);
            if (diff == g) {
                return new long[]{listNumbers.get(i), listNumbers.get(i + 1)};
            }

        }
        return null;
    }

    @Override
    public int zeros(int n) {
        if (n > 25) {
            System.out.println("The number is too big ( > 25)");
            return -1;
        }
        long number = fastorial(n);
        String str = Long.toString(number);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (number % 10 == 0) {
                count = count + 1;
                number = number / 10;
            } else {
                break;
            }
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return Fibonacci(n).multiply(BigInteger.valueOf(4));
    }
    public BigInteger Fibonacci(BigInteger i) {
        BigInteger current = BigInteger.ONE;
        BigInteger previous = BigInteger.ZERO;
        BigInteger sum = BigInteger.ONE;
        for (int step = 0; step < i.intValue(); step++) {
            BigInteger tmp = current.add(previous);
            previous = current;
            current = tmp;
            sum = sum.add(current);
        }
        return sum;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        String[] strArr = Long.toString(n).split("");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        int min = numArr[1], pos = 1;
        for (int index = 2; index < numArr.length; index++) {
            if (numArr[index] < min) {
                min = numArr[index];
                pos = index;
            }
        }

        int newposition = min <= numArr[0] ? 0 : 1;
        for (int step = newposition; step <= pos; step++) {
            int temp = numArr[step];
            numArr[step] = min;
            min = temp;
        }

        String result = "";
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 0 && pos == 1) {
                int tmp = pos;
                pos = newposition;
                newposition = tmp;
                continue;
            }
            result += numArr[i];
        }
        return new long[]{Long.parseLong(result), pos, newposition};
    }
}
