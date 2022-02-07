package com.org.ita.kata.implementation.RomanVytrykush;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        double inTotal = 0;
        int counter = 0;

        String newBook = book.replaceAll("[^a-zA-Z0-9 .\n]", "");
        newBook = newBook.trim().replaceAll(" +", " ");
        String [] strArr = newBook.split("[\\n]+");
        double prevBalance = Double.parseDouble(strArr[0]);
        StringBuilder newBalance = new StringBuilder();
        newBalance.append("Original Balance: " + strArr[0]);

        for (int i = 1; i < strArr.length; i++) {
            String[] splitln = strArr[i].split("[ ]+");
            prevBalance = prevBalance - Double.parseDouble(splitln[2]);
            inTotal = inTotal + Double.parseDouble(splitln[2]);
            String inter = String.format("\\r\\n%s %s %s Balance %.2f", splitln[0], splitln[1], splitln[2], prevBalance);
            counter++;

            newBalance.append(inter);
        }
        newBalance = newBalance.append(String.format
                ("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", inTotal, inTotal / counter));
        return newBalance.toString();
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
