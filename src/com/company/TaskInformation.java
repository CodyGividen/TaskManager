package com.company;


import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskInformation  {
    protected static List<Tasks> newTask = new ArrayList<Tasks>();
    protected final List<Tasks> completedTasks = new ArrayList<Tasks>();
    private static TaskInformation taskInformation = new TaskInformation();
    private Scanner scanner = new Scanner(System.in);



//Add A task
    protected void addTask() {
        Tasks task = new Tasks();
        newTask.add(task);
    }

//Remove a task
    protected void removeTask() {
        newTask.remove(scanner.nextInt() - 1);

    }
//View All Tasks
    protected void viewTask() {
        if (newTask.isEmpty()) {
            System.out.println(ConsoleColors.RED + "You have no incomplete tasks at the moment." + ConsoleColors.RESET);
        } else {
            int index = 1;
            for (Tasks task : newTask) {
                System.out.println(ConsoleColors.PURPLE + index++ + ". Title: " + task.getTitle() + "\n" +
                        "Details: " + task.getDetails() + "\n" +
                        "Start date: " + task.getDate() + "\n" +
                        "Finish by date: " + task.getMonth() + "/" + task.getDay() + ConsoleColors.RESET + ConsoleColors.RED + "\n---------------------------------------" + ConsoleColors.RESET);
            }
        }
    }
//View Completed Tasks
    protected void selectViewTasks() {
        if (completedTasks.isEmpty()) {
            System.out.println(ConsoleColors.RED + "You have no tasks complete." + ConsoleColors.RESET);
        } else {
            int index = 1;
            for (Tasks task : completedTasks) {
                System.out.println(ConsoleColors.PURPLE + index++ + ". Title: " + task.getTitle() + "\n" +
                        "Details: " + task.getDetails() + "\n" +
                        "Start date: " + task.getDate() + "\n" +
                        "Finish by date: " + task.getFinishByDate() + ConsoleColors.RESET + ConsoleColors.RED + "\n---------------------------------------" + ConsoleColors.RESET);
            }
        }
    }
//Show Incomplete List
    protected void addIncompleteList() {
        viewTask();

    }
//Add A Task to the complete list
    protected void addCompleteList() {
        viewTask();
        System.out.println(ConsoleColors.YELLOW + "What task would you like to at to complete?" + ConsoleColors.RESET);
        int complete = scanner.nextInt();
        Tasks task = newTask.get(complete - 1);
        completedTasks.add(task);
        newTask.remove(complete - 1);

    }
//Edit A Task
    protected void editTask() {

        System.out.println(ConsoleColors.YELLOW + "What task would you like to Edit?" + ConsoleColors.RESET);
        int edit = scanner.nextInt();

        System.out.println(ConsoleColors.YELLOW + "What would you like to edit in your task? \n " + ConsoleColors.RESET + ConsoleColors.CYAN +
                "1. Title \n " +
                "2. Details \n " +
                "3. Finish By Date \n " +
                "4. Exit Editor" + ConsoleColors.RESET);
        int selection = scanner.nextInt();
        scanner.nextLine();
        switch (selection) {//Menu for edit title, details, finish date, exit
            case 1://edit a title
                newTask.get(edit - 1).setTitle();
                break;
            case 2://edit the details
                newTask.get(edit - 1).setDetails();
                break;
            case 3://edit the finish date
                newTask.get(edit - 1).setFinishByDate();
                break;
            case 4://Exit to Main menu
                break;
            default://Error
            System.out.println(ConsoleColors.RED + ConsoleColors.RED_BOLD + "Try again!!" + ConsoleColors.RESET);
                break;
        }
        tryAgainOrExit();

    }
//Edit another task or exit to main menu
    private void tryAgainOrExit() {
        System.out.println(ConsoleColors.YELLOW + "Would you like to edit something else?" + ConsoleColors.CYAN + "\n Y or N" + ConsoleColors.RESET);
        switch (scanner.nextLine().toUpperCase())
        {
            case "Y"://edit another section of a task and select another task to edit
                viewTask();
                editTask();
                break;
            case "N"://exit to Main Menu
                break;
            default://Error
                System.out.print(ConsoleColors.RED + ConsoleColors.RED_BOLD + "Really!!! Come on./n Type " + ConsoleColors.RESET + ConsoleColors.CYAN + " Y or N." + ConsoleColors.RESET);
                tryAgainOrExit();
        }
    }
}
