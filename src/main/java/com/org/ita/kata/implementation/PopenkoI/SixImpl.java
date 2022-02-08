package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String editBook = "Original Balance: ";
        double bal = 0;
        double count = 0;
        String[] words = book.replaceAll("\\s*(\\s|,|!|=|:|;|\\?|\\{|})\\s*"," ").replaceAll(" {2}"," ").split(" ");
        double constBal = Double.parseDouble(words[0]);
        for (String word : words){
            editBook = editBook.concat(word + " ");
            if (word.matches("\\d*(\\.)\\d\\d")) {
                if (constBal != Double.parseDouble(word)) {
                    bal = bal - Double.parseDouble(word);
                    bal = Double.parseDouble(String.format("%.2f", bal));
                    //для випатків типу 876.3, 243.5
                    if (String.valueOf(bal).matches("\\d*(\\.)\\d")) {
                        editBook = editBook.concat(" Balance ".concat(bal + "0\\r\\n"));
                    }else {
                        editBook = editBook.concat(" Balance ".concat(bal + "\\r\\n"));
                    }
                    count++;
                } else {
                    //для Original Balance: кінця рядка
                    editBook = editBook.concat("\\r\\n");
                    editBook = editBook.replaceAll(".00 ",".00");
                    bal = Double.parseDouble(word);
                }
                //щоб перевіряти лишні пробіли
                editBook = editBook.replace("\\r\\n ","\\r\\n");
            }
        }
        editBook = editBook.replaceAll(" {2}"," ");
        editBook = editBook.concat(String.format("Total expense  %.2f\\r\\nAverage expense  %.2f",(constBal - bal), (constBal - bal)/count));
        return editBook;
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
