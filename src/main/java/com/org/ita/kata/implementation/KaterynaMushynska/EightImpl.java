package com.org.ita.kata.implementation.KaterynaMushynska;

import com.org.ita.kata.Eight;

import java.util.NoSuchElementException;

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
        if (array != null && array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    if (Math.sqrt(array[i]) % 1 == 0) {
                        array[i] = (int) Math.sqrt(array[i]);
                    } else {
                        array[i] = (int) Math.pow(array[i], 2);
                    }
                } else {
                    throw new NoSuchElementException("Element is negative");
                }
            }
        }
        return array;
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
        return new int[0];
    }
}
