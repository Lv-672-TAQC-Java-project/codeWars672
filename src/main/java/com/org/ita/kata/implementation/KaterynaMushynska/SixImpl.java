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
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
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
        return null;
    }
}
