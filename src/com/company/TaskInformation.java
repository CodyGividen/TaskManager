package com.company;


import java.util.ArrayList;
import java.util.List;

public class TaskInformation extends Tasks {
    protected static List<TaskInformation> newTask = new ArrayList<TaskInformation>();
    protected List<TaskInformation> completedTasks = new ArrayList<TaskInformation>();
    protected List<TaskInformation> incompleteTasks = new ArrayList<TaskInformation>();


    protected void addTask() {
        TaskInformation taskInformation = new TaskInformation();
        taskInformation.setTitle();
        taskInformation.setDetails();
        taskInformation.setDate();
        taskInformation.setFinishByDate();
        newTask.add(taskInformation);

    }

    protected void removeTask() {

    }

    protected void viewTask() {
        int index = 1;
        for (Tasks task : newTask) {
            System.out.println(index++ + ". " + task.getTitle() + "\n" +
                    "" + task.getDetails() + "\n" +
                    "" + task.getDate() + "\n" +
                    "" + task.getFinishByDate());

        }
//    protected void selectViewTasks(){
//
//    }
//    protected void addIncompleteList(){
//
//    }
//    protected void addCompleteList(){
//
//    }
    }
}
