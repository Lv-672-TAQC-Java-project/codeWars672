package com.org.ita.kata;

import com.org.ita.DataProviderUserImplementation;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SevenTest extends DataProviderUserImplementation {

    @Test
    public void testNewAvg() {
    }

    @Test
    public void testSeriesSum() {
    }

    @DataProvider(name = "Where is HeDP")
    public Object[][] whereIsHeTestData() {
        Object[][] parameters = new Object[][]{
                {2, 3, 1, 1},
                {3, 5, 2, 3},
        };

        return combine(implementationsSevenKataDataProvider(), parameters);
    }

    @Test(dataProvider = "Where is HeDP")
    public void testWhereIsHe(Seven seven, int expected, int p, int bef, int aft) {
        int actual = seven.whereIsHe(p, bef, aft);
        assertEquals(actual, expected);
    }
}
