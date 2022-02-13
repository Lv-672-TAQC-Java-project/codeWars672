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

    public void runTaskSmallest (){
        System.out.println("Run task Smallest");
        System.out.println("Enter a long number: ");
        long input =  consoleScanner.readLong();
        long[] result = user.getImplFive().smallest(input);
        System.out.println(String.format("Result: %s", Arrays.toString(result)));
    }
}
