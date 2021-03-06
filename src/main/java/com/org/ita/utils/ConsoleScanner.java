package com.org.ita.utils;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class ConsoleScanner {
    private final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public int readInt() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Incorrect! Try again!");
                sc.next();
            }
        }
    }

    public long readLong() {
        System.out.print("Please enter a number: ");
        while (true) {
            if (sc.hasNextLong()) {
                return sc.nextLong();
            } else {
                System.out.println("Incorrect! Please enter long.");
                sc.next();
            }
        }
    }

    public int[] readArrayInt() {
        System.out.println("Length of the array");
        int[] array = new int[readInt()];
        int i = 0;
        System.out.println("Enter the values of an array of length [" + array.length + "]");

        while (i < array.length) {
            array[i] = readInt();
            i++;
        }
        return array;
    }

    public float readFloat() {
        System.out.print("Please enter a number: ");
        while (true) {
            if (sc.hasNextFloat()) {
                return sc.nextFloat();
            } else {
                System.out.println("Incorrect format float. Try again!");
                sc.next();
            }
        }
    }

    public double readDouble() {
        System.out.print("Please enter a number: ");
        while (true) {
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("Incorrect format double. Try again!");
                sc.next();
            }
        }
    }

    public double[] readDoubleArray() {
        System.out.println("Length of the array");
        double[] array = new double[readInt()];
        int i = 0;
        while (i < array.length) {
            array[i] = readDouble();
            i++;
        }
        return array;
    }

    public String readString() {
        while (true) {
            System.out.print("New line: ");
            if (sc.hasNext()) {
                return sc.nextLine();
            } else {
                System.out.println("Incorrect! Please enter String.");
                sc.next();
            }
        }
    }

    public String[] readStringArray() {
        String[] array;
        while (true) {
            System.out.println("Length of the array");
            String length = sc.nextLine();
            System.out.println(length);
            if (isNumeric(length)) {
                array = new String[Integer.parseInt(length)];
                int i = 0;
                while (i < array.length) {
                    array[i] = sc.nextLine();
                    i++;
                }
                return array;
            } else {
                System.out.println("Incorrect format int. Try again!");
            }
        }
    }

    public BigInteger readBigInteger() {
        System.out.print("Please enter a number: ");
        while (true) {
            if (sc.hasNextBigInteger()) {
                return sc.nextBigInteger();
            } else {
                System.out.println("Incorrect! Please enter BigInteger.");
                sc.next();
            }
        }
    }

    public long[] readArrayLong() {
        System.out.println("Length of the array");
        long[] array = new long[readInt()];
        int i = 0;
        while (i < array.length) {
            array[i] = readLong();
            i++;
        }
        return array;
    }
}
