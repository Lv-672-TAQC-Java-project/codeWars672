package com.org.ita.kata.implementation.OliaDmytryk;

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
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int [] rez = new int [2];
        int countOne = 0;
        int countTwo = 0;
        for (int i=0; i< input.length; i++){

            if(input[i] > 0){
                countOne ++;
                rez[0] = countOne;
            }
            else if(input[i]<0){
                countTwo += input[i];
                rez[1]= countTwo;
            }
        }
        return rez;
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
