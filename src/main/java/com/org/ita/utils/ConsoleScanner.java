package com.org.ita.utils;

import java.math.BigInteger;
import java.util.*;

public class ConsoleScanner {
    private final Scanner sc = new Scanner(System.in).useLocale(Locale.US);
/*@Overraide*/
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
    /*@Overraide*/
    //for long
    public long readLong() {
        while (true) {
            if (sc.hasNextLong()) {
                return sc.nextLong();
            } else {
                System.out.println("Incorrect! Please enter long.");
                sc.next();
            }
        }

    }
    /*@Overraide*/
//for Array
    public int[] readArrayInt() {

        System.out.print("Length of the array:");
        int[] array = new int[readInt()];

        int i = 0;
        while (i < array.length) {
            String line = sc.next();
            if (line.matches("-?\\d+(\\.\\d+)?")) {
                array[i] = Integer.parseInt(line);
                i++;
            } else {
                System.out.println("Incorrect! Please enter integer.");
            }
        }
        return array;
    }
    /*@Overraide*/
    public float readFloat() {

        while (true) {
            if (sc.hasNextFloat()) {
                return sc.nextFloat();
            } else {
                System.out.println("Incorrect! Please enter float.");
                sc.next();
            }
         //   return  readFloat();
        }
    }
    /*@Overraide*/
    public double readDouble() {

        while (true) {
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("Incorrect! Please enter double.");
                sc.next();
            }
        }
    }
    /*@Overraide*/
    public double[] readDoubleArray() {
        System.out.print("Length of the array:");
        double[] array = new double[readInt()];

        int i = 0;
        while (i < array.length) {
            String line = sc.next();
            if (line.matches("-?\\d+(\\.\\d+)?")) {
                array[i] = Double.parseDouble(line);
                i++;
            } else {
                System.out.println("Incorrect! Please enter double.");
            }
        }
        return array;
    }
    /*@Overraide*/
    public String readString() {

        while (true) {
            if (sc.hasNext()) {
                return sc.nextLine();
            } else {
                System.out.println("Incorrect! Please enter String.");
                sc.next();
            }
        }
    }
    /*@Overraide*/
    public String[] readStringArray() {
        List<String> strings = new LinkedList<>();
        while (true) {
            if (sc.hasNext()) {
                String line = sc.nextLine();
                if (line.equals("")) break;
                strings.add(line);
            }
        }
        return (String[]) strings.toArray();
    }
    /*@Overraide*/

    public BigInteger readBigInteger() {
        while (true) {
            if (sc.hasNextBigInteger()) {
                return sc.nextBigInteger();
            } else {
                System.out.println("Incorrect! Please enter BigInteger.");
                sc.next();
            }
        }
    }
}
