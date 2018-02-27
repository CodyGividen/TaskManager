package com.company;


import java.util.ArrayList;
import java.util.List;

public class TaskInformation extends Tasks {
    protected static List<TaskInformation> newTask = new ArrayList<TaskInformation>();
    protected final List<TaskInformation> completedTasks = new ArrayList<TaskInformation>();
    private static TaskInformation taskInformation = new TaskInformation();
    private static Tasks tasks = new Tasks();


    protected void addTask() {
        //TaskInformation taskInformation = new TaskInformation();
        taskInformation.setTitle();
        taskInformation.setDetails();
        taskInformation.setDate();
        taskInformation.setFinishByDate();
        newTask.add(taskInformation);
    }


    protected void removeTask() {
        newTask.remove(input.nextInt() - 1);

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
        completedTasks.add(taskInformation);
        //taskInformation.setFinishedDate();
        newTask.remove(input.nextInt() - 1);

    }

    protected void editTask() {
        System.out.println("What task would you like to Edit?");

        System.out.println("What would you like to edit in your task? \n " +
                "1. Title \n " +
                "2. Details \n " +
                "3. Finish By Date \n " +
                "4. Exit Editor");
        switch (input.nextLine()) {
            case "1":
                //System.out.println();
                taskInformation.setTitle();
                editTask();
                break;
            case "2":
                //System.out.println();
                taskInformation.setDetails();
                editTask();
                break;
            case "3":
               // System.out.println();
                taskInformation.setFinishByDate();
                editTask();
                break;
            case "4":
                break;
            default:
                System.out.println("Try again!!");
                editTask();
                break;
        }
    }
}
