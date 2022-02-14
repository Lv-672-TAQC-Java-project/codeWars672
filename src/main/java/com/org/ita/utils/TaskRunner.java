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

    public void runTaskNbaCup (){
        System.out.println("Run task Ranking NBA teams");
        System.out.println("Enter the results sheet (name1_scored_name2_scored): ");
        String inputResultsSheet =  consoleScanner.readString();
        System.out.println("Enter the name of a team: ");
        String inputToFind = consoleScanner.readString();
        String result = user.getImplSix().nbaCup(inputResultsSheet,inputToFind);
        System.out.println(String.format("Result: %s", result));
    }
}
