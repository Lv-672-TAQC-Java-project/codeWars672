package com.org.ita.kata.YevgenAleksandrovich;

import com.org.ita.kata.Six;

public class Siximpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }
/*Easy balance Checking*/
    @Override
    public String balance(String book) {
        String redactedBook = book.replaceAll("[^a-zA-Z0-9 .\n]", "");
        redactedBook = redactedBook.trim().replaceAll(" +", " ");
        String[] splitBook = redactedBook.split("\n");
        double originalBalance = Double.valueOf(splitBook[0]);
        String returnLine = "Original Balance: " + String.format("%.2f", originalBalance) + "\\r\\n";
        double newBalance = originalBalance;
        double totalExpense = 0;
        int count = 0;
        for (int i = 1; i < splitBook.length; i++) {
            if (!(splitBook[i].isEmpty())) {
                String[] splitLine = splitBook[i].split(" ");
                Double value = Double.valueOf(splitLine[2]);
                newBalance = newBalance - value;
                returnLine = returnLine + splitLine[0] + " " + splitLine[1] + " " + String.format("%.2f", value)
                        + " Balance " + String.format("%.2f", newBalance) + "\\r\\n";
                totalExpense = totalExpense + value;
                count++;
            } else {
                count--;
            }
        }
        return returnLine + "Total expense  " + String.format("%.2f", totalExpense) + "\\r\\nAverage expense  "
                + String.format("%.2f", (totalExpense / count));
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
        return null;
    }
}
