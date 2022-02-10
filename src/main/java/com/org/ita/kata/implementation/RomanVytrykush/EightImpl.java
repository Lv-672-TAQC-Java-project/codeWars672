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
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) array[i] = (int) Math.sqrt(array[i]);
            else array[i] *= array[i];
        }
        return array;
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
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++)
            if (n % i ==0){
                return false;
            }
        return true;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number * 100) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int divisibles = 0;
        int counter = 0;
        for (int i : numbers)
            if (i % divider == 0) {
                divisibles++;
            }

        int[] resultArray = new int[divisibles];
        for (int i : numbers)
            if (i % divider == 0) {
                resultArray[counter] = i;
                counter++;
            }
        return resultArray;
    }
}
