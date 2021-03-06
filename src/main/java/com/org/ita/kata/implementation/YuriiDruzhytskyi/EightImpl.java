package com.org.ita.kata.implementation.YuriiDruzhytskyi;

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
        double kmp = mpg * 1.609344 / 4.54609188;
        return (float) (Math.round(kmp * 100.0) / 100.0);
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
        if (input == null || input.length == 0) {
            return new int[]{};
        } else {
            int count = 0;
            int sum = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    count++;
                } else {
                    sum += input[i];
                }
            }
            return new int[]{count, sum};
        }
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.valueOf(str);
    }

    @Override
    public boolean amIWilson(double n) {
        long factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial = factorial * i;
        }

        boolean isWilsonPrime = n != 1 && (n == 563 || ((factorial + 1) % Math.pow(n, 2)) == 0);

        return isWilsonPrime;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }

        int[] arrayFin = new int[count];
        int x = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                arrayFin[x] = numbers[i];
                x++;
            }
        }

        return arrayFin;
    }
}
