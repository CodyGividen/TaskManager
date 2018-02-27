package com.company;

import java.util.Scanner;

public class TaskManagerMenu{
    protected Scanner input1 = new Scanner(System.in);
    private TaskInformation taskInformation = new TaskInformation();

    public void taskManagerMenu() {
        System.out.println("Welcome to your TaskManager. \n" +
                " What would you like to do? \n" +
                " 1. Add task \n " +
                "2. remove task \n" +
                " 3. View tasks \n" +
                " 4. Add task to complete list \n" +
                " 5. view incomplete tasks \n" +
                " 6. View complete tasks \n" +
                " 7. exit");
        switch (input1.nextInt()) {
            case 1:
                //System.out.println("");
                //TaskInformation taskInformation = new TaskInformation();
                taskInformation.addTask();
                taskManagerMenu();
                break;
            case 2:
                System.out.println("What task would you like to remove?");
                taskInformation.viewTask();
                taskInformation.removeTask();
                taskManagerMenu();
                break;
            case 3:
                System.out.println("Here are your incomplete tasks.");
                taskInformation.viewTask();
                System.out.println("Here are your complete tasks.");
                taskInformation.selectViewTasks();
                taskManagerMenu();
                break;
            case 4:
                System.out.println("What task would you like to add to your complete tasks.");
                taskInformation.addCompleteList();
                taskManagerMenu();
                break;
            case 5:
                System.out.println("Here are your incomplete tasks.");
                taskInformation.addIncompleteList();
                taskManagerMenu();
                break;
            case 6:
                System.out.println("Here are your complete tasks.");
                taskInformation.selectViewTasks();
                taskManagerMenu();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Please input a real number 1 to 4!!! Stop playing games!!");
                taskManagerMenu();
                break;



        }

    }
}
