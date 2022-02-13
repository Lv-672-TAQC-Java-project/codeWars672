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

    public void runTaskSmallest (){
        System.out.println("Run task Smallest");
        System.out.println("Enter a long number: ");
        long input =  consoleScanner.readLong();
        long[] result = user.getImplFive().smallest(input);
        System.out.println(String.format("Result: %s", Arrays.toString(result)));
    }

    public void runTaskSolveSum (){
        System.out.println("Run task 'Which x for that sum?'");
        System.out.println("Enter double: ");
        double input =  consoleScanner.readDouble();
        double result = user.getImplFive().solveSum(input);
        System.out.println(String.format("Result: %f", result));
    }

    public void runTaskZeros (){
        System.out.println("Run task Zeros");
        System.out.println("Enter integer: ");
        int input =  consoleScanner.readInt();
        int result = user.getImplFive().zeros(input);
        System.out.println(String.format("Result: %d", result));
    }

    public void runTaskArtificialRain (){
        System.out.println("Run task ArtificialRain");
        System.out.println("Enter array of integers");
        int[] inputArray =  consoleScanner.readArrayInt();
        int result = user.getImplFive().artificialRain(inputArray);
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

    public void runTaskMpgToKPM () {
        System.out.println("Run task mpgToKPM");
        System.out.println("Enter float:");
        float input = consoleScanner.readFloat();
        float result = user.getImplEight().mpgToKPM(input);
        System.out.println(String.format("Result: %.2f", result));

    }

}
