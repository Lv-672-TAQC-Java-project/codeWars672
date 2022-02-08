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
        return  averageRainfall;
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
