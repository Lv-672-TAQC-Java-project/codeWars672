package com.org.ita.kata.implementation.YevgenAleksandrovich;

import com.org.ita.kata.Six;

public class Siximpl implements Six {
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
    /*Rainfall*/
    @Override
    public double mean(String town, String strng) {
        if (town == null && strng == null) {
            return -1;
        }
        String[] splitStrng = strng.split("\n");
        String line = "";
        String temp = "";
        for (String s: splitStrng){
            temp = s;
            if (town.equals(temp.split(":")[0])){
                line = s;
                System.out.println(line);
                break;
            }
        }
        if (line.length() == 0){
            return -1;
        }
        String[] arrOfLine = line.replaceAll("[^0-9.0-9 ]", "").trim().split(" ");
        double sum = 0;
        for (String s: arrOfLine){
            sum += Double.parseDouble(s);
        }
        return sum /(double)(arrOfLine.length);
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

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
