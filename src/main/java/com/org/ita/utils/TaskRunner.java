package com.org.ita.utils;

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

    public void runTaskZeros (){
        System.out.println("Run task Zeros");
        System.out.println("Enter integer: ");
        int input =  consoleScanner.readInt();
        int result = user.getImplFive().zeros(input);
        System.out.println(String.format("Result: %d", result));
    }
}
