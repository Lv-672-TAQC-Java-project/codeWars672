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


    @Test(dataProvider = "LitersDP")
    public void testLitersSampleTest1(Eight eigth, int expected, double data) {
        int actual = eigth.liters(data);
        assertEquals(actual, expected);

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

    @Test(dataProvider = "SquareOrSquareRootDP")
    public void testSquareOrSquareRoot(Eight eight, int[] input, String expected) {
        int[] actual = eight.squareOrSquareRoot(input);
        assertEquals(Arrays.toString(actual), expected, Arrays.toString(input));
    }


//    @Test(dataProvider = "userImlp")
//    public void testLitersSampleTest1(Eight eigth) {
//        int actual = eigth.liters(2);
//        assertEquals(1, actual);
//
//    }
//
//    @Test(dataProvider = "userImlp")
//    public void testLitersSampleTest2(Eight eigth) {
//
//        int actual = eigth.liters(0.97);
//        assertEquals(0, actual);
//
//    }
//
//    @Test(dataProvider = "userImlp")
//    public void testLitersSampleTest3(Eight eigth) {
//
//        int actual = eigth.liters(14.64);
//        assertEquals(7, actual);
//
//    }
//
//    @Test(dataProvider = "userImlp")
//    public void testLitersSampleTest4(Eight eigth) {
//
//        int actual = eigth.liters(1600.20);
//        assertEquals(800, actual);
//
//    }
//
//    @Test(dataProvider = "userImlp")
//    public void testLitersSampleTest5(Eight eigth) {
//
//        int actual = eigth.liters(80);
//        assertEquals(40, actual);
//
//    }


//    @Test
//    public void testGetVolumeOfCuboid() {
//    }
//
//    @Test
//    public void testMpgToKPM() {
//    }
//
//
//    @Test
//    public void testCountPositivesSumNegatives() {
//    }
//
//    @Test
//    public void testStringToNumber() {
//    }
//
//    @Test
//    public void testAmIWilson() {
//    }
//
//    @Test
//    public void testTwoDecimalPlaces() {
//    }
//
//    @Test
//    public void testDivisibleBy() {
//    }
}