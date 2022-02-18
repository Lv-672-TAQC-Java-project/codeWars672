package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Base;
import com.org.ita.kata.Six;

import java.util.ArrayList;
import java.util.Arrays;

public class SixImpl extends Base implements Six {
    @Override
    public long findNb(long m) {
        long counter = 0;
        int i = 1;
        while (m > 0) {
            m = m - (long) Math.pow(i, 3);
            counter = counter + 1;
            i++;
        }
        if (m != 0) {
            return -1;
        }
        return counter;
    }

    @Override
    public String balance(String book) {
        String editBook = "Original Balance: ";
        double bal = 0;
        double count = 0;
        String[] words = book.replaceAll("\\s*(\\s|,|!|=|:|;|\\?|\\{|})\\s*", " ").replaceAll(" {2}", " ").split(" ");
        double constBal = Double.parseDouble(words[0]);
        for (String word : words) {
            editBook = editBook.concat(word + " ");
            if (word.matches("\\d*(\\.)\\d\\d")) {
                if (constBal != Double.parseDouble(word)) {
                    bal = bal - Double.parseDouble(word);
                    bal = Double.parseDouble(String.format("%.2f", bal));
                    //для випатків типу 876.3, 243.5
                    if (String.valueOf(bal).matches("\\d*(\\.)\\d")) {
                        editBook = editBook.concat(" Balance ".concat(bal + "0\\r\\n"));
                    } else {
                        editBook = editBook.concat(" Balance ".concat(bal + "\\r\\n"));
                    }
                    count++;
                } else {
                    //для Original Balance: кінця рядка
                    editBook = editBook.concat("\\r\\n");
                    editBook = editBook.replaceAll(".00 ", ".00");
                    bal = Double.parseDouble(word);
                }
                //щоб перевіряти лишні пробіли
                editBook = editBook.replace("\\r\\n ", "\\r\\n");
            }
        }
        editBook = editBook.replaceAll(" {2}", " ");
        editBook = editBook.concat(String.format("Total expense  %.2f\\r\\nAverage expense  %.2f", (constBal - bal), (constBal - bal) / count));
        return editBook;
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        double rainfall = 0;
        double count = 0;
        String[] citiesFromStrng = strng.split("\n");
        for (String city : citiesFromStrng) {
            String[] words = city.split("\\s*(\\s|,|!|:)\\s*");
            if (town.equalsIgnoreCase(words[0])) {
                for (String word : words) {
                    if (word.matches("\\d*(\\.)\\d")) {
                        rainfall = rainfall + Double.parseDouble(word);
                        count++;
                    }
                }
            }
        }
        return rainfall / count;
    }

    @Override
    public double variance(String town, String strng) {
        double rainfall = 0;
        double count = 0;
        ArrayList<Double> rainfalls = new ArrayList<Double>();
        String[] citiesFromStrng = strng.split("\n");
        for (String city : citiesFromStrng) {
            String[] words = city.split("\\s*(\\s|,|!|:)\\s*");
            if (town.equalsIgnoreCase(words[0])) {
                for (String word : words) {
                    if (word.matches("\\d*(\\.)\\d")) {
                        rainfall = rainfall + Double.parseDouble(word);
                        rainfalls.add(Double.parseDouble(word));
                        count++;
                    }
                }
            }
        }
        double avg = rainfall / count;
        double variance = 0.00;
        for (Double rain : rainfalls) {
            variance = variance + (Math.pow((rain - avg), 2) / count);
        }
        return variance;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        int[] quantityOfBooks = new int[lstOf1stLetter.length];
        boolean[] haveBooksBeenUsed = new boolean[lstOfArt.length];
        Arrays.fill(haveBooksBeenUsed, false);
        Arrays.fill(quantityOfBooks, 0);

        for (int i = 0; i < quantityOfBooks.length; i++) {
            for (int j = 0; j < lstOfArt.length; j++) {
                String[] litersAndAmount = lstOfArt[j].split(" ");
                String[] liters = litersAndAmount[0].split("");
                boolean newLiter = true;
                for (String liter : liters) {
                    if (liter.equals(lstOf1stLetter[i]) && newLiter && !haveBooksBeenUsed[j]) {
                        quantityOfBooks[i] += Integer.parseInt(litersAndAmount[1]);
                        newLiter = false;
                        haveBooksBeenUsed[j] = true;
                    }
                }
            }
        }
        return String.format("(A : %d) - (B : %d)", quantityOfBooks[0], quantityOfBooks[1]);
    }
}
