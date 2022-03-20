package com.org.ita.kata.implementation.IrynaRybak;

import com.org.ita.kata.Base;
import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiveImpl extends Base implements Five {
    public static boolean isPrime(long num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int artificialRain(int[] v) {
        int[] rightResult = rightFlow(v);
        int[] leftResult = leftFlow(v);

        System.out.println(Arrays.toString(rightResult));
        System.out.println(Arrays.toString(leftResult));

        int maxSections = 0;
        for (int i = 0; i < v.length - 1; i++) {
            maxSections = Math.max(rightResult[i] + leftResult[i] + 1, maxSections);
        }
        return maxSections;
    }

    private static int[] rightFlow(int[] numbers){
        int[] rightArray = new int[numbers.length];

        int rightCount = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = i; j <= numbers.length - 1; j++) {
                if (j < numbers.length - 1 && numbers[j] >= numbers[j + 1]) {
                    rightCount++;
                } else {
                    break;
                }
            }
            rightArray[i] = rightCount;
            rightCount = 0;
        }
        return rightArray;
    }

    private static int[] leftFlow(int[] numbers){
        int[] leftArray = new int[numbers.length];
        int leftCount = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (j > 0 && numbers[j] >= numbers[j - 1]) {
                    leftCount++;
                } else {
                    break;
                }
            }
            leftArray[i] = leftCount;
            leftCount = 0;
        }
        return leftArray;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        List<Long> listNumbers = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                listNumbers.add(i);
            }
        }
        for (int i = 0; i < listNumbers.size() - 1; i++) {
            long diff = listNumbers.get(i + 1) - listNumbers.get(i);
            if (diff == g) {
                return new long[]{listNumbers.get(i), listNumbers.get(i + 1)};
            }

        }
        return null;
    }

    @Override
    public int zeros(int n) {
        String numbers = factorial(n).toString();
        int count = 0;
        for (int i = numbers.length() - 1; i > 0; i--) {
            if (numbers.charAt(i) == '0') {
                count = count + 1;
            } else {
                break;
            }
        }
        return count;
    }

    public static BigInteger factorial(int t) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= t; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return Fibonacci(n).multiply(BigInteger.valueOf(4));
    }

    public BigInteger Fibonacci(BigInteger i) {
        BigInteger current = BigInteger.ONE;
        BigInteger previous = BigInteger.ZERO;
        BigInteger sum = BigInteger.ONE;
        for (int step = 0; step < i.intValue(); step++) {
            BigInteger tmp = current.add(previous);
            previous = current;
            current = tmp;
            sum = sum.add(current);
        }
        return sum;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        String[] strArr = Long.toString(n).split("");
        int[] numArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        int min = numArr[1], pos = 1;
        for (int index = 2; index < numArr.length; index++) {
            if (numArr[index] < min) {
                min = numArr[index];
                pos = index;
            }
        }

        int newposition = min <= numArr[0] ? 0 : 1;
        for (int step = newposition; step <= pos; step++) {
            int temp = numArr[step];
            numArr[step] = min;
            min = temp;
        }

        String result = "";
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 0 && pos == 1) {
                int tmp = pos;
                pos = newposition;
                newposition = tmp;
                continue;
            }
            result += numArr[i];
        }
        return new long[]{Long.parseLong(result), pos, newposition};
    }
}
