package com.org.ita.kata.implementation.OlehPysko;

import com.org.ita.kata.Six;

public class SixImplO implements Six {
    @Override
    public long findNb(long m) {
        int count = 1;
        long findNb = 0;

        while (m > 0) {
            m = m - (long)(Math.pow(count,3));
            findNb++;
            count++;
        }
        if (m < 0) {
            return -1;
        }
        return findNb;
    }

    @Override
    public String balance(String book) {
        String [] bookArray = book.split("\n");
        String str;
        double balance2 = 0.00;
        double last = 0.00;
        double balance = Double.parseDouble(bookArray[0]);
        for (int i = 0; i < bookArray.length; i++) {
            if (i==0) {
                str = "Original_Balance:_"+bookArray[i];
                bookArray [0] = str;
            }
            else {
                String [] booArray = bookArray[i].split(" ");
                balance = (balance-Double.parseDouble(booArray[2]));
                bookArray [i] = booArray[0]+"_"+booArray[1]+"_"+booArray[2]+"_"+"Balance_"+String.format("%.2f",balance);
            }

        }
        for (int b = 0; b < bookArray.length; b++) {
            System.out.println(bookArray[b]);
            if (b == 0) {
                String [] sssss = bookArray[b].split("_");
                balance2 = Double.parseDouble(sssss[2]);
            }
            if (b == bookArray.length) {
                String [] ssssss = bookArray[b].split("_");
                last = Double.parseDouble(ssssss[2]);
            }

        }

        double expen = balance2 - last;
        double average = expen/(bookArray.length);

        String retr = String.join("\n", bookArray)+"\n"+"Total_expense_"+String.format("%.2f",expen)+"\n"+"Average_expense_"+String.format("%.2f",average);
        return retr;
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
