package com.org.ita.kata.implementation.OlehPysko;

import com.org.ita.kata.Eight;

//test
public class EightImplO implements Eight {
    @Override
    public int liters(double time) {
        int litters = (int)(0.5*time);
        return litters;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float convert =  (float)(mpg*1.609344/4.54609188);
        float scale = (float)(Math.pow(10, 2));
        float result = (float)(Math.round(convert * scale) / scale);

        //BigDecimal dec = new BigDecimal(convert);
        //dec = dec.setScale(2, ROUND_HALF_UP);
        //return dec.floatValue();
        return result;

            }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) array[i] = (int) Math.sqrt(array[i]);
            else array[i] = array[i] * array[i];
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0){
            int [] array = {};
            return array;
        }

        int plus = 0;
        int minuse = 0;

        for (int i = 0; i < input.length; i++) {

            if (input[i] > 0) {
                plus++;
            }
            else {
                minuse = minuse + input[i];
            }



        }
        int [] array = {plus, minuse};
        return array;
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
