package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
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
            String newNumberInStr = String.join(Long.toString(min), numberInStr.substring(0,smallerPosition), numberInStr.substring(smallerPosition));
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
