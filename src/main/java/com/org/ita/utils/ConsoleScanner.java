package com.org.ita.utils;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleScanner {
    private final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public int readInt() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Incorrect format int. Try again!");
                sc.next();
            }
        }

    }

    public long readLong() {
        return 0;
    }

    public int[] readArrayInt() {
        return null;
    }

    public float readFloat() {
        return 0;
    }

    public double readDouble() {
        return 0;
    }

    public double[] readDoubleArray() {

        return null;
    }

    public String readString() {
        return null;
    }

    public String[] readStringArray() {
        return null;
    }

    public BigInteger readBigInteger() {
        return null;
    }

}
