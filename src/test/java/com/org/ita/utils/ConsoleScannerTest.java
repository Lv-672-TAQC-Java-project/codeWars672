package com.org.ita.utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
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
        return new Object[][] {
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
        softAssert.assertEquals(actual, expected,"testReadLong");
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""),
                outputExpected, "outputExpected");
        softAssert.assertAll();
    }

    @DataProvider(name = "ReadArrayIntDP")
    public Object[][] ReadArrayIntData(){
        return new Object[][] {
                {"4 1 2 3 4", "[1, 2, 3, 4]"},
                {"6 1 10 22 5 9 dff 11", "[1, 10, 22, 5, 9, 11]"},
                {"5 530 bcd -3  41 365 -40 abc", "[530, -3, 41, 365, -40]"},
                {"2 3.12 false 1 3.12 0", "[1, 0]"}
        };
    }

    @Test(dataProvider = "ReadArrayIntDP")
    public void testReadArrayInt(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        String actual = Arrays.toString(consoleScanner.readArrayInt());
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

    @Test
    public void testReadStringArray() {
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