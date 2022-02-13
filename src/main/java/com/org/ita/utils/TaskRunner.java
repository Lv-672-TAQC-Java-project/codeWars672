package com.org.ita.utils;

import java.util.Arrays;

public class TaskRunner {
    private Users user ;
    private ConsoleScanner consoleScanner;

    public TaskRunner(Users user) {
        this.user = user;
        this.consoleScanner = new ConsoleScanner();
    }
    public void runTask (int idTask) {
        switch (idTask){
            case 1:
                runTaskLiters();
                break;
            case 2:
                runTaskGetVolumeOfCuboid();
                break;
            default:
                System.out.println("");
        }
    }

    private void runTaskLiters() {
        System.out.println("Run task Liters");
        System.out.println("Enter double:");
        double input = consoleScanner.readDouble();
        int result = user.getImplEight().liters(input);
        System.out.println(String.format("Result: %d", result));
    }

    public void runTaskGetVolumeOfCuboid () {
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

    public void runTaskStringToNumber () {
        System.out.println("Run task stringToNumber");
        System.out.println("Enter any integer or string, containing integer:");
        String input = consoleScanner.readString();
        input = input.replaceAll("\\D+","");
        try {
            int result = user.getImplEight().stringToNumber(input);
            System.out.println(String.format("Result: %d", result));
        } catch (NumberFormatException e) {
            System.out.println("Error! String must contain integers!");
        }
    }
}
