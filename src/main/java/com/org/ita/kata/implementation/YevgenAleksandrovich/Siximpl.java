package com.org.ita.kata.implementation.YevgenAleksandrovich;

import com.org.ita.kata.Six;

public class Siximpl implements Six {
    /*Build a oile of cubes*/
    @Override
    public long findNb(long m) {
        if (m == 0) return 0;
        long value = m;
        long i;

        for (i = 1; value > 0; i++) {
            value -= (long) Math.pow(i, 3);
        }

        if (value == 0) return i - 1;
        else return -1;
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

        return x / (Math.sqrt(1 + x) + 1);
    }

    /*Rainfall*/
    @Override
    public double mean(String town, String strng) {
        if (town == null && strng == null) {
            return -1;
        }
        String[] splitStrng = strng.split("\n");
        String line = "";
        String temp = "";
        for (String s : splitStrng) {
            temp = s;
            if (town.equals(temp.split(":")[0])) {
                line = s;
                System.out.println(line);
                break;
            }
        }
        if (line.length() == 0) {
            return -1;
        }
        String[] arrOfLine = line.replaceAll("[^0-9.0-9 ]", "").trim().split(" ");
        double sum = 0;
        for (String s : arrOfLine) {
            sum += Double.parseDouble(s);
        }
        return sum / (double) (arrOfLine.length);
    }

    /*Rainfall*/
    @Override
    public double variance(String town, String strng) {
        double meanValue = mean(town, strng);
        double sum = 0;
        String[] search = strng.split("\n");
        String strTown = "";
        for (String searching : search) {
            if (searching.contains(town + ":")) {
                strTown = searching;
            }
        }
        if (strTown.equals("")) {
            return -1;
        }
        strTown = strTown.replace(town + ":", "");
        String[] cityData = strTown.split(",");
        for (String i : cityData) {
            String[] monthData = i.split(" ");
            double diff = Double.valueOf(monthData[1]) - meanValue;
            sum = sum + diff * diff;
        }
        return sum / cityData.length;
    }


    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    /*Help the Bookseller*/
    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        String returnString = "";
        for (String firstLetter : lstOf1stLetter) {
            int sum = 0;
            for (String art : lstOfArt) {
                if (art.charAt(0) == firstLetter.charAt(0)) {
                    String[] split = art.split(" ");
                    sum = sum + Integer.parseInt(split[1]);
                }
            }
            returnString = returnString + "(" + firstLetter + " : " + sum + ") - ";
        }
        return returnString.substring(0, returnString.length() - 3);
    }
}

