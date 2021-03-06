package com.org.ita.kata.implementation.OliaDmytryk;

import com.org.ita.kata.Base;
import com.org.ita.kata.Eight;

public class EightImpl extends Base implements Eight {
    @Override
    public int liters(double time) {
        return (int) (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        double kpl = 1.609344 / 4.54609188;


        return (float) Math.round(mpg * kpl * 100) / 100;

    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] rez = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            double MaybeI = Math.sqrt(array[i]);

            if (MaybeI % 1 == 0) {
                rez[i] = (int) MaybeI;
            } else {
                rez[i] = array[i] * array[i];
            }
        }
        return rez;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] arrayEmpty = new int[0];
        if (input == null) {
            return arrayEmpty;
        }
        if (input.length == 0) {
            return arrayEmpty;
        }

        int[] rez = new int[2];
        int countOne = 0;
        int countTwo = 0;
        for (int i = 0; i < input.length; i++) {

            if (input[i] > 0) {
                countOne++;
                rez[0] = countOne;
            } else if (input[i] < 0) {
                countTwo += input[i];
                rez[1] = countTwo;
            }
        }
        return rez;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return n == 5.0 || n == 13.0 || n == 563.0;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return (double) Math.round(number * 100) / 100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
