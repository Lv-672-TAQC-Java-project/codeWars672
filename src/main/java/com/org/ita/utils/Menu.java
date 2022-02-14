package com.org.ita.utils;


public class Menu {
    private final ConsoleScanner consoleScanner = new ConsoleScanner();
    Users user;

    public void printMenu() {
        int choose;
        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("----------------------MENU---------------------------------------------------");
            System.out.println("Press 1 List of implementations");
            System.out.println("Press 2 List of tasks");
            System.out.println("Press 3 Choose a user");
            System.out.println("Press 4 Run the task");
            System.out.println("Press 0 Exit");
            System.out.println();
            System.out.println("Please make your choice:");

            choose = consoleScanner.readInt();
            switch (choose) {
                case 1:
                    System.out.println("List of implementations : ");
                    Users.printAllUserName();
                    break;
                case 2:
                    System.out.println("List of tasks : ");
                    Tasks.printAllTaskName();
                    break;
                case 3:
                    System.out.println("Please choose a user by id : ");
                    choose = consoleScanner.readInt();
                    user = Users.getById(choose);
                    System.out.println("Your user is : " + user.getName());
                    break;
                case 4:
                    System.out.println("Please choose a task by id : ");
                    choose = consoleScanner.readInt();
                    if (user != null) {
                        new TaskRunner(user).runTask(choose);
                    } else {
                        System.out.println("Please, firstly choose a user. Press 3 !");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Incorrect! Please make your choice from 1 till 4 and 0 to exit.");
                    break;
            }
        }
    }
}
