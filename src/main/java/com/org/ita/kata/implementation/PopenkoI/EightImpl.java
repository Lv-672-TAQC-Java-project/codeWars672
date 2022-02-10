package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Eight;

import java.util.ArrayList;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return (int) time / 2;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return (length * width * height);
    }

    @Override
    public float mpgToKPM(float mpg) {
        return mpg * 0.354006044f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] changedArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1.0 == 0) {
                changedArr[i] = (int) Math.round(Math.sqrt(array[i]));
            } else {
                changedArr[i] = array[i] * array[i];
            }
        }
        return changedArr;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int positive = 0, sumNegative = 0;

        if (input.length == 0) {
            return new int[0];
        }

        for (int j : input) {
            if (j > 0) {
                positive = positive + 1;
            } else {
                sumNegative = sumNegative + j;
            }
        }
        return new int[]{positive, sumNegative};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if (n == 0 || n == 1) {
            return false;
        }
        double numberWilson = (getFactorial(n - 1) + 1) / (n * n);
        return numberWilson % 1.0 == 0;
    }

    private double getFactorial(double f) {
        double result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int number : numbers) {
            if (number % divider == 0) {
                arrayList.add(number);
            }
        }

        int[] nums = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            nums[i] = arrayList.get(i);
        }

        return nums;
    }
}
