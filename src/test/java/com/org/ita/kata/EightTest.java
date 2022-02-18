package com.org.ita.kata;


import com.org.ita.DataProviderUserImplementation;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class EightTest extends DataProviderUserImplementation {

    @DataProvider(name = "LitersDP")
    public Object[][] impls() {
        Object[][] parameters = new Object[][]{
                {1, 2},
                {0, 0.97},
                {7, 14.64},
                {800, 1600.20},
                {40, 80},
        };
        return combine(implementationsEightKataDataProvider(), parameters);
    }


    @DataProvider(name = "MpgToKPMDP")
    public Object[][] MpgToKPMData() {
        Object[][] parameters = new Object[][]{
                {3.54f, 10, 0.001f},
                {7.08f, 20, 0.001f},
                {10.62f, 30, 0.001f},
        };
        return combine(implementationsEightKataDataProvider(), parameters);
    }

    @DataProvider(name = "StringToNumberDP")
    public Object[][] stringToNumberImpls() {
        Object[][] parameters = new Object[][]{
                {"1234", 1234},
                {"605", 605},
                {"1405", 1405},
                {"-7", -7},
        };
        return combine(implementationsEightKataDataProvider(), parameters);
    }


    @DataProvider(name = "SquareOrSquareRootDP")
    public Object[][] squareOrSquareRootDP() {
        int[] input = new int[]{4, 3, 9, 7, 2, 1};
        int[] input2 = new int[]{100, 101, 5, 5, 1, 1};
        int[] input3 = new int[]{1, 2, 3, 4, 5, 6};
        Object[][] parameters = new Object[][]{
                {input, "[2, 9, 3, 49, 4, 1]"},
                {input2, "[10, 10201, 25, 25, 1, 1]"},
                {input3, "[1, 4, 9, 2, 25, 36]"}
        };
        return combine(implementationsEightKataDataProvider(), parameters);
    }

    @DataProvider(name = "twoDecimals")
    public Object[][] twoDecimalsImpl() {
        Object[][] parameters = new Object[][]{
                {1.68, 1.68134525},
                {1.44, 1.444444},
                {7.43, 7.43253525332},
                {800.24, 800.239321341},
                {40.12, 40.1231512321},
        };
        return combine(implementationsEightKataDataProvider(), parameters);
    }

    @DataProvider(name = "VolumeOfCuboidDP")
    public Object[][] volumeOfCuboidTestData() {
        Object[][] parameters = new Object[][]{
                {4, 1, 2, 2},
                {63, 6.3, 2, 5},
        };

        return combine(implementationsEightKataDataProvider(), parameters);
    }

    @DataProvider(name = "AmIWilsonDP")
    public Object[][] AmIWilsonTestData() {
        Object[][] parameters = new Object[][]{
                {5.0, true},
                {13.0, true},
                {563.0, true},
                {1.0, false}
        };
        return combine(implementationsEightKataDataProvider(), parameters);
    }

    @Test(dataProvider = "SquareOrSquareRootDP")
    public void testSquareOrSquareRoot(Eight eight, int[] input, String expected) {
        int[] actual = eight.squareOrSquareRoot(input);
        assertEquals(Arrays.toString(actual), expected, Arrays.toString(input));
    }


    @Test(dataProvider = "StringToNumberDP")
    public void testStringToNumber(Eight eight, String strData, int expected) {
        int actual = eight.stringToNumber(strData);
        assertEquals(actual, expected, "stringToNumber(" + strData + ")");
    }


    @Test(dataProvider = "VolumeOfCuboidDP")
    public void testGetVolumeOfCuboid(Eight eight, double expected, double length, double width, double height) {
        double actual = eight.getVolumeOfCuboid(length, width, height);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "MpgToKPMDP")
    public void testMpgToKPM(Eight eight, float expected, float data, float delta) {
        float actual = eight.mpgToKPM(data);
        assertEquals(actual, expected, delta);
    }

    @Test(dataProvider = "LitersDP")
    public void testLitersSampleTest1(Eight eigth, int expected, double data) {
        int actual = eigth.liters(data);
        assertEquals(actual, expected);

    }

    @DataProvider(name = "DivisibleByDP")
    public Object[][] DivisibleByData() {
        Object[][] parameters = new Object[][]{
                {new int[]{2, 4, 6}, new int[]{1, 2, 3, 4, 5, 6}, 2},
                {new int[]{3, 6}, new int[]{1, 2, 3, 4, 5, 6}, 3},
                {new int[]{0, 4}, new int[]{0, 1, 2, 3, 4, 5, 6}, 4}
        };
        return combine(implementationsEightKataDataProvider(), parameters);
    }

    @Test(dataProvider = "DivisibleByDP")
    public void testDivisibleBySampleTest(Eight eigth, int[] expected, int[] data, int divider) {
        int[] actual = eigth.divisibleBy(data, divider);
        System.out.println(Arrays.toString(actual) + " " + Arrays.toString(expected));
        assertEquals(Arrays.toString(actual), Arrays.toString(expected));

    }

    @Test(dataProvider = "twoDecimals")
    public void testTwoDecimalPlaces(Eight eight, double expected, double data) {
        double actual = eight.twoDecimalPlaces(data);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "AmIWilsonDP")
    public void testAmIWilson(Eight eight, double n, boolean expected) {
        boolean actual = eight.amIWilson(n);
        assertEquals(actual, expected);
    }
}

