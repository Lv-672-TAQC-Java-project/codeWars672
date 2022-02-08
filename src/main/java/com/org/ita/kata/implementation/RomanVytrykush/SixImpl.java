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
