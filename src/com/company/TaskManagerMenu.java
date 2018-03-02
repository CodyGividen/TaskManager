package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskManagerMenu {
    private Scanner input1 = new Scanner(System.in);
    private TaskInformation taskInformation = new TaskInformation();
    public static ConsoleColors consoleColors = new ConsoleColors();

    public void taskManagerMenu() {
        try {
            System.out.println(ConsoleColors.GREEN + ConsoleColors.GREEN_BOLD + ConsoleColors.GREEN_UNDERLINED + "Welcome to your TaskManager\n" + ConsoleColors.RESET + ConsoleColors.YELLOW +
                    " What would you like to do? \n" + ConsoleColors.RESET + ConsoleColors.CYAN +
                    " 1. Add task \n" +
                    " 2. remove task \n" +
                    " 3. View all tasks \n" +
                    " 4. Add task to complete list \n" +
                    " 5. view incomplete tasks \n" +
                    " 6. View complete tasks \n" +
                    " 7. Edit a task \n" +
                    " 8. Exit" + ConsoleColors.RESET);
            //Main Menu
            switch (input1.nextInt()) {
                case 1://Add Task
                    //System.out.println("");
                    //TaskInformation taskInformation = new TaskInformation();
                    taskInformation.addTask();
                    taskManagerMenu();
                    break;
                case 2://Remove Task
                    System.out.println(ConsoleColors.YELLOW + "What task would you like to remove?" + ConsoleColors.RESET);
                    taskInformation.viewTask();
                    taskInformation.removeTask();
                    taskManagerMenu();
                    break;
                case 3://View All Tasks
                    System.out.println(ConsoleColors.GREEN + ConsoleColors.GREEN_BOLD + ConsoleColors.GREEN_UNDERLINED + "----Here are your incomplete tasks----" + ConsoleColors.RESET);
                    taskInformation.viewTask();
                    System.out.println(ConsoleColors.GREEN + ConsoleColors.GREEN_BOLD + ConsoleColors.GREEN_UNDERLINED + "----Here are your complete tasks----" + ConsoleColors.RESET);
                    taskInformation.selectViewTasks();
                    taskManagerMenu();
                    break;
                case 4://Add task to complete list
                    System.out.println(ConsoleColors.YELLOW + "What task would you like to add to your complete tasks?" + ConsoleColors.RESET);
                    taskInformation.addCompleteList();
                    taskManagerMenu();
                    break;
                case 5:// view incomplete list
                    System.out.println(ConsoleColors.GREEN + ConsoleColors.GREEN_BOLD + ConsoleColors.GREEN_UNDERLINED + "----Here are your incomplete tasks----" + ConsoleColors.RESET);
                    taskInformation.addIncompleteList();
                    taskManagerMenu();
                    break;
                case 6://View Complete list
                    System.out.println(ConsoleColors.GREEN + ConsoleColors.GREEN_BOLD + ConsoleColors.GREEN_UNDERLINED + "----Here are your complete tasks----" + ConsoleColors.RESET);
                    taskInformation.selectViewTasks();
                    taskManagerMenu();
                    break;
                case 7:// Edit a task
                    System.out.println(ConsoleColors.GREEN + ConsoleColors.GREEN_BOLD + ConsoleColors.GREEN_UNDERLINED + "----Here are your incomplete tasks----" + ConsoleColors.RESET);
                    taskInformation.viewTask();
                    taskInformation.editTask();
                    taskManagerMenu();
                    break;
                case 8:// Exit
                    System.exit(0);
                    break;
                default://Error
                    System.out.println(ConsoleColors.RED + ConsoleColors.RED_BOLD + "Please input a real number 1 to 4!!! Stop playing games!!" + ConsoleColors.RESET);
                    taskManagerMenu();
                    break;
            }

            }catch (InputMismatchException ime){
            System.out.println(ConsoleColors.RED + ConsoleColors.RED_BOLD + "Try Again" + ConsoleColors.RESET);
            input1.nextLine();
            taskManagerMenu();
        }
    }
}
