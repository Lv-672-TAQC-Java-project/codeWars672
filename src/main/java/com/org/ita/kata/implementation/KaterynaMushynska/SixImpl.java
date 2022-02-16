package com.org.ita.kata.implementation.KaterynaMushynska;

import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long count = 0;
        for (int i = 0; i < m; i++) {
            long cubVol = (long) Math.pow((i + 1), 3);
            m = m - cubVol;
            count = count + 1;
        }
        if (m != 0) {
            return -1;
        }
        return count;
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
        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        ArrayList<Double> rainfall = new ArrayList<>();
        for (String str : strng.split("\\n")) {
            String[] data = str.split(":");
            if (town.equals(data[0])) {
                for (String s : data[1].split(",")) {
                    String[] temp = s.split("\\s");
                    rainfall.add(Double.parseDouble(temp[1]));
                }
            }
        }
        double averageRainfall = 0.0;
        for (Double d : rainfall) {
            averageRainfall += d;
        }
        averageRainfall /= rainfall.size();
        return averageRainfall;
    }

    @Override
    public double variance(String town, String strng) {
        ArrayList<Double> rainfall2 = new ArrayList<>();
        for (String s : strng.split("\\n")) {
            String[] data = s.split(":");
            if (town.equals(data[0])) {
                for (String str : data[1].split(",")) {
                    String[] temp = str.split("\\s");
                    rainfall2.add(Double.parseDouble(temp[1]));
                }
            }
        }
        double mean = mean(town, strng);
        double varianceRainfall = 0;
        for (Double d : rainfall2) {
            varianceRainfall += Math.pow((d - mean), 2);
        }
        varianceRainfall /= rainfall2.size();
        return varianceRainfall;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0) {
            return "";
        }
        int[] s = new int[lstOf1stLetter.length];
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < lstOf1stLetter.length; i++) {
            for (int j = 0; j < lstOfArt.length; j++) {
                if (lstOfArt[j].charAt(0) == lstOf1stLetter[i].charAt(0)) {
                    s[i] += Integer.parseInt(lstOfArt[j].replaceAll("\\D{1,}", ""));
                }
            }
            str.append(String.format("(%s : %d) - ", lstOf1stLetter[i], s[i]));
        }
        return (str.length() == 0) ? "" : str.replace(str.length() - 3, str.length(), "").toString();
    }
}
