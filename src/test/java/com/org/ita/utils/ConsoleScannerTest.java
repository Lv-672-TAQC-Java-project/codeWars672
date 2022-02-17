package com.org.ita.utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class ConsoleScannerTest {
    private InputStream in;

    @BeforeMethod
    public void beforeMethod() {
        in = System.in;
    }

    @AfterMethod
    public void afterMethod() {
        System.setIn(in);
    }

    @Test
    public void testReadInt() {
    }

    @Test
    public void testReadLong() {
    }

    @Test
    public void testReadArrayInt() {
    }

    @DataProvider(name = "readFloat")
    public Object[][] readFloat() {
        return new Object[][]{
                {"2", 2.0f},
                {"ads 0.678 abc", 0.678f},
                {"3.41413", 3.41413f},
                {"456", 456.0f},
        };
    }

    @Test(dataProvider = "readFloat")
    public void testReadFloat(String input, float expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        float actual = consoleScanner.readFloat();
        assertEquals(actual, expected);
    }

    @Test
    public void testReadDouble() {
    }

    @Test
    public void testReadDoubleArray() {
    }

    @Test
    public void testReadString() {
    }

    @Test
    public void testReadStringArray() {
    }

    @Test
    public void testReadBigInteger() {
    }

    @DataProvider(name = "arrayLongDP")
    public Object[][] arrayLongDP() {
        return new Object[][]{
                {"4 1 2 2 6", "[1, 2, 2, 6]"},
                {"6 1 -2 3 -3 3 0", "[1, -2, 3, -3, 3, 0]"},
                {"5 1 -2 8 -3.0 7 0", "[1, -2, 8, 7, 0]"},
                {"4 -2 8 -3 7 rtyrhhhyy", "[-2, 8, -3, 7]"},
                {"3 asdfgh 8 -3 7", "[8, -3, 7]"},
                {"5 1 -2 asd4fgh 8 -3 7", "[1, -2, 8, -3, 7]"},
                {"4 1 -2 asd4fgh 8, -3 7", "[1, -2, -3, 7]"}
        };
    }

    @Test(dataProvider = "arrayLongDP")
    public void testReadArrayLong(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        String actual = Arrays.toString(consoleScanner.readArrayLong());
        assertEquals(actual, expected);
    }
}