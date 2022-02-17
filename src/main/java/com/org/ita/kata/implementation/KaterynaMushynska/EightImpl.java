package com.org.ita.kata.implementation.KaterynaMushynska;

import com.org.ita.kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.NoSuchElementException;

public class EightImpl implements Eight {
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
        float gallon = 4.54609188f;
        float mile = 1.609344f;
        float result = (mpg * mile) / gallon;
        return (float) Math.round(result * 100) / 100;
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
        if (input == null || input.length == 0) {
            return new int[]{};
        } else {
            int countPositives = 0;
            int sumNegatives = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    countPositives++;
                } else if (input[i] < 0) {
                    sumNegatives += input[i];
                }
            }
            return new int[]{countPositives, sumNegatives};
        }
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        for (int i = 2; i < n; i++) {
            return n % i != 0;
        }
        return !(n <= 1);
    }

    @Override
    public double twoDecimalPlaces(double number) {
        BigDecimal bd = new BigDecimal(number).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                array[j] = numbers[i];
                j++;
            }
        }
        return array;
    }
}
