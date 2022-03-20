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
        String result = "";
        int sum = 0, count = 0;
        if (lstOfArt.length != 0 && lstOf1stLetter.length != 0) {
            for (String letter : lstOf1stLetter) {
                for (String art : lstOfArt) {
                    if (art.split("")[0].equalsIgnoreCase(letter)) {
                        String number = art.replaceAll("\\D", "");
                        sum += art.isEmpty() ? 0 : Integer.parseInt(number);
                    }
                }
                count++;
                result += count != lstOf1stLetter.length ?
                        String.format("(%s : %d) - ", letter, sum) :
                        String.format("(%s : %d)", letter, sum);
                sum = 0;
            }
        }
        return result;
    }
}
