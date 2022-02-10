package com.org.ita.kata.implementation.YuriiDruzhytskyi;

import com.org.ita.kata.Six;

import java.util.Arrays;

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
        return x / (1 + Math.sqrt(++x));
    }

    @Override
    public double mean(String town, String strng) {
        return Arrays.stream(strng.split("\n"))
                .filter(line -> line.startsWith(town + ":"))
                .map(String::toLowerCase)
                .map(s -> s.replaceAll(":| |[a-z]", ""))
                .findFirst()
                .map(s -> Arrays.stream(s.split(","))
                        .mapToDouble(Double::parseDouble)
                        .sum() / 12)
                .orElse(-1.0);
    }

    @Override
    public double variance(String town, String strng) {
        double average = mean(town, strng);

        return Arrays.stream(strng.split("\n"))
                .filter(line -> line.startsWith(town + ":"))
                .map(String::toLowerCase)
                .map(s -> s.replaceAll(":| |[a-z]", ""))
                .findFirst()
                .map(s -> Arrays.stream(s.split(","))
                        .mapToDouble(Double::parseDouble)
                        .map(x -> (x - average) * (x - average))
                        .sum() / 12)
                .orElse(-1.0);
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String result = "";
        int total = 0;

        for (int i = 0; i < lstOf1stLetter.length; i++) {
            String c = lstOf1stLetter[i];

            int sum = Arrays.stream(lstOfArt)
                    .filter(element -> element.startsWith(c))
                    .mapToInt(t -> Integer.valueOf(t.substring(t.indexOf(" ") + 1))).sum();

            total += sum;
            result += "".equals(result) ? "" : " - ";
            result += "(" + c + " : " + sum + ")";
        }

        return total == 0 ? "" : result;
    }
}
