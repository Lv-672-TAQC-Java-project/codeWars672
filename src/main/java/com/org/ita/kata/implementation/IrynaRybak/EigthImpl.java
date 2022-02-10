package com.org.ita.kata.implementation.IrynaRybak;

import com.org.ita.kata.Eight;

import java.util.ArrayList;
import java.util.List;

public class EigthImpl implements Eight {
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
        return new int[0];
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
        double result = (fastorial(n - 1) + 1);
        if (result % (n * n) == 0 && n != 1) {
            return true;
        }
        return false;
    }

    public static double fastorial(double n) {
        double result = 1;
        if(n <= 0){
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
        return result;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.ceil(number * 100) / 100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> list = new ArrayList<>();
        for(int number : numbers){
            if(number % divider == 0){
                list.add(number);
            }
        }
        int[] array = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
        return array;
    }
}
