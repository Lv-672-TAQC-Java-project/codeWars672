package com.org.ita.kata.implementation.MikeRomanyshyn;

import com.org.ita.kata.Eight;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return (int)(time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return (length * width * height);
    }

    @Override
    public float mpgToKPM(float mpg) {
        double result = (mpg * 1.609344) / 4.54609188;
        return Float.parseFloat(String.format("%.2f", result));
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                newArray[i] = (int) Math.sqrt(array[i]);
            } else {
                newArray[i] = (int) Math.pow(array[i], 2);
            }
        }

        return newArray;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if ((input == null) || (input.length == 0)) { return new int[0]; }

        int counter = 0;
        int negativeTemp = 0;

        for (int i : input) {
            if (i > 0) counter++;
            if (i < 0) negativeTemp += i;
        }

        return new int[] {counter, negativeTemp};
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
