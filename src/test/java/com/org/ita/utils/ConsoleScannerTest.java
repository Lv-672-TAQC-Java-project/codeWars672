package com.org.ita.utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.*;
import java.math.BigInteger;
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

    @DataProvider(name = "ReadBigIntegerDP")
    public Object[][] ReadBigIntegerDP() {
        return new Object[][]{
                {"fdj 56   ", BigInteger.valueOf(56)},
                {"-2489", BigInteger.valueOf(-2489)},
                {"2.68 947", BigInteger.valueOf(947)},
                {"3e-15 jlm 25", BigInteger.valueOf(25)},
                {"87 klhn", BigInteger.valueOf(87)},
                {"-142 1.2 126", BigInteger.valueOf(-142)},
        };
    }

    @DataProvider(name = "NotValidReadIntDP")
    public Object[][] NotValidReadIntDP() {
        return new Object[][]{
                {"fdj 56", "Incorrect! Try again!\n", Integer.valueOf(56)},
                {"-2489", "", Integer.valueOf(-2489)},
                {"2.68 947", "Incorrect! Try again!\n", Integer.valueOf(947)},
                {"3e-15 25", "Incorrect! Try again!\n", Integer.valueOf(25)},
                {"87", "", Integer.valueOf(87)},
                {"1.2 126a -142 ", "Incorrect! Try again!\nIncorrect! Try again!\n", Integer.valueOf(-142)},
        };
    }

    @DataProvider(name = "ReadLongDP")
    public Object[][] ReadLongDP() {
        return new Object[][]{
                {"7", "Please enter a number: ", Long.valueOf(7)},
                {"-9223372036854775808", "Please enter a number: ", Long.MIN_VALUE},
                {"9223372036854775807", "Please enter a number: ", Long.MAX_VALUE},
                {"-9223372036854775809 0", "Please enter a number: Incorrect! Please enter long.\n", Long.valueOf(0)},
                {"9223372036854775808 -1", "Please enter a number: Incorrect! Please enter long.\n", Long.valueOf(-1)},
                {"3.14 255", "Please enter a number: Incorrect! Please enter long.\n", Long.valueOf(255)},
                {"qwerty null -256", "Please enter a number: Incorrect! Please enter long.\n" +
                        "Incorrect! Please enter long.\n", Long.valueOf(-256)}
        };
    }

    @Test(dataProvider = "NotValidReadIntDP")
    public void testNotValidReadInt(String input, String outputExpected, int expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        int actual = consoleScanner.readInt();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual, expected, "int");
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), outputExpected, "outputExpected");
        softAssert.assertAll();
    }

    @Test(dataProvider = "ReadLongDP")
    public void testReadLong(String input, String outputExpected, long expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        long actual = consoleScanner.readLong();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual, expected, "testReadLong");
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""),
                outputExpected, "outputExpected");
        softAssert.assertAll();
    }

    @DataProvider(name = "NotValidFloat")
    public Object[][] readNotValidFloat() {
        return new Object[][]{
                {"two_point_zero 2.0", "Please enter a number: Incorrect format float. Try again!\n",
                        Float.valueOf(2.0f)},
                {"4.5", "Please enter a number: ", Float.valueOf(4.5f)},
                {"adsabc 0.678","Please enter a number: Incorrect format float. Try again!\n",
                        Float.valueOf(0.678f)},
                {"3.41ada413 3.41413","Please enter a number: Incorrect format float. Try again!\n",
                        Float.valueOf(3.41413f)},
                {"45y6 456","Please enter a number: Incorrect format float. Try again!\n",
                        Float.valueOf(456.0f)},
        };
    }

    @DataProvider(name = "ReadArrayIntDP")
    public Object[][] ReadArrayIntData(){
        return new Object[][] {
                {"4 1 2 3 4", new int[]{1, 2, 3, 4}},
                {"6 1 10 22 5 9 dff 11", new int[]{1, 10, 22, 5, 9, 11}},
                {"5 530 bcd -3  41 365 -40 abc", new int[]{530, -3, 41, 365, -40}},
                {"2 3.12 false 1 3.12 0", new int[]{1, 0}}
        };
    }

    @Test(dataProvider = "ReadArrayIntDP")
    public void testReadArrayInt(String input, int[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        int[] actual = consoleScanner.readArrayInt();
        assertEquals(actual, expected);

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

    @Test(dataProvider = "NotValidFloat")
    public void testReadNotValidFloat(String input, String expectedOutput, float expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        float actual = consoleScanner.readFloat();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual, expected);
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedOutput);
        softAssert.assertAll();
    }

    @DataProvider(name = "readDoubleDP")
    public Object[][] readDoubleDP() {
        return new Object[][]{
                {"9.9", 9.9},
                {"asdf 5.6", 5.6},
                {"4", 4.0},
                {"aa bb 4.65", 4.65},
        };
    }

    @Test(dataProvider = "readDoubleDP")
    public void testReadDouble(String input, double expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        double actual = consoleScanner.readDouble();
        assertEquals(actual, expected);
    }

    @DataProvider(name = "arrayDoubleDP")
    public Object[][] arrayDoubleDP() {
        return new Object[][]{
                {"4 1 2 2 6", "[1.0, 2.0, 2.0, 6.0]"},
                {"6 1 -2 3 -3 3 0", "[1.0, -2.0, 3.0, -3.0, 3.0, 0.0]"},
                {"5 1 -2 8 -3 7", "[1.0, -2.0, 8.0, -3.0, 7.0]"},
                {"4 -2 8 -3 7 rtyrhhhyy", "[-2.0, 8.0, -3.0, 7.0]"},
                {"3 asdfgh 8 -3 7", "[8.0, -3.0, 7.0]"},
                {"5 1 -2 asd4fgh 8 -3 7", "[1.0, -2.0, 8.0, -3.0, 7.0]"},
                {"4 1 -2 asd4fgh 8, -3 7", "[1.0, -2.0, -3.0, 7.0]"}
        };
    }

    @Test(dataProvider = "arrayDoubleDP")
    public void testReadArrayDouble(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        String actual = Arrays.toString(consoleScanner.readDoubleArray());
        //assertEquals(actual, expected);
        assertEquals(actual, expected);

    }


    @Test
    public void testReadString() {
    }

    @DataProvider(name = "stringArrayDP")
    public Object[][] stringArrayDP() {
        return new Object[][]{
                {"1\nUkraine\n", "[Ukraine]"},
                {"3\nTom\nJohn\nok\n", "[Tom, John, ok]"},
                {"3\n123\n345\n222\n", "[123, 345, 222]"},
                {"5\nABAR 200\nCDXE 500\nBKWR 250\nBTSQ 890\nDRTY 600\n", "[ABAR 200, CDXE 500, BKWR 250, BTSQ 890, DRTY 600]"},
                {"2\nA\nB\n", "[A, B]"},
                {"7s\n7\ntestStringArrayMethod\n333\n-123\n34a\n$\n$25\nseptember\n", "[testStringArrayMethod, 333, -123, 34a, $, $25, september]"},
        };
    }

    @Test(dataProvider = "stringArrayDP")
    public void testReadStringArray(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        String actual = Arrays.toString(consoleScanner.readStringArray());
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "ReadBigIntegerDP")
    public void testReadBigInteger(String input, BigInteger expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        BigInteger actual = consoleScanner.readBigInteger();
        assertEquals(actual, expected);
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