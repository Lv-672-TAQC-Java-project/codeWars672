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

    @DataProvider(name = "MpgToKPMDP")
    public Object[][] MpgToKPMData() {
        Object[][] parameters = new Object[][]{
                {3.54f, 10, 0.001f},
                {7.08f, 20, 0.001f},
                {10.62f, 30, 0.001f},
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


//    @Test
//    public void testGetVolumeOfCuboid() {
//    }
//
    @Test(dataProvider = "MpgToKPMDP")
    public void testMpgToKPM(Eight eight, float expected, float data, float delta) {
        float actual = eight.mpgToKPM(data);
        assertEquals(actual, expected, delta);
    }
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