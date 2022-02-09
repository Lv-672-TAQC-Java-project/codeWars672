package com.org.ita.kata.implementation.KaterynaMushynska;

import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String[] arr = book.replaceAll("[^a-zA-Z0-9\n. ]", "").split("[\\n]+");
        double balance = Double.parseDouble(arr[0]);
        double total = 0;
        int count = 0;
        StringBuilder builder = new StringBuilder("Original Balance: " + arr[0]);

        for (int i = 1; i < arr.length; i++) {
            String[] str = arr[i].split(" ");
            balance = balance - Double.valueOf(str[2]);
            BigDecimal bg1 = new BigDecimal(balance);
            total = total + Double.valueOf(str[2]);
            builder.append("\\r\\n").append(str[0] + " ").append(str[1] + " ").append(str[2]).append(" Balance ").append(bg1.setScale(2, RoundingMode.HALF_UP));
            count++;
        }
        BigDecimal bg2 = new BigDecimal(total);
        double averageExpense = total / count;
        BigDecimal bg3 = new BigDecimal(averageExpense);
        builder.append("\\r\\n").append("Total expense  ").append(bg2.setScale(2, RoundingMode.HALF_UP)).append("\\r\\n")
                .append("Average expense  ").append(bg3.setScale(2, RoundingMode.HALF_UP));
        return String.valueOf(builder);
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
