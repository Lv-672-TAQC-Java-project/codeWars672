package com.org.ita.kata.implementation.RomanVytrykush;

import com.org.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        double litres = time * 0.5;
        return (int) litres;
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
        int negativeSum = 0;
        int count = 0;
        if ((input == null) || (input.length == 0)) {
            return new int[0];
        }
        for (int i : input) {
            if (i < 0 ) {
                negativeSum += i; }
            if (i > 0) {
                count++;
            }
        }
        return new int[] {count, negativeSum};
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
        return new int[0];
    }
}
