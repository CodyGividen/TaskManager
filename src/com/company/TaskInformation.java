package com.company;


import java.util.ArrayList;
import java.util.List;

public class TaskInformation extends Tasks {
    protected static List<TaskInformation> newTask = new ArrayList<TaskInformation>();
    protected final List<TaskInformation> completedTasks = new ArrayList<TaskInformation>();
    private static TaskInformation taskInformation = new TaskInformation();


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
                        "Finish by date: " + task.getFinishByDate() + "\n " +
                        "finish date:" + task.getDate());
            }
        }
    }
    protected void addIncompleteList() {
            viewTask();

        }
    protected void addCompleteList(){
//        TaskInformation taskInformation = new TaskInformation();
        viewTask();
        System.out.println("What task would you like to at to complete?");
        completedTasks.add(taskInformation);
        newTask.remove(input.nextInt() - 1);

    }
}
