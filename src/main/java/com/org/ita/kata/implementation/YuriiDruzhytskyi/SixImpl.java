package com.org.ita.kata.implementation.YuriiDruzhytskyi;

import com.org.ita.kata.Base;
import com.org.ita.kata.Six;

import java.util.Arrays;

public class SixImpl extends Base implements Six {
    @Override
    public long findNb(long m) {
        long n = 0;
        long sum = 0;
        while (sum < m) {
            n++;
            sum += (long) Math.pow(n, 3);
        }
        if (sum == m)
            return n;
        else
            return -1;
    }

    @Override
    public String balance(String book) {
        String[] lines = book
                .replaceAll("[^\\w\n. ]", "")
                .split("\n");

        StringBuilder report = new StringBuilder("Original Balance: " + lines[0] + (book = "\\r\\n"));

        double balance = Double.parseDouble(lines[0]);
        double sum = 0;

        for (int i = 1; i < lines.length; i++) {
            sum += Double.parseDouble(lines[i].split("\\s+")[2]);

            report
                    .append(lines[i]
                            .trim()
                            .replaceAll("\\s+", " "))
                    .append(String.format(" Balance %.2f", balance - sum))
                    .append(book);
        }

        return report + String.format("Total expense  %.2f%sAverage expense  %.2f", sum, book, sum / (lines.length - 1));
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
