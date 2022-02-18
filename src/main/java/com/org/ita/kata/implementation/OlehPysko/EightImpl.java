package com.org.ita.kata.implementation.OlehPysko;

import com.org.ita.kata.Base;
import com.org.ita.kata.Eight;

//test
public class EightImpl extends Base implements Eight {
    @Override
    public int liters(double time) {
        int litters = (int) (0.5 * time);
        return litters;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float convert = (float) (mpg * 1.609344 / 4.54609188);
        float scale = (float) (Math.pow(10, 2));
        float result = Math.round(convert * scale) / scale;

        //BigDecimal dec = new BigDecimal(convert);
        //dec = dec.setScale(2, ROUND_HALF_UP);
        //return dec.floatValue();
        return result;

    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) array[i] = (int) Math.sqrt(array[i]);
            else array[i] = array[i] * array[i];
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            int[] array = {};
            return array;
        }

        int plus = 0;
        int minuse = 0;

        for (int i = 0; i < input.length; i++) {

            if (input[i] > 0) {
                plus++;
            } else {
                minuse = minuse + input[i];
            }


        }
        int[] array = {plus, minuse};
        return array;
    }

    @Override
    public int stringToNumber(String str) {
        int number = Integer.parseInt(str);
        return number;
    }

    @Override
    public boolean amIWilson(double n) {
        return n == 5 || n == 13 || n == 563;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        double scale = Math.pow(10, 2);
        double result = Math.round(number * scale) / scale;
        return result;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }

        int[] array = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                array[count1] = numbers[i];
                count1++;
            }
        }

        return array;
    }
}
