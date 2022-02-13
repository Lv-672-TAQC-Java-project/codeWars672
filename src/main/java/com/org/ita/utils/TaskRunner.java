package com.org.ita.utils;

import java.util.Arrays;

public class TaskRunner {
    private Users user ;
    private ConsoleScanner consoleScanner;

    public TaskRunner(Users user) {
        this.user = user;
        this.consoleScanner = new ConsoleScanner();
    }

    public void runTaskLiters (){
        System.out.println("Run task Liters");
        System.out.println("Enter double:");
        double input = consoleScanner.readDouble();
        int result = user.getImplEight().liters(input);
        System.out.println(String.format("Result: %d", result));
    }

    public void runTaskGap (){
        System.out.println("Run task Gap");
        System.out.println("Enter a gap: ");
        int input =  consoleScanner.readInt();
        System.out.println("Enter the range \nStart: ");
        long input2 =  consoleScanner.readLong();
        System.out.println("End: ");
        long input3 =  consoleScanner.readLong();
        long[] result = user.getImplFive().gap(input,input2,input3);
        System.out.println(String.format("Result: %s", Arrays.toString(result)));
    }
}
