package com.org.ita.kata.implementation.KaterynaMushynska;

import com.org.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
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

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int divisibleCount = 0;
        for(int l : numbers) {
            if(l % divider == 0)
                divisibleCount++;
        }
        int[] arrRes = new int[divisibleCount];
        int i = 0;
        for(int l : numbers) {
            if(l % divider == 0)
                arrRes[i++] = l;
        }
        return arrRes;
    }
}
