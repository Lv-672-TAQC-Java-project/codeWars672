package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Six;

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
        double rainfall = 0;
        double count = 0;
        String[] citiesFromStrng = strng.split("\n");
        for (String city : citiesFromStrng) {
            String[] words = city.split("\\s*(\\s|,|!|:)\\s*");
            if (town.equalsIgnoreCase(words[0])) {
                for (String word : words) {
                    if (word.matches("\\d*(\\.)\\d")) {
                        rainfall = rainfall + Double.parseDouble(word);
                        count++;
                    }
                }
            }
        }
        return rainfall / count;
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
