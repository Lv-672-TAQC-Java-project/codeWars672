package com.org.ita.kata.implementation.YuriiDruzhytskyi;

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
        int[] arrayFin = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int x = (int) (Math.sqrt(array[i]));

            if (x * x == array[i]) {
                arrayFin[i] = x;
            } else {
                int y = (int) (Math.pow(array[i], 2));
                arrayFin[i] = y;
            }
        }
        return arrayFin;
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
