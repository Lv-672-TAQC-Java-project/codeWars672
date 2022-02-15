package com.org.ita.kata.implementation.lhalam;

import com.org.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return (int) (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    /*Count of positives sum of negatives*/
    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        for (int j : input) {
            if (j > 0) {
                result[0]++;
            } else {
                result[1] += j;
            }
        }
        return result;
    }

    /*Convert a string to a number*/
    @Override
    public int stringToNumber(String str) {
        int number = Integer.parseInt(str);
        return number;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }
   /*Two Decimal Placec*/
    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round((number * 100) / 100);
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
