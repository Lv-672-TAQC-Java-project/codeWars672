package com.org.ita.kata;

import com.org.ita.DataProviderUserImplementation;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SixTest extends DataProviderUserImplementation {

    @DataProvider(name = "FindNbDP")
    public Object[][] FindNbData() {
        Object[][] parameters = new Object[][]{
                {2022, 4183059834009L},
                {-1, 24723578342962L},
                {4824, 135440716410000L},
                {3568, 40539911473216L},
        };
        return combine(implementationsSixKataDataProvider(), parameters);
    }

    @Test(dataProvider = "FindNbDP")
    public void testFindNb(Six six, long expected, long data) {
        long actual = six.findNb(data);
        assertEquals(actual, expected);
    }

    @Test
    public void testBalance() {
    }

    @Test
    public void testF() {
    }

    @Test
    public void testMean() {
    }

    @Test
    public void testVariance() {
    }

    @Test
    public void testNbaCup() {
    }

    @Test
    public void testStockSummary() {
    }
}