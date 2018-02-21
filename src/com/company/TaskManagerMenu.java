package com.company;

import java.util.Scanner;

public class TaskManagerMenu{
    protected Scanner input1 = new Scanner(System.in);
    TaskInformation taskInformation = new TaskInformation();

    public void taskManagerMenu() {
        System.out.println("Welcome to your TaskManager. \n" +
                " What would you like to do? \n" +
                " 1. Add task \n " +
                "2. remove task \n" +
                " 3. View tasks \n" +
                " 4. Select and view task \n" +
                " 5. Add task to complete list \n" +
                " 6. view incomplete tasks \n" +
                " 7. View complete tasks \n" +
                " 8. exit");
        switch (input1.nextInt()) {
            case 1:
                //System.out.println("");
                //TaskInformation taskInformation = new TaskInformation();
                taskInformation.addTask();
                taskManagerMenu();
                break;
            case 2:
                System.out.println("What task would you like to remove?");
                taskManagerMenu();
                break;
            case 3:
                System.out.println("Here are your tasks.");
                taskInformation.viewTask();
                taskManagerMenu();
                break;
            case 4:
                System.out.println("Select a task you would like to view.");
                taskManagerMenu();
                break;
            case 5:
                System.out.println("What task would you like to add to your complete tasks.");
                break;
            case 6:
                System.out.println("Here are your incomplete tasks.");
                break;
            case 7:
                System.out.println("Here are your complete tasks.");
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Please input a real number 1 to 4!!! Stop playing games!!");
                taskManagerMenu();
                break;



        }

    }
}
