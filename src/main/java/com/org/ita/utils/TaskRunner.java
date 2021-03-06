package com.org.ita.utils;

import java.math.BigInteger;
import java.util.Arrays;

public class TaskRunner {
    private final Users user;
    private final ConsoleScanner consoleScanner;

    public TaskRunner(Users user) {
        this.user = user;
        this.consoleScanner = new ConsoleScanner();
    }

    public void runTask(int idTask) {
        switch (idTask) {
            case 1:
                runTaskLiters();
                break;
            case 2:
                runTaskGetVolumeOfCuboid();
                break;
            case 3:
                runTaskMpgToKPM();
                break;
            case 4:
                runTaskSquareOrSquareRoot();
                break;
            case 5:
                runTaskCountPositivesSumNegatives();
                break;
            case 6:
                runTaskStringToNumber();
                break;
            case 7:
                runTaskAmIWilson();
                break;
            case 8:
                runTaskTwoDecimalPlaces();
                break;
            case 9:
                runTaskDivisibleBy();
                break;
            case 10:
                runTaskNewAvg();
                break;
            case 11:
                runTaskSeriesSum();
                break;
            case 12:
                runTaskWhereIsHe();
                break;
            case 13:
                runTaskFindNb();
                break;
            case 14:
                runTaskBalance();
                break;
            case 15:
                runTaskF();
                break;
            case 16:
                runTaskMean();
                runTaskVariance();
                break;
            case 17:
                runTaskNbaCup();
                break;
            case 18:
                runTaskStockSummary();
                break;
            case 19:
                runTaskArtificialRain();
                break;
            case 20:
                runTaskGap();
                break;
            case 21:
                runTaskZeros();
                break;
            case 22:
                runTaskPerimeter();
                break;
            case 23:
                runTaskSolveSum();
                break;
            case 24:
                runTaskSmallest();
                break;
        }
    }

    private void runTaskLiters() {
        System.out.println("Run task Liters");
        System.out.println("Enter double:");
        double input = consoleScanner.readDouble();
        int result = user.getImplEight().liters(input);
        System.out.println(String.format("Result: %d", result));
    }

    public void runTaskNbaCup() {
        System.out.println("Run task Ranking NBA teams");
        System.out.println("Enter the results sheet (name1_scored_name2_scored): ");
        String inputResultsSheet = consoleScanner.readString();
        System.out.println("Enter the name of a team: ");
        String inputToFind = consoleScanner.readString();
        String result = user.getImplSix().nbaCup(inputResultsSheet, inputToFind);
        System.out.println(String.format("Result: %s", result));
    }

    public void runTaskStockSummary() {
        System.out.println("Run task Stock Summary");
        System.out.println("Enter array of strings (X+ 0+): ");
        String[] inputStockList = consoleScanner.readStringArray();
        System.out.println("Enter a character (X): ");
        String[] inputCharacter = consoleScanner.readStringArray();
        String result = user.getImplSix().stockSummary(inputStockList, inputCharacter);
        System.out.println(String.format("Result: %s", result));
    }

    public void runTaskGap() {
        System.out.println("Run task Gap");
        System.out.println("Enter a gap: ");
        int input = consoleScanner.readInt();
        System.out.println("Enter the range \nStart: ");
        long input2 = consoleScanner.readLong();
        System.out.println("End: ");
        long input3 = consoleScanner.readLong();
        long[] result = user.getImplFive().gap(input, input2, input3);
        System.out.println(String.format("Result: %s", Arrays.toString(result)));
    }

    public void runTaskPerimeter() {
        System.out.println("Run task Perimeter");
        System.out.println("Enter a big integer: ");
        BigInteger input = consoleScanner.readBigInteger();
        BigInteger result = user.getImplFive().perimeter(input);
        System.out.println(String.format("Result: %d", result));
    }

    public void runTaskSmallest() {
        System.out.println("Run task Smallest");
        System.out.println("Enter a long number: ");
        long input = consoleScanner.readLong();
        long[] result = user.getImplFive().smallest(input);
        System.out.println(String.format("Result: %s", Arrays.toString(result)));
    }

    public void runTaskSolveSum() {
        System.out.println("Run task 'Which x for that sum?'");
        System.out.println("Enter double: ");
        double input = consoleScanner.readDouble();
        double result = user.getImplFive().solveSum(input);
        System.out.println(String.format("Result: %f", result));
    }

    public void runTaskZeros() {
        System.out.println("Run task Zeros");
        System.out.println("Enter integer: ");
        int input = consoleScanner.readInt();
        int result = user.getImplFive().zeros(input);
        System.out.println(String.format("Result: %d", result));
    }

    public void runTaskArtificialRain() {
        System.out.println("Run task ArtificialRain");
        System.out.println("Enter array of integers");
        int[] inputArray = consoleScanner.readArrayInt();
        int result = user.getImplFive().artificialRain(inputArray);
        System.out.println(String.format("Result: %d", result));
    }

    public void runTaskGetVolumeOfCuboid() {
        System.out.println("Run task GetVolumeOfCuboid");
        System.out.println("Please enter length (double): ");
        double length = consoleScanner.readDouble();
        System.out.println("Please enter width (double): ");
        double width = consoleScanner.readDouble();
        System.out.println("Please enter height (double): ");
        double height = consoleScanner.readDouble();
        double result = user.getImplEight().getVolumeOfCuboid(length, width, height);
        System.out.println(String.format("Result: %.2f", result));
    }

