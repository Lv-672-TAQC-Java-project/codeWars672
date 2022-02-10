package com.org.ita.kata.implementation.PopenkoI;

import com.org.ita.kata.Six;

import java.util.ArrayList;
import java.util.Arrays;

public class SixImpl implements Six {
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
        return  x / (1 + Math.sqrt(1 + x));
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
