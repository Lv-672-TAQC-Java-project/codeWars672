package com.org.ita.utils;

import java.math.BigInteger;

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

    public void runTaskPerimeter (){
        System.out.println("Run task Perimeter");
        System.out.println("Enter a big integer: ");
        BigInteger input =  consoleScanner.readBigInteger();
        BigInteger result = user.getImplFive().perimeter(input);
        System.out.println(String.format("Result: %d", result));
    }
}
