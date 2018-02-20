package com.company;

import java.util.Scanner;

public class TaskManagerMenu {
    protected Scanner input1 = new Scanner(System.in);

    public void taskManagerMenu() {
        System.out.println("Welcome to your TaskManager. \n What would you like to do");
        switch (input1.nextInt()) {
            case 1:

                taskManagerMenu();
                break;
            case 2:
                taskManagerMenu();
                break;
            case 3:
                taskManagerMenu();
                break;
            case 4:
                taskManagerMenu();
                break;
            default:
                System.out.println("Please input a real number 1 to 4!!! Stop playing games!!");
                taskManagerMenu();
                break;



        }

    }
}
