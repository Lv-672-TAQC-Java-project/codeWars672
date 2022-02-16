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

    @DataProvider(name = "StringToNumberDP")
    public Object[][] stringToNumberImpls() {
        Object[][] parameters = new Object[][] {
                {"1234", 1234},
                {"605", 605},
                {"1405", 1405},
                {"-7", -7},
        };

        return combine(implementationsEightKataDataProvider(), parameters);
    }


    @Test(dataProvider = "LitersDP")
    public void testLitersSampleTest1(Eight eigth, int expected, double data) {
        int actual = eigth.liters(data);
        assertEquals(actual, expected);

    }

    @Test(dataProvider = "StringToNumberDP")
    public void testStringToNumber (Eight eight, String strData, int expected) {
        int actual = eight.stringToNumber(strData);
        assertEquals(actual, expected,"stringToNumber(" + strData + ")");
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
//    @Test
//    public void testSquareOrSquareRoot() {
//    }
//
//    @Test
//    public void testCountPositivesSumNegatives() {
//    }
//
@DataProvider(name = "StringToNumberDP")
public Object[][] stringToNumberTestData() {
    Object[][] parameters = new Object[][]{
            {12, "12"},
            {123, "123"},
            {7634, "7634"},
            {-2, "-2"}

    };
    return combine(implementationsEightKataDataProvider(), parameters);
}

    @Test(dataProvider = "StringToNumberDP")
    public void testStringToNumber(Eight eight, int expected, String data) {
        int actual = eight.stringToNumber(data);
        assertEquals(actual, expected);
    }
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