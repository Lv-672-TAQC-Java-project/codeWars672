package com.org.ita.kata.implementation.MikeRomanyshyn;

import com.org.ita.kata.Eight;

import java.util.ArrayList;

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
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        int factorialForWilsonPrime = 1;

        for (int i = 1; i <= (Math.floor(n) - 1) ; i++) {
            factorialForWilsonPrime *= i;
        }

        if (((factorialForWilsonPrime + 1) / (n * n)) % 2 == 0) { return true; } else { return false; }
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Double.parseDouble(String.format("%.2f", number));
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> resultArray = new ArrayList<>();

        for (int i : numbers) {
            if (i % divider == 0) {
                resultArray.add(i);
            }
        }

        return resultArray.stream().mapToInt(i -> i).toArray();
    }
}
