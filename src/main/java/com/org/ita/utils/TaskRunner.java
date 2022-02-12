package com.org.ita.utils;

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
}
