package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class FiveImpl implements Five {
    private static BigInteger factorial(int n) {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        boolean[] primes = fillSieve((int) n);
        ArrayList<Long> primesInGap = new ArrayList<>();

        for (int i = (int) m; i < primes.length; i++) {
            if (primes[i]) {
                primesInGap.add((long) i);
            }
        }
        for (int i = 0; i < primesInGap.size() - 1; i++) {
            if (primesInGap.get(i + 1) - primesInGap.get(i) == g) {
                return new long[]{primesInGap.get(i), primesInGap.get(i + 1)};
            }
        }
        return null;
    }

    private boolean[] fillSieve(int n) {
        boolean[] primes;
        primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
        return primes;
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        String[] numbers = factorial(n).toString(10).split("");
        for (String number : numbers) {
            if (number.equalsIgnoreCase("0")) {
                count++;
            } else {
                count = 0;
            }
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        int fibonachi1 = 0, fibonachi2 = 1, fibonachi3 = 1;
        BigInteger sum = BigInteger.valueOf(0);
        ArrayList<Integer> fibonachiNumbers = new ArrayList<>();
        // обчислює фібоначі
        for (int i = 0; i < n.intValue() + 1; i++) {
            fibonachiNumbers.add(fibonachi3);
            fibonachi3 = fibonachi1 + fibonachi2;
            fibonachi1 = fibonachi2;
            fibonachi2 = fibonachi3;
        }

        for (Integer fibonachiNumber : fibonachiNumbers) {
            sum = sum.add(BigInteger.valueOf(fibonachiNumber));
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        long copyN = n;
        int count = 0;
        do { // скільки чисел
            copyN = copyN / 10;
            count++;
        } while (copyN > 0);

        long[] nums;
        nums = new long[count];
        copyN = n;
        do { //масив чисел
            count--;
            nums[count] = copyN % 10;
            copyN = copyN / 10;
        } while (copyN > 0);

        long newNumber = 1000000, min = nums[1];
        long position, newIndex = -1;
        int minIndex = 1, smallerPosition = 0;

        while (newNumber >= n) {
            newNumber = 0;
            position = 1;
            for (int i = 2; i < nums.length; i++) {
                if (min > nums[i]) {
                    minIndex = i;
                    min = nums[i];
                }
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                if (i != minIndex) {
                    newNumber += nums[i] * position;
                    position *= 10;
                }
            }
            String numberInStr = Long.toString(newNumber);
            String newNumberInStr = String.join(Long.toString(min), numberInStr.substring(0, smallerPosition), numberInStr.substring(smallerPosition));
            newNumber = Long.parseLong(newNumberInStr);
            smallerPosition++;
            newIndex++;
        }

        if (newIndex - 1 != minIndex) {
            return new long[]{newNumber, minIndex, newIndex};
        } else {
            return new long[]{newNumber, newIndex, minIndex};
        }
    }
}
