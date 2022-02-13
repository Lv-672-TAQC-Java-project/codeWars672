package com.org.ita.utils;


public class Menu {
    private final ConsoleScanner consoleScanner = new ConsoleScanner();
    Users users;

    public void printMenu() {

        int choose;

        while (true) {
            System.out.println("----------------------MENU---------------------------------------------------");
            System.out.println("Press 1 List of implementations");
            System.out.println("Press 2 List of tasks");
            System.out.println("Press 3 Choose a user implementation");
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
                case 3:
                    System.out.println("Please choose a user:");
                    choose = consoleScanner.readInt();
                    users = Users.getById(choose);
                    System.out.println("Your user is : " + users.getName());
                    break;
                case 4:
                    System.out.println("Please choose a task:");
                    choose = consoleScanner.readInt();
                case 0:
                    return;
            }
        }
    }
}
