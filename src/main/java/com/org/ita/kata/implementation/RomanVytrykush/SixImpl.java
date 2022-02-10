package com.org.ita.kata.implementation.RomanVytrykush;

import com.org.ita.kata.Six;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Double> townMeanMap = createTownMeanMap(strng);
        return townMeanMap.getOrDefault(town, -1.0);
    }

    private static Map<String, Double> createTownMeanMap(String strng) {
        Map<String, Double> townMeanMap = new HashMap<>();
        String[] townAndMonthRainfalls = strng.split("\n");
        for (String townAndMonth : townAndMonthRainfalls) {
            String targetTown = townAndMonth.split(":")[0];
            String[] monthRainfalls = townAndMonth.split(":")[1].split(",");
            double sumOfRecords = 0;

            for (String month : monthRainfalls) {
                sumOfRecords += Double.parseDouble(month.split(" ")[1]);
            }
            townMeanMap.put(targetTown, sumOfRecords / 12);
        }
        return townMeanMap;
    }
    @Override
    public double variance(String town, String strng) {
        Map<String, Double> townVarianceMap = createTownVarianceMap(town, strng);
        return townVarianceMap.getOrDefault(town, -1.0);
    }

    private Map<String, Double> createTownVarianceMap(String town, String strng) {
        Map<String, Double> townVarianceMap = new HashMap<>();
        double meanAvg = mean(town, strng);
        String[] townAndMonthRainfalls = strng.split("\n");

        for (String townAndMonth : townAndMonthRainfalls) {
            String targetTown = townAndMonth.split(":")[0];
            String[] monthRainfalls = townAndMonth.split(":")[1].split(",");
            double sumOfVarianceRecords = 0;

            for (String month : monthRainfalls) {
                double rainfall = Double.parseDouble(month.split(" ")[1]);
                sumOfVarianceRecords += Math.pow((rainfall - meanAvg), 2);
                System.out.println(sumOfVarianceRecords);
            }
            townVarianceMap.put(targetTown, sumOfVarianceRecords / 12);
        }
        return townVarianceMap;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        HashMap<String, Integer> artMap = new HashMap<>();

        for (String list : lstOfArt) {
            String[] art = list.split(" ");
            String firstLetter = art[0].substring(0, 1);
            int quantity = Integer.parseInt(art[1]);

            artMap.put(firstLetter, artMap.getOrDefault(firstLetter, 0) + quantity);
        }
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            Integer sumQuantity = artMap.get(lstOf1stLetter[i]) == null ? 0 : artMap.get(lstOf1stLetter[i]);
            lstOf1stLetter[i] = "(" + lstOf1stLetter[i] + " : " + sumQuantity + ")";
        }
        return String.join(" - ", lstOf1stLetter);
    }
}
