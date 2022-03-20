package com.org.ita.kata.implementation.IrynaRybak;

import com.org.ita.kata.Base;
import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.math.RoundingMode.HALF_UP;

public class SixImpl extends Base implements Six {

    @Override
    public long findNb(long m) {
        long count = 0;
        for (long i = 1; i < m; i++) {
            m = m - (long) Math.pow(i, 3);
            count++;
        }
        if (m != 0) {
            return -1;
        }
        return count;
    }

    @Override
    public String balance(String book) {
        String[] str = book.replaceAll("[^a-zA-Z0-9.\\s]", "").split("\\r?\\n");

        double total = Double.parseDouble(str[0]);
        String result = String.format("Original Balance: %s\\r\\n", new BigDecimal(total).setScale(2, HALF_UP));

        double tmp = total;
        for (int index = 1; index < str.length; index++) {
            Pattern pattern = Pattern.compile("\\d+\\.*\\d+$");
            Matcher matcher = pattern.matcher(str[index]);
            while (matcher.find()) {
                double balance = tmp - Double.parseDouble(matcher.group());
                tmp = balance;
                result += String.format("%s Balance %s\\r\\n", str[index], new BigDecimal(balance).setScale(2, HALF_UP));
            }
        }
        double totalExpense = total - tmp;
        double averageExpense = (total - tmp) / (str.length - 1);
        result += String.format("Total expense  %s\\r\\nAverage expense  %s", new BigDecimal(totalExpense).setScale(2, HALF_UP),
                new BigDecimal(averageExpense).setScale(2, HALF_UP));
        return result;
    }

    @Override
    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        double sum = 0, count = 0;
        if (!strng.isEmpty() && !town.isEmpty()) {
            String[] str = strng.split("\\n");
            for (int i = 0; i < str.length; i++) {
                String[] arr = str[i].split("\\:");
                for (String string : arr) {
                    if (town.equalsIgnoreCase(string)) {
                        Pattern pattern = Pattern.compile("\\d+\\.*\\d+");
                        String number = arr[1].replaceAll("[a-zA-Z]", "");
                        Matcher matcher = pattern.matcher(number);
                        while (matcher.find()) {
                            sum += Double.parseDouble(number.substring(matcher.start(), matcher.end()));
                            count++;
                        }
                    }
                }
            }
        }
        return count > 0 ? (sum / count) : -1;
    }

    @Override
    public double variance(String town, String strng) {
        double variance = 0;
        if (!strng.isEmpty() && !town.isEmpty()) {
            String[] str = strng.split("\\n");
            for (int i = 0; i < str.length; i++) {
                String[] arr = str[i].split("\\:");
                for (String string : arr) {
                    if (town.equalsIgnoreCase(string)) {
                        double means = mean(town, strng);
                        Pattern pattern = Pattern.compile("\\d+\\.*\\d+");
                        String number = arr[1].replaceAll("[a-zA-Z]", "");
                        Matcher matcher = pattern.matcher(number);
                        while (matcher.find()) {
                            double tmpNum = Double.parseDouble(number.substring(matcher.start(), matcher.end()));
                            variance += Math.pow(tmpNum - means, 2);
                        }
                    }
                }
            }
        }
        return variance == 0 ? -1 : variance;
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
