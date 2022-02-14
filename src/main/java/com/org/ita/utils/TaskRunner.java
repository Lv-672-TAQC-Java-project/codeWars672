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

    public void runTaskStockSummary (){
        System.out.println("Run task Stock Summary");
        System.out.println("Enter array of strings (X+ 0+): ");
        String[] inputStockList =  consoleScanner.readStringArray();
        System.out.println("Enter a character (X): ");
        String[] inputCharacter =  consoleScanner.readStringArray();
        String result = user.getImplSix().stockSummary(inputStockList,inputCharacter);
        System.out.println(String.format("Result: %s", result));
    }
}