    public void runTaskDivisibleBy() {
        System.out.println("Run task divisibleBy");
        int[] inputArr = consoleScanner.readArrayInt();
        System.out.println("Enter the divider(integer):");
        int inputDivider = consoleScanner.readInt();
        int[] result = user.getImplEight().divisibleBy(inputArr, inputDivider);
        System.out.println(Arrays.toString(result));
    }

    public void runTaskTwoDecimalPlaces() {
        System.out.println("Run task twoDecimalPlaces");
        System.out.println("Enter double to round its fractional part to 2 digits :");
        double input = consoleScanner.readDouble();
        double result = user.getImplEight().twoDecimalPlaces(input);
        System.out.println(result);
        System.out.println(String.format("Result: %.2f", result));
        System.out.println(result);
    }

    public void runTaskAmIWilson() {
        System.out.println("Run task amIWilson");
        System.out.println("Enter double to check whether it is a prime number:");
        double input = consoleScanner.readDouble();
        boolean result = user.getImplEight().amIWilson(input);
        System.out.println("isPrime = " + result);
    }


    public void runTaskStringToNumber() {
        System.out.println("Run task stringToNumber");
        System.out.println("Enter any integer or string, containing integer:");
        String input = consoleScanner.readString();
        input = input.replaceAll("\\D+", "");
        try {
            int result = user.getImplEight().stringToNumber(input);
            System.out.println(String.format("Result: %d", result));
        } catch (NumberFormatException e) {
            System.out.println("Error! String must contain integers!");
        }
    }

    public void runTaskCountPositivesSumNegatives() {
        System.out.println("Run task countPositivesSumNegatives");
        int[] input = consoleScanner.readArrayInt();
        int[] result = user.getImplEight().countPositivesSumNegatives(input);
        System.out.println(Arrays.toString(result));
    }

    public void runTaskSquareOrSquareRoot() {
        System.out.println("Run task squareOrSquareRoot");
        int[] input = consoleScanner.readArrayInt();
        int[] result = user.getImplEight().squareOrSquareRoot(input);
        System.out.println(Arrays.toString(result));
    }

    public void runTaskMpgToKPM() {
        System.out.println("Run task mpgToKPM");
        System.out.println("Enter float:");
        float input = consoleScanner.readFloat();
        float result = user.getImplEight().mpgToKPM(input);
        System.out.println(String.format("Result: %.2f", result));
    }

    public void runTaskNewAvg() {
        System.out.println("Run task newAvg");
        double[] arr = consoleScanner.readDoubleArray();
        System.out.println("Enter targeted average");
        long result = -1;
        while (result <= 0) {
            double navg = consoleScanner.readDouble();
            result = user.getImplSeven().newAvg(arr, navg);
        }
        System.out.println(String.format("Result: %d", result));
    }

    public void runTaskSeriesSum() {
        System.out.println("Run task seriesSum");
        System.out.println("Element number of the series");
        int n = consoleScanner.readInt();
        String result = user.getImplSeven().seriesSum(n);
        System.out.println(String.format("Result: %s", result));
    }

    public void runTaskWhereIsHe() {
        System.out.println("Run task whereIsHe");
        System.out.println("Total amount of people in the line");
        int p = consoleScanner.readInt();
        System.out.println("Number of people standing in front of him");
        int bef = consoleScanner.readInt();
        System.out.println("Number of people standing behind him");
        int aft = consoleScanner.readInt();
        int result = user.getImplSeven().whereIsHe(p, bef, aft);
        System.out.println(String.format("Result: %d", result));
    }

    public void runTaskFindNb() {
        System.out.println("Run task findNb");
        System.out.println("Volume of the building");
        long volume = consoleScanner.readLong();
        long result = user.getImplSix().findNb(volume);
        System.out.println(String.format("Result: %d", result));
    }

    public void runTaskBalance() {
        System.out.println("Run task balance");
        System.out.println("Check book");
        String[] bookRecords = consoleScanner.readStringArray();
        String book = arrayToString(bookRecords);
        String result = user.getImplSix().balance(book);
        System.out.println(String.format("Result: %s", result));
    }

    public void runTaskF() {
        System.out.println("Run task f");
        System.out.println("Argument of the function");
        double argument = consoleScanner.readDouble();
        double result = user.getImplSix().f(argument);
        System.out.println(String.format("Result: %f", result));
    }

    public void runTaskMean() {
        System.out.println("Run task mean");
        System.out.println("Town");
        String town = consoleScanner.readString();
        System.out.println("Data");
        String[] records = consoleScanner.readStringArray();
        String data = arrayToString(records);
        double result = user.getImplSix().mean(town, data);
        System.out.println(String.format("Result: %f", result));
    }

    public void runTaskVariance() {
        System.out.println("Run task mean");
        System.out.println("Town");
        String town = consoleScanner.readString();
        System.out.println("Data");
        String[] records = consoleScanner.readStringArray();
        String data = arrayToString(records);
        double result = user.getImplSix().mean(town, data);
        System.out.println(String.format("Result: %f", result));
    }

    private String arrayToString(String[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i] + "\n";
        }
        return result;
    }
}
