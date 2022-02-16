package com.org.ita.kata;

import com.org.ita.DataProviderUserImplementation;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SevenTest extends DataProviderUserImplementation {


    @DataProvider(name = "NewAvgDP")
    public Object[][] impls() {
        double[] a1 = new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0};
        double[] a2 = new double[]{14, 30, 5, 7, 9, 11, 15};
        //double[] a3 = new double[] {14, 30, 5, 7, 9, 11, 15};
        Object[][] parameters = new Object[][]{
                {a1, 90, 628},
                {a2, 92, 645},
        };
        return combine(implementationsSevenKataDataProvider(), parameters);
    }

    @DataProvider(name = "Where is HeDP")
    public Object[][] whereIsHeTestData() {
        Object[][] parameters = new Object[][]{
                {2, 3, 1, 1},
                {3, 5, 2, 3},
        };

        return combine(implementationsSevenKataDataProvider(), parameters);
    }


    @Test(dataProvider = "NewAvgDP")
    public void testNewAvgTest1(Seven seven, double[] data1, double data2, long expected) {
        long actual = seven.newAvg(data1, data2);
        assertEquals(actual, expected);
    }

    @Test
    public void testSeriesSum() {
    }


    @Test(dataProvider = "Where is HeDP")
    public void testWhereIsHe(Seven seven, int expected, int p, int bef, int aft) {
        int actual = seven.whereIsHe(p, bef, aft);
        assertEquals(actual, expected);
    }
}
