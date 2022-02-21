package com.org.ita.kata.implementation.MikeRomanyshyn;

import com.org.ita.kata.Base;
import com.org.ita.kata.Six;

import java.util.ArrayList;

public class SixImpl extends Base implements Six {
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
        ArrayList<Double> rainfallMean = new ArrayList<>();
        String[] dataTown = new String[strng.length()];

        for(String str : strng.split("\n")) {
            dataTown = str.split(":");

            if (town.equals(dataTown[0])) {
                for (String dt : dataTown[1].split(",")) {
                    String[] value = dt.split("\\s");
                    rainfallMean.add(Double.parseDouble(value[1]));
                }
            }
        }
        double rainfallSum = 0;
        for (Double rm : rainfallMean) {
            rainfallSum += rm;
        }

        if (rainfallMean.size() > 0) {
            return rainfallSum / rainfallMean.size();
        } else {
            return -1.0;
        }
    }

    @Override
    public double variance(String town, String strng) {
        ArrayList<Double> rainfallVariance = new ArrayList<>();
        String[] dataTown = new String[strng.length()];

        for(String str : strng.split("\n")) {
            dataTown = str.split(":");

            if (town.equals(dataTown[0])) {
                for (String dt : dataTown[1].split(",")) {
                    String[] value = dt.split("\\s");
                    rainfallVariance.add(Double.parseDouble(value[1]));
                }
            }
        }

        double mean = mean(town, strng);
        double rainfallVarianceSum = 0;

        for (Double rv : rainfallVariance) {
            rainfallVarianceSum += Math.pow((rv - mean), 2);
        }

        if (rainfallVariance.size() > 0) {
            return rainfallVarianceSum / rainfallVariance.size();
        } else {
            return -1.0;
        }
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
