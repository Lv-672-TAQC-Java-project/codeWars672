package com.org.ita.kata.implementation.YevgenAleksandrovich;

package com.org.ita.kata.YevgenAleksandrovich;
import java.util.ArrayList;
import java.util.List;
import com.org.ita.kata.Eight;

public class Eightimpl implements Eight {
    /*Keep Hydrated!-Kata*/
    @Override
    public int liters(double time) {
        if (time < 0) ;
        return (int) (time / 2);
    }

    /*Volume of a Cuboid Kata*/
    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        final float kilometresInMiles = 1.609344f;
        final float litresInGallon = 4.54609188f;
        final float coefficient = kilometresInMiles / litresInGallon;

        float result = mpg * coefficient;
        return Float.parseFloat(String.format("%.2f", result));
    }

    /*Square OrNot To Square*/
    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = (int) Math.pow(array[i], 2);
            }
        }
        return array;
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
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }
    /*Find numbers which are divisible by given number */
    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        int counter=0;
        for (int number : numbers) {
            if (number % divider == 0) count++;
        }
        int[] divisibleArray = new int[count];
        for (int number : numbers) {
            if (number % divider == 0) {
                divisibleArray[counter] = number;
                counter++;
            }
        }
        return divisibleArray;
    }
}
