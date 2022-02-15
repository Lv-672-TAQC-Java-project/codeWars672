package com.org.ita.kata;


import com.org.ita.DataProviderUserImplementation;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

    @DataProvider(name = "VolumeOfCuboidDP")
    public Object[][] volumeOfCuboidTestData() {
        Object[][] parameters = new Object[][]{
                {4, 1, 2, 2},
                {63, 6.3, 2, 5},
        };

        return combine(implementationsEightKataDataProvider(), parameters);
    }

    @Test(dataProvider = "VolumeOfCuboidDP")
    public void volumeOfCuboidTest(Eight eight, double expected, double length, double width, double height) {
        double actual = eight.getVolumeOfCuboid(length, width, height);
        assertEquals(actual, expected);
    }

//    @Test
//    public void testMpgToKPM() {
//    }
//
//    @Test
//    public void testSquareOrSquareRoot() {
//    }
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