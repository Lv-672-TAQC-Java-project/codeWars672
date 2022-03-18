package com.org.ita.kata.implementation.IrynaRybak;

import com.org.ita.kata.Base;
import com.org.ita.kata.Eight;

import java.util.ArrayList;
import java.util.List;

public class EigthImpl extends Base implements Eight {
    public static double fastorial(double n) {
        double result = 1;
        if (n <= 0) {
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
        return result;
    }

    @Override
    public int liters(double time) {
        return (int) (time / 2);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return (length * width * height);
    }

    @Override
    public float mpgToKPM(float mpg) {
        double convert = 1.609344 / 4.54609188;
        return (float) Math.round(convert * mpg * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                arr[i] = (int) Math.sqrt(array[i]);
            } else {
                arr[i] = (int) Math.pow(array[i], 2);
            }
        }
        return arr;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input.length == 0) {
            return new int[0];
        }
        int count = 0, sum = 0;
        for (int number : input) {
            if (number > 0) {
                count++;
            }
            if (number < 0) {
                sum += number;
            }
        }
        return new int[]{count, sum};
    }

    @Override
    public int stringToNumber(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        double result = (fastorial(n - 1) + 1);
        return result % (n * n) == 0 && n != 1;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            if (number % divider == 0) {
                list.add(number);
            }
        }
        int[] array = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
