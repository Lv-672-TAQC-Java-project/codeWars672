package com.org.ita.kata.implementation.KaterynaMushynska;

import com.org.ita.kata.Six;

import java.util.ArrayList;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return null;
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
        if (lstOfArt.length == 0){
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
