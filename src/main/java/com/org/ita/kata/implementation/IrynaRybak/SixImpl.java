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
        String[] strArray = resultSheet.replaceAll("76ers","").split(",");
        int count = 0, win = 0, draw = 0, loss = 0, scored = 0, conceded = 0, points = 3;
        String res = String.format("%s", toFind);
        if (!toFind.isEmpty()) {
            for (String str : strArray) {
                if (str.contains(toFind)) {
                    String[] teams = str.replaceFirst("[0-9]+", ", ").trim().split(", ");
                    String[] nums = str.replaceAll("[^0-9]+", " ").trim().split("\\s+");
                    if (teams.length != 2 || nums.length != 2) {
                        return null;
                    }
                    for (int i = 0; i < teams.length; i++) {
                        if (toFind.trim().equalsIgnoreCase(teams[i].replaceAll("[0-9]+", "").trim())) {
                            int tmp = i == 0 ? Integer.parseInt(nums[i]) - Integer.parseInt(nums[i + 1])
                                    : Integer.parseInt(nums[i]) - Integer.parseInt(nums[i - 1]);
                            if (tmp > 0) {
                                win += 1;
                            }
                            if (tmp < 0) {
                                loss += 1;
                            }
                            if (tmp == 0) {
                                draw += 1;
                            }
                            scored += Integer.parseInt(nums[i]);
                            conceded += i == 0 ? Integer.parseInt(nums[i + 1]) : Integer.parseInt(nums[i - 1]);
                            count++;
                        } else if (i == teams.length - 1 && count == 0) {
                            return String.format("%s:This team didn't play!", toFind);
                        }
                    }
                }
            }
            res += String.format(":W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d", win, draw, loss, scored, conceded, points * win);
        }
        return res;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
