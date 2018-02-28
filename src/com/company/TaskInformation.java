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
//    private static Tasks tasks = new Tasks();




    protected void addTask() {
        //TaskInformation taskInformation = new TaskInformation();
        Tasks task = new Tasks();
        newTask.add(task);
    }


    protected void removeTask() {
        newTask.remove(scanner.nextInt() - 1);

    }

    protected void viewTask() {
        if (newTask.isEmpty()) {
            System.out.println("You have no incomplete tasks at the moment.");
        } else {
            int index = 1;
            for (Tasks task : newTask) {
                System.out.println(index++ + ". Title: " + task.getTitle() + "\n" +
                        "Details: " + task.getDetails() + "\n" +
                        "Start date: " + task.getDate() + "\n" +
                        "Finish by date: " + task.getFinishByDate());
            }
        }
    }

    protected void selectViewTasks() {
        if (completedTasks.isEmpty()) {
            System.out.println("You have no tasks complete.");
        } else {
            int index = 1;
            for (Tasks task : completedTasks) {
                System.out.println(index++ + ". Title: " + task.getTitle() + "\n" +
                        "Details: " + task.getDetails() + "\n" +
                        "Start date: " + task.getDate() + "\n" +
                        "Finish by date: " + task.getFinishByDate());
            }
        }
    }

    protected void addIncompleteList() {
        viewTask();

    }

    protected void addCompleteList() {
//        TaskInformation taskInformation = new TaskInformation();
        viewTask();
        System.out.println("What task would you like to at to complete?");
        int complete = scanner.nextInt();
        Tasks task = newTask.get(complete - 1);
        completedTasks.add(task);
        //taskInformation.setFinishedDate();
        newTask.remove(complete - 1);

    }

    protected void editTask() {

        System.out.println("What task would you like to Edit?");
        int edit = scanner.nextInt();

        System.out.println("What would you like to edit in your task? \n " +
                "1. Title \n " +
                "2. Details \n " +
                "3. Finish By Date \n " +
                "4. Exit Editor");
        int selection = scanner.nextInt();
        scanner.nextLine();
        switch (selection) {
            case 1:
                //System.out.println();
                newTask.get(edit - 1).setTitle();
                break;
            case 2:
                //System.out.println();
                newTask.get(edit - 1).setDetails();
                //editTask();
                break;
            case 3:
                // System.out.println();
                newTask.get(edit - 1).setFinishByDate();
                //editTask();
                break;
            case 4:
                break;
            default:
                System.out.println("Try again!!");
                //editTask();
                break;
        }
        tryAgainOrExit();

    }

    private void tryAgainOrExit() {
        System.out.println("Would you like to edit something else?  Y or N");
        switch (scanner.nextLine().toUpperCase())
        {
            case "Y":
                viewTask();
                editTask();
                break;
            case "N":
                break;
            default:
                System.out.print("Really!!! Come on try typing a Y or a N.");
                tryAgainOrExit();
        }
    }
}
